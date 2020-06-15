// Final project 
// Zamorano Garcia Osvaldo Arturo
// Alexis Fernando Barraza Sierra

// Project content
// 1.- Objective: Comparison of the following performance machine learning algorithms
// - SVM
// - Decision three
// - Logistic regression
// - Multilayer perceptron
// With the following dataset: https://archive.ics.uci.edu/ml/datasets/Bank+Marketing


/////////////////////////////////////////////////////////
// Algorithm Linear Support Vector Machine Coefficients//
/////////////////////////////////////////////////////////

def svm():Unit={

import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}

// Possible mistakes
Logger.getLogger("org").setLevel(Level.ERROR)

// Session spark
val spark = SparkSession.builder().getOrCreate()

// Load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

// To view data types
// df.printSchema()
// df.show(1)

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")
val features = assembler.transform(df)

// We modify the column "y" which is the output variable
// this indicates if the client will sign a term deposit
// how it will be classified based on this it has to be converted to numeric
// stringindexer will create a new column with the values ​​of "and" but in numeric
// being "0.0" for "no" and "1.0" for "yes"

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(features).transform(features)

// To display data to see label and facts
// dataIndexed.show(100)

// Algorithm svm  Coefficients

val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)

// Fit the model
val lsvcModel = lsvc.fit(dataIndexed)

println("\nAlgorithm Linear Support Vector Machine\n")

// Print the coefficients and intercept for linear svc
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")

}

// Run svm algorithm
svm()

//////////////////////////////////////////////////////
// Algorithm Linear Support Vector Machine Accuracy //
//////////////////////////////////////////////////////

def svma():Unit={

import org.apache.spark.mllib.classification.{SVMModel, SVMWithSGD}
import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics
import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.ml.feature.{VectorAssembler, StringIndexer,VectorIndexer, OneHotEncoder}
import org.apache.spark.ml.Pipeline
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.sql.SparkSession
import org.apache.log4j._

// Possible mistakes
Logger.getLogger("org").setLevel(Level.ERROR)

// Session spark
val spark = SparkSession.builder().getOrCreate()

// Load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

// To see data types
// df.printSchema()
// df.show(1)

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")

// We modify the column "y" which is the output variable
// this indicates if the client will sign a term deposit
// how it will be classified based on this it has to be converted to numeric
// stringindexer will create a new column with the values ​​of "and" but in numeric
// being "0.0" for "no" and "1.0" for "yes"

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")

// Algorithm svm accuracy //

// We divide the data into an array into parts of 70% and 30%
val Array(training, test) = df.randomSplit(Array(0.7, 0.3), seed = 11L)

// We use linearSVC with the fectures and the label of our dataset
val lsvc = new LinearSVC().setLabelCol("label").setFeaturesCol("features").setPredictionCol("prediction").setMaxIter(10).setRegParam(0.1)

// A new pipeline is created with the elements: labelIndexer,assembler,lsvc
val pipeline = new Pipeline().setStages(Array(labelIndexer,assembler,lsvc))

// Fit the model
val model = pipeline.fit(training)

// Results are taken in the Test set with transform
val result = model.transform(test)

// Results in the set Test with transform
val predictionAndLabels = result.select("prediction", "label")

// Convert test results to RDD using .as and .rdd
val predictionAndLabelsrdd = result.select($"prediction",$"label").as[(Double, Double)].rdd

println("\nAlgorithm Linear Support Vector Machine Accuracy\n")

// Initialize a MulticlassMetrics object
val metrics = new MulticlassMetrics(predictionAndLabelsrdd)

// Print algorithm accuracy
println("Accuracy:")
println(metrics.accuracy)

}
// Run svma
svma()


//////////////////////////////
// Algorithm Decision Three //
//////////////////////////////

def dtre():Unit={
    
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}

// Possible mistakes
Logger.getLogger("org").setLevel(Level.ERROR)

// Session spark
val spark = SparkSession.builder().getOrCreate()

// Load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")
val features = assembler.transform(df)

// We modify the column "y" which is the output variable
// this indicates if the client will sign a term deposit
// how it will be classified based on this it has to be converted to numeric
// stringindexer will create a new column with the values ​​of "and" but in numeric
// being "0.0" for "no" and "1.0" for "yes"

val labelIndexer0 = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer0.fit(features).transform(features)

// Decision tree algorithm

// We create indexedLabel
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(dataIndexed)

// We create automatic indexedFeatures with 4 categories
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4)

// We divide the data into an array into parts of 70% and 30%
val Array(trainingData, testData) = dataIndexed.randomSplit(Array(0.7, 0.3))

// Train a DecisionTree model.
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")

// Convert indexed labels back to original labels.
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)

// Chain indexers and tree in a Pipeline.
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))

// Train model. This also runs the indexers.
val model = pipeline.fit(trainingData)

// Make predictions.
val predictions = model.transform(testData)

println("\nAlgorithm Decision Three\n")

// Select rows to display.
predictions.select("predictedLabel", "label", "features").show(10)

// Select (prediction, true label) and compute test error.
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)

println(s"Test Error = ${(1.0 - accuracy)}\n")

val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n\n ${treeModel.toDebugString}")

println("Accuracy")
println(accuracy)
}

// Run tree dessition algorithm
dtre()


//////////////////////////////////////////
// Algorithm Linear Logistic regression //
//////////////////////////////////////////

def lore():Unit={

import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.spark.ml.Pipeline

// Possible mistakes
Logger.getLogger("org").setLevel(Level.ERROR)

// Session spark
val spark = SparkSession.builder().getOrCreate()

// Load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")

// We modify the column "y" which is the output variable
// this indicates if the client will sign a term deposit
// how it will be classified based on this it has to be converted to numeric
// stringindexer will create a new column with the values ​​of "and" but in numeric
// being "0.0" for "no" and "1.0" for "yes"

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(df).transform(df)

// Logistics regression algorithm

// We divide the data into an array into parts of 70% and 30%
val Array(training, test) = dataIndexed.randomSplit(Array(0.7, 0.3), seed = 12345)

// We create the new Logistic Regression
val lr = new LogisticRegression()

// We create the a pipeline
val pipeline = new Pipeline().setStages(Array(assembler,lr))

// Model the data
val model = pipeline.fit(training)

// Results
val results = model.transform(test)

// Predictions
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd

// Metrics
val metrics = new MulticlassMetrics(predictionAndLabels)

// Confusion matrix and accuracy
println("\nAlgorithm Logistic Regresion\n")
println("\nConfusion matrix:")
println(metrics.confusionMatrix)
println("\nAccuracy:")
println(metrics.accuracy)
}

// Run Logistic regression algorithm
lore()


/////////////////////////////////////
// Algorithm Multilayer perceptron //
/////////////////////////////////////

def mlp():Unit={

import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.linalg.Vectors

// Possible mistakes
Logger.getLogger("org").setLevel(Level.ERROR)

// Session spark
val spark = SparkSession.builder().getOrCreate()

// Load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")
val features = assembler.transform(df)

// We modify the column "y" which is the output variable
// this indicates if the client will sign a term deposit
// how it will be classified based on this it has to be converted to numeric
// stringindexer will create a new column with the values ​​of "and" but in numeric
// being "0.0" for "no" and "1.0" for "yes"

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(features).transform(features)

// to display data to see label and facts
// dataIndexed.show(100)

// Algorithm Multilayer perceptron

// We divide the data into an array into parts of 70% and 30%
val split = dataIndexed.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = split(0)
val test = split(1)

// We specify the layers for the neural network
// entry 5 for the data number of the features
// 2 hidden layers of two neurons and output 2 since it is only yes or no
// depending on whether the client subscribed to a term deposit

val layers = Array[Int](5, 2, 3, 2)

// We create the trainer with its parameters
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

// We train the model
val model = trainer.fit(train)

// We print the accuracy
val result = model.transform(test)

// predictions and label (original)
val predictionAndLabels = result.select("prediction", "label")
println("\nAlgorithm  Multilayer perceptron\n")

// Model precision estimation runs
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Accuracy test = ${evaluator.evaluate(predictionAndLabels)}")

}

//Run algorithm
mlp()
