package org.apache.spark.examples.ml

// Step 1: Import libraries and package
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.SparkSession
 
object MultilayerPerceptronClassifierExample
 {

// Step 2: create a Spark session
// Where the class is as follows:

    def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("MultilayerPerceptronClassifierExample").getOrCreate()

// Step 3: load and analyze the dataset
// Load the stored data in LIBSVM format as a DataFrame.

val data = spark.read.format("libsvm").load("/usr/local/spark-2.3.4-bin-hadoop2.6/data/mllib/sample_multiclass_classification_data.txt")

// Step 4: Split the data into train and test
// Prepare the train and the test set: training => 60%, test => 40% and seed => 12345

    val splits = data.randomSplit(Array(0.6, 0.4), seed = 1234L)
    val train = splits(0)
    val test = splits(1)
 
// Step 5: specify the layers for the neural network    
 
    val layers = Array[Int](4, 5, 4, 3)

// Step 6: create the MultilayerPerceptronClassifier trainer and set its parameters
    
    val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
    
// Step 7: Train the multilayer perceptron classification model 

    val model = trainer.fit(train)
    
// Step 8: calculate the accuracy on the test set

    val result = model.transform(test)
    val predictionAndLabels = result.select("prediction", "label")
    
// Step 9: evaluate the model for prediction performance
    val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
    

// Step 10 Print result
    println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")

    spark.stop()
  }
}