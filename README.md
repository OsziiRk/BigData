<h1>Unit 2</h1>
<p align="center">
<br><strong>Tecnológico Nacional de México</strong>
<br><strong>Instituto Tecnológico de Tijuana</strong>
<br><strong>Subdirección académica</strong>
<br><strong>Departamento de Sistemas y Computación</strong>
<br><strong>Semestre: ENERO - JUNIO 2020</strong>
<br><strong>Ingeniería en Tecnologías de la Información y Comunicaciones</strong>
<br><strong>Materia: Datos Masivos</strong>
<br><strong>Zamorano Garcia Osvaldo Arturo 15211707</strong>
<br><strong>Barraza Sierra Alexis Fernando 16212532</strong>
<br><strong>Docente: Dr. Jose Christian Romero Hernandez</strong>
</p>

<h1>Index</h1>
<ol>
<li><a href = "#Tarea1u2" target="_self"> Homework #1 </a>
<li><a href = "#Tarea2u2" target="_self"> Homework #2 </a>
<li><a href = "#Tarea3u2" target="_self"> Homework #3 </a>
<li><a href = "#Practica1u2" target="_self"> Practice 1 Linear Regression</a>
<li><a href = "#Practica2u2" target="_self"> Practice 2 Logistic Regression</a>
<li><a href = "#Practica3u2" target="_self"> Practice 3 Decision tree classifier</a>
<li><a href = "#Practica4u2" target="_self"> Practice 4 Random forest classifier</a>
<li><a href = "#Practica5u2" target="_self"> Practice 5 Gradient-boosted tree classifier</a>
<li><a href = "#Practica6u2" target="_self"> Practice 6 Multilayer perceptron classifier</a>
<li><a href = "#Practica7u2" target="_self"> Practice 7 Linear Support Vector Machine</a>
<li><a href = "#Practica8u2" target="_self"> Practice 8 One-vs-Rest classifier</a>
<li><a href = "#Practica9u2" target="_self"> Practice 9 Naive Bayes</a>
<li><a href = "#Examen1u2" target="_self"> Test 1 </a>
</ol>

<h1>Homework</h1>

<a name = "Tarea1u2"> <h2>Homework 1</h2> </a>
<h3>Investigate Models for machine learning</h3>
<p align="justify">Algorithms used in machine learning fall roughly into three categories: supervised, unsupervised, and reinforcement learning. Supervised learning involves feedback to indicate when a prediction is right or wrong, whereas unsupervised learning involves no response: The algorithm simply tries to categorize data based on its hidden structure. Reinforcement learning is similar to supervised learning in that it receives feedback, but it’s not necessarily for each input or state.</p>

<p align="justify">Machine-learning algorithms continue to grow and evolve. In most cases, however, algorithms tend to settle into one of three models for learning. The models exist to adjust automatically in some way to improve their operation or behavior.</p>

#### Figure 1. Three learning models for algorithms

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure01models.png" style="max-width:100%;"></p>

<p align="justify">In supervised learning, a data set includes its desired outputs (or labels) such that a function can calculate an error for a given prediction. The supervision comes when a prediction is made and an error produced (actual vs. desired) to alter the function and learn the mapping.</p>

<p align="justify">In unsupervised learning, a data set doesn’t include a desired output; therefore, there’s no way to supervise the function. Instead, the function attempts to segment the data set into “classes” so that each class contains a portion of the data set with common features.</p>

<p align="justify">Finally, in reinforcement learning, the algorithm attempts to learn actions for a given set of states that lead to a goal state. An error is provided not after each example (as is the case for supervised learning) but instead on receipt of a reinforcement signal (such as reaching the goal state). This behavior is similar to human learning, where feedback isn’t necessarily provided for all actions but when a reward is warranted.</p>

### Supervised learning
<p align="justify">Supervised learning is the simplest of the learning models to understand. Learning in the supervised model entails creating a function that can be trained by using a training data set, then applied to unseen data to meet some predictive performance. The goal is to build the function so that it generalizes well over data it has never seen.</p>

<p align="justify">You build and test a mapping function with supervised learning in two phases (see image below). In the first phase, you segment a data set into two types of samples: training data and test data. Both training and test data contain a test vector (the inputs) and one or more known desired output values. You train the mapping function with the training data set until it meets some level of performance (a metric for how accurately the mapping function maps the training data to the associated desired output). In the context of supervised learning, this occurs with each training sample, where you use the error (actual vs. desired output) to alter the mapping function. In the next phase, you test the trained mapping function against the test data. The test data represents data that has not been used for training and provides a good measure for how well the mapping function generalizes to unseen data.</p>

#### Figure 2. The two phases of building and testing a mapping function with supervised learning
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure02supervised.png"></p>

#### The most common algorithms that apply to supervised learning are
* Support vector machines
* Naïve Bayes
* Neural networks 
* Decision trees
* Logistic regression

### Unsupervised learning

<p align="justify">Unsupervised learning is also a relatively simple learning model, but as the name suggests, it lacks a critic and has no way to measure its performance. The goal is to build a mapping function that categorizes the data into classes based on features hidden within the data.</p>

<p align="justify">As with supervised learning, you use unsupervised learning in two phases. In the first phase, the mapping function segments a data set into classes. Each input vector becomes part of a class, but the algorithm cannot apply labels to those classes.</p>

#### Figure 3. The two phases of using unsupervised learning
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure03unsupervised.png"></p>

<p align="justify">The segmentation of the data into classes may be the result (from which you can then draw conclusions about the resulting classes), but you can use these classes further depending on the application. One such application is a recommendation system, where the input vector may represent the characteristics or purchases of a user, and users within a class represent those with similar interests who can then be used for marketing or product recommendations.</p>

#### The most common algorithms that apply to unsupervised learning are
* k-means clustering
* adaptive resonance theory
* ART

### Reinforcement learning
<p align="justify">Reinforcement learning is an interesting learning model, with the ability not just to learn how to map an input to an output but to map a series of inputs to outputs with dependencies (Markov decision processes, for example). Reinforcement learning exists in the context of states in an environment and the actions possible at a given state. During the learning process, the algorithm randomly explores the state–action pairs within some environment (to build a state–action pair table), then in practice of the learned information exploits the state–action pair rewards to choose the best action for a given state that lead to some goal state.</p> 

#### Figure 4. The reinforcement learning model
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/figure04reinforcement.png"></p>

#### The most common algorithms that apply to Reinforcement learning are
* Dynamic programming
* Q-learning
* SARSA

<br>
<a name = "Tarea2u2"> <h2>Homework 2</h2> </a>
<h3>Investigate Vectorassembler, RootmeansquaredError</h3>

### VectorAssembler Library
<p align="justify">VectorAssembler is a transformer that combines a given list of columns into a single vector column. It is useful for combining raw features and features generated by different feature transformers into a single feature vector, in order to train ML models like logistic regression and decision trees. VectorAssembler accepts the following input column types: all numeric types, boolean type, and vector type. In each row, the values of the input columns will be concatenated into a vector in the specified order.</p> 

#### Examples
<p>Assume that we have a DataFrame with the columns id, hour, mobile, userFeatures, and clicked:</p> 
<pre><code> id | hour | mobile | userFeatures     | clicked
----|------|--------|------------------|---------
 0  | 18   | 1.0    | [0.0, 10.0, 0.5] | 1.0
</code></pre>

<p align="justify">UserFeatures is a vector column that contains three user features. We want to combine hour, mobile, and userFeatures into a single feature vector called features and use it to predict clicked or not. If we set VectorAssembler’s input columns to hour, mobile, and userFeatures and output column to features, after transformation we should get the following DataFrame:</p> 

<pre><code> id | hour | mobile | userFeatures     | clicked | features
----|------|--------|------------------|---------|-----------------------------
 0  | 18   | 1.0    | [0.0, 10.0, 0.5] | 1.0     | [18.0, 1.0, 0.0, 10.0, 0.5]
</code></pre>

### RootMeanSquareError
<p align="justify">The Mean Squared Error (MSE) is a measure of how close a fitted line is to data points. For every data point, you take the distance vertically from the point to the corresponding y value on the curve fit (the error), and square the value. Then you add up all those values for all data points, and, in the case of a fit with two parameters such as a linear fit, divide by the number of points minus two. The squaring is done so negative values do not cancel positive values. The smaller the Mean Squared Error, the closer the fit is to the data. The MSE has the units squared of whatever is plotted on the vertical axis.</p> 

<p align="justify">Another quantity that we calculate is the Root Mean Squared Error (RMSE). It is just the square root of the mean square error. That is probably the most easily interpreted statistic, since it has the same units as the quantity plotted on the vertical axis.</p>

<a name = "Tarea3u2"> <h2>Homework 3</h2> </a>
<h3>Investigate Pipeline, Matriz of confusion</h3>

### Pipeline in Machine Learning

<p align="justify">A machine learning pipeline is used to help automate machine learning workflows. They operate by enabling a sequence of data to be transformed and correlated together in a model that can be tested and evaluated to achieve an outcome, whether positive or negative.
Machine learning (ML) pipelines consist of several steps to train a model. Machine learning pipelines are iterative as every step is repeated to continuously improve the accuracy of the model and achieve a successful algorithm.</p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/Pipiline1.png"></p>
<p align="justify">It’s not just about storing data any longer, but capturing, preserving, accessing and transforming it to take advantage of its possibilities and the value it can deliver.</p>

* The main objective of having a proper pipeline for any ML model is to exercise control over it. A well-organised pipeline makes the implementation more flexible.

* The main objective of having a proper pipeline for any ML model is to exercise control over it. A well-organised pipeline makes the implementation more flexible.
* The learning algorithm finds patterns in the training data that map the input data attributes to the target
* model can have many dependencies and to store all the components to make sure all features available both offline and online for deployment
* A pipeline consists of a sequence of components which are a compilation of computations.

### Challenges Associated with ML Pipelines

<p align="justify" > A typical machine learning pipeline would consist of the following processes:</p>

* Data collection
* Data cleaning
* Feature extraction (labelling and dimensionality reduction)
* Model validation
* Visualisation
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/pipeline2.png"></p>
<p align="justify"> Data collection and cleaning are the primary tasks of any machine learning engineer who wants to make meaning out of data. But getting data and especially getting the right data is an uphill task in itself.
Data quality and its accessibility are two main challenges one will come across in the initial stages of building a pipeline.
The captured data should be pulled and put together and the benefits of collection should outweigh the costs of collection and analysis. </p>

### Confusion matrix

<p  align="justify" >In the field of machine learning and specifically the problem of statistical classification, a confusion matrix, also known as an error matrix, is a specific table layout that allows visualization of the performance of an algorithm, typically a supervised learning one (in unsupervised learning it is usually called a matching matrix). Each row of the matrix represents the instances in a predicted class while each column represents the instances in an actual class (or vice versa). </p>

### Example

<p align="justify" > If a classification system has been trained to distinguish between cats and dogs, a confusion matrix will summarize the results of testing the algorithm for further inspection. Assuming a sample of 13 animals — 8 cats and 5 dogs — the resulting confusion matrix could look like the table below:</p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/table1.JPG"></p>\

<p align="justify" >In this confusion matrix, of the 8 actual cats, the system predicted that three were dogs, and of the five dogs, it predicted that two were cats. All correct predictions are located in the diagonal of the table (highlighted in bold), so it is easy to visually inspect the table for prediction errors, as they will be represented by values outside the diagonal.

In abstract terms, the confusion matrix is as follows: </p>

<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/tabla2.JPG"></p>

<p align="justify"  > where: P = positive; N = Negative; TP = True Positive; FP = False Positive; TN = True Negative; FN = False Negative. </p>














<h1>Practices</h1>

<a name = "Practica1u2"> <h2>Practice 1 Linear Regression</h2> </a>
<h3>Instructions</h3>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 1

```

<a name = "Practica2u2"><h2> Practice 2 Logistic Regression</h2></a>
<h3>Instructions</h3>
<p align="justify">Describe and check the instructions necessary to perform a logistic regression</p>
<h3>Description</h3>
<p align="justify">In this project we will be working with a fake advertising data set, indicating whether or not a particular internet user clicked on an Advertisement. We will try to create a model that will predict whether or not they will click on an ad based off the features of that user.
<br><br>This data set contains the following features:</p>

* 'Daily Time Spent on Site': consumer time on site in minutes
* 'Age': cutomer age in years
* 'Area Income': Avg. Income of geographical area of consumer
* 'Daily Internet Usage': Avg. minutes a day consumer is on the internet
* 'Ad Topic Line': Headline of the advertisement
* 'City': City of consumer
* 'Male': Whether or not consumer was male
* 'Country': Country of consumer
* 'Timestamp': Time at which consumer clicked on Ad or closed window
* 'Clicked on Ad': 0 or 1 indicated clicking on Ad

<h3>Code</h3>

```scala

// Take the data

// Import a SparkSession with the Logistic Regression library
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession

// Optional: Use the Error reporting code
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

// Create a Spark session
val spark = SparkSession.builder().getOrCreate()

// Use Spark to read the csv Advertising file
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")

// Print the Schema of the DataFrame
data.printSchema()


// Display the data

// Print an example line
data.head(1)

val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}


// Prepare the DataFrame for Machine Learning

// Create a new column called "Hour" of the Timestamp containing "Hour of the click"
val timedata = data.withColumn("Hour",hour(data("Timestamp")))

// Rename the column "Clicked on Ad" to "label"
// Take the following columns as features "Daily Time Spent on Site", "Age", "Area Income", "Daily Internet Usage", "Hour", "Male"
val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")

// Import VectorAssembler and Vectors
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

// Create a new VectorAssembler object called assembler for the features
val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))

// Use randomSplit to create train and test data divided by 70/30
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)


//Set up a Pipeline

// Import Pipeline
import org.apache.spark.ml.Pipeline

// Create a new LogisticRegression object called lr
val lr = new LogisticRegression()

// Create a new pipeline with the elements: assembler, lr
val pipeline = new Pipeline().setStages(Array(assembler, lr))

// Adjust (fit) the pipeline for the training set
val model = pipeline.fit(training)

// Take the Results in the Test set with transform
val results = model.transform(test)


// Model evaluation

// For Metrics and Evaluation import MulticlassMetrics
import org.apache.spark.mllib.evaluation.MulticlassMetrics

// Convert test results to RDD using .as and .rdd
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd

// Initialize a MulticlassMetrics object
val metrics = new MulticlassMetrics(predictionAndLabels)

// Print the Confusion Matrix
println("Confusion matrix:")
println(metrics.confusionMatrix)

// Print the model Accuracy value
metrics.accuracy


```


<a name = "Practica3u2"><h2> Practice 3 Decision tree classifier</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 3

```


<a name = "Practica4u2"><h2> Practice 4 Random forest classifier</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 4

```


<a name = "Practica5u2"><h2> Practice 5 Gradient-boosted tree classifier</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 5

```


<a name = "Practica6u2"><h2> Practice 6 Multilayer perceptron classifier</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 6

```


<a name = "Practica7u2"><h2> Practice 7 Linear Support Vector Machine</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 7

```


<a name = "Practica8u2"><h2> Practice 8 One-vs-Rest classifier</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 8

```


<a name = "Practica9u2"><h2> Practice 9 Naive Bayes</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Practice 9

```


<h1>Tests</h1>

<a name = "Examen1u2"><h2> Test 1</h2></a>
<h3>Description</h3>
<p align="justify">describe.</p>
<h3>Code</h3>

```scala

// Test 1

```
