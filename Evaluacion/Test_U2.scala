// Unit 2 Exam
// Barraza Sierra Alexis Fernando
// Zamorano Garcia Osvaldo Arturo

// MLlib libraries necessary to classify with Multilayer Perceptron are imported
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.{VectorAssembler, StringIndexer}
import org.apache.spark.ml.linalg.Vectors

// Point 1 Data cleaning necessary to be processed with the multilayer perceptron algorithm
// Dataset Iris.cvs, recovered in https://github.com/jcromerohdz/iris  

// Here the data from the iris.csv dataset is loaded into the variable "data"
val data = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("iris.csv")

// Null fields are removed
val dataClean = data.na.drop()

// Point 2 column names are shown
dataClean.columns 

// Point 3 the schematic of the data is printed
dataClean.printSchema()

// Point 4 prints the first 5 columns
dataClean.show(5)
dataClean.select($"sepal_length",$"sepal_width",$"petal_length",$"petal_width",$"species").show(5)

// Point 5 method describes
dataClean.describe().show()

// Point 6 relevant transformation for the categorical data which will be our labels to classify.
// A vector is declared that will transform the data to the variable "features"
val vectorFeatures = (new VectorAssembler().setInputCols(Array("sepal_length","sepal_width", "petal_length","petal_width")).setOutputCol("features"))

// Features are transformed using the dataframe
val features = vectorFeatures.transform(dataClean)

// A "StringIndexer" is declared that transforms the data in "species" into numerical data
val speciesIndexer = new StringIndexer().setInputCol("species").setOutputCol("label")

// We adjust the indexed species with the vector features
val dataIndexed = speciesIndexer.fit(features).transform(features)

// Point 7 Build the classification models and explain your architecture.

// With the variable "splits" we make a cut randomly
val splits = dataIndexed.randomSplit(Array(0.6, 0.4), seed = 1234L)

// The variable "train" is declared which will have 60% of the data
val train = splits(0)

// The variable "test" is declared which will have 40% of the data
val test = splits(1)

// The configuration of the layers for the artificial neural network model is established
// Input: 4 (features)
// the two Intermediates 5 and 4 respectively
// Output 3, having 3 types of classes
val layers = Array[Int](4, 5, 4, 3)

// The Multilayer algorithm trainer is configured with their respective parameters
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

// Model is trained with training data
val model = trainer.fit(train)

// They are tested already trained the model
val result = model.transform(test)

// Point 8 Print the model results
// Select the prediction and the label that will be stored in the variable
val predictionAndLabels = result.select("prediction", "label")

// Some prediction data is shown against the real ones to see results
predictionAndLabels.show(50)
result.show(30)

// Model precision estimation runs
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Accuracy test = ${evaluator.evaluate(predictionAndLabels)}")

