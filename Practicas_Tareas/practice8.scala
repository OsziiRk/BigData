// All necessary libraries are imported
import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

// Load the data into the variable "inputData" in a "libsvm" format
val inputData = spark.read.format("libsvm").load("data/mllib/sample_multiclass_classification_data.txt")

// Information is divided into training data and test data
val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))

// The variable "classifier" is declared that will do the regression
val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)

// Model "OneVsRest" is declared
val ovr = new OneVsRest().setClassifier(classifier)

// Model is trained with training data
val ovrModel = ovr.fit(train)

// Predictions are made with test data
val predictions = ovrModel.transform(test)

//The evaluator is declared to take the precision of the model and save it in a metric variable called "accuracy"
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

// Calculate the model error with a simple subtraction
val accuracy = evaluator.evaluate(predictions)

// Print test error
println(s"Test Error = ${1 - accuracy}")