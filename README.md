<h1>Unit 4</h1>
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/logos.PNG" style="max-width:100%;"></p>

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

<h1>Final project</h1>
<h2>Index</h2>
<ul>
<li><a href = "#introduction" target="_self"> Introduction </a>
<li><a href = "#contextual" target="_self"> Contextual frameworks </a>
<li><a href = "#implementation" target="_self"> Implementation </a>
<li><a href = "#description" target="_self"> Algorithms Description</a>
<li><a href = "#smv" target="_self"> Algorithm SMV</a>
<li><a href = "#dt" target="_self"> Algorithm Decision Three </a>
<li><a href = "#lr" target="_self"> Algorithm Logistic Regression</a>
<li><a href = "#mp" target="_self"> Algorithm Multilayer Perceptron</a>
<li><a href = "#results" target="_self"> Results</a>
<li><a href = "#accuracy" target="_self"> Comparison table of Accuracy</a>
<li><a href = "#run" target="_self"> Comparison run time table</a>
<li><a href = "#conclusion" target="_self"> Conclusion</a>
<li><a href = "#References" target="_self"> References</a>
</ul>

<a name = "introduction"><h2>Introduction</h2>
<p align="justify">The collection and analysis of data is one of the most recurring practices today with
the implementation of Big Data, the amount of information that is collected daily is
enormous, thanks to the amount of data that is moved which contains large
dimensions of information to analyze.
With the development of different Big Data Algorithms, in this research we propose
to solve, analyze and understand four specific algorithms for the analysis of a set of
data collected from the banking system in order to see which algorithm is most
effective at the time of analyzing and understand the data, observe the behavior of
time and its precision, use the Spark-Scala work tool as the manager of our data and
algorithms.</p><br>


<a name = "contextual"><h2>Contextual frameworks</h2>
<p align="justify">The analysis of the data is not something that has been invented or something new for our
generation, the analysis is based on the main natives who used rudimentary methods such
as the use of sticks and game food with a system in which it helped them. to predict your
future needs for the colony or tribe to which you contributed. With the passage of time
humanity has been in constant evolution, with this we reach our current time with the
integration of the Internet that was the pioneer of the term of Big Data, the success that the
internet had with the passage of time was crossing barriers, passing From a simple
information medium to communicate or simply express itself to a global expansion of a
commercial and communication type never seen before, this called for so much that the
amounts of information that the internet controlled was totally impossible to analyze with
ancient methods of analysis, science understood which was something revolutionary for the
time for which the development of mathematical algorithms were fired in a great way,
creating formulas for a detailed analysis of information, with this, in conjunction with
computer systems, a great fusion between mathematicians and computer scientists was
created for the development of computer-mathematical algorithms to carry out big Big Data
algorithms such as SVM, Decision Tree, Logistic Regression, Multilayer perceptron among
other algorithms.
Today the use of this type of algorithms is essential in any company or organization of any
kind, since the use of information helps from the use of financial markets to an effective
marketing system, which is why the development of Algorithms and new ways of analyzing it
become something very daily nowadays.</p><br>
  

<a name = "implementation"><h2>Implementation</h2>
<p align="justify">Within our analysis 2 working tools will be used which are Spark in combination with
Scala. Spark is a programming framework that processes data developed by the
Apache project, which is used by large corporations and is one of the most widely
used worldwide. It has great flexibility and interconnection with other modules, as
well as different APIs and modules that allow a more interactive analysis with the
data such as SQL as well as a simple way to create pipelines and much faster
processing.
Meanwhile Scala is a programming language which is designed to program using
patterns in a more concise way, Scala is considered as one of the most consistent
and popular languages entering the top of languages that every programmer should
learn.
Now entering into context the use of Spark in combination with Scala is due to the
great potential that both have, from the Scala oriented language style and the speed
and implementation of Spark which will make better training of our algorithms.</p><br>
  
  

<a name = "description"><h2>Algorithms Description</h2>
<a name = "smv"><h2>Algorithm SMV</h2>
  
<p align="justify">Support Vector Machines (SVM) are a set of supervised learning algorithms
developed by Vladimir Vapnik.
The objective of classification problems applied by this type of supervised learning
algorithms is as follows; given a training set with their class labels, train an SVM to
build a model that predicts the class of a new sample or test set.
SVMs are one of the most powerful machine learning techniques. It consists of
building a hyperplane in a space of very high (or even infinite) dimensionality that
separates the classes we have. A good separation between classes will allow a
correct classification of the new sample, that is, we need to find the maximum
separation to the points closest to this hyperplane.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/300px-SVM_margin.png" alt="Title" width="30%">


<h3>Code SVM Coefficients</h3>

```scala

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


```

<h3>Code SVM Accuracy</h3>

```scala

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


```
<br>
<a name = "dt"><h2>Algorithm Decision Three</h2>
  
<p align="justify">A decision tree is a diagram or graph that people use to determine a course of action
or show statistical probability. A decision tree is a graphical representation of a
decision and each potential outcome or outcome of making that decision. People
unfold decision trees in a variety of situations, from something simple and personal
("Should I go out to dinner?") To more complex industrial, scientific or
microeconomic companies.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/dt.PNG" alt="Title" width="80%">

<p align="justify">The basic idea behind any decision tree algorithm is as follows:
Select the best attribute using Attribute Selection Measures (ASM) to split the
records. Make that attribute a decision node and divide the dataset into smaller
subsets. Begin construction of the tree by repeating this process recursively for each
child until one of the conditions matches: all tuples belong to the same attribute
value. There are no more attributes left. There are no more instances.</p>
  
  
<h3>Code Decision Three</h3>


```scala

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


```

<br>
<a name = "lr"><h2>Algorithm Logistic Regression</h2>
  
<p align="justify">Logistic regression is one of the most widely used statistical-inferential techniques in
contemporary scientific production. It arises in the 1960s, its generalization
depended on the solution to the problem of estimating the coefficients. The
Waller-Duncan algorithm for obtaining the maximum likelihood estimators partially
solved this problem, but it was of such a nature that the use of computers was
essential.</p>

<img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/lr.PNG" alt="Title" width="50%">

<p align="justify">The logistic regression model is used when we are interested in forecasting the
probability of a certain event occurring or not. For example, in view of a set of
medical tests, that a person has a certain disease, or that a client returns a bank
credit.
A process is said to be binomial when it only has two possible results: "success" and
"failure", the probability of each of them being constant in a series of repetitions.</p><br>

<h3>Code Logistic Regression</h3>


```scala

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



```

<br>
<a name = "mp"><h2>Algorithm Multilayer Perceptron </h2>
  
<p align="justify">MLPs are forward-directed networks with one or more node layers between the input
nodes and the output nodes (Hidden). Each neuron is a perceptron type. Each layer
is fully connected to the next layer in the network.</p>

<p align="center" ><img  src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/perceptron.png" alt="Title" width="50%"></p>

<p align="justify">Perceptron: Artificial neuron or basic unit of inference in the form of a linear
discriminator, from which an algorithm is developed capable of generating a criterion
to select a sub-group from a larger group of components.</p><br>

Layers can be classified into three types:
* Input layer: Made up of those neurons that introduce input patterns into the
network. No processing occurs in these neurons.
* Hidden Layers: Formed by those neurons whose inputs come from previous
layers and whose outputs go to neurons from later layers.
* Output layer: Neurons whose output values correspond to the outputs of the
entire network.


<h3>Code Multilayer Perceptron</h3>


```scala
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer,
VectorAssembler}
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.linalg.Vectors
// Posibles errores
Logger.getLogger("org").setLevel(Level.ERROR)
// Sesion spark
val spark = SparkSession.builder().getOrCreate()
// Cargamos dataset
val df =
spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").
format("csv").load("bank-full.csv")
// para ver tipos de datos
// df.printSchema()
// df.show(1)
val assembler = new
VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).set
OutputCol("features")
val features = assembler.transform(df)
// Modificamos la columna "y" que es la variable de salida
// esta indica si el cliente suscribirá un depósito a plazo
// como se clasificara en base a esta se tiene que convertir a numerica
// stringindexer creara una nueva columna con los valores de "y" pero en numericos
// siendo "0.0" para "no" y "1.0" para "si"
val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(features).transform(features)
// para mostrar los datos para ver label y fectures
// dataIndexed.show(100)
// Algoritmo Multilayer perceptron
//Dividimos los datos en un arreglo en partes de 70% y 30%
val split = dataIndexed.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = split(0)
16
val test = split(1)
// Especificamos las capas para la red neuronal
// entrada 5 por el numero de datos de las features
// 2 capas ocultas de dos neuronas y salida 2 ya que solo es si o no
// dependiendo si el cliente se suscribio a un depósito a plazo
val layers = Array[Int](5, 2, 3, 2)
//Creamos el entrenador con sus parametros
val trainer = new
MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setM
axIter(100)
//Entrenamos el modelo
val model = trainer.fit(train)
//Imprimimos la exactitud
val result = model.transform(test)
//predicciones y label(originales)
val predictionAndLabels = result.select("prediction", "label")
println("\nAlgoritmo Multilayer perceptron\n")
// Model precision estimation runs
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Accuracy test = ${evaluator.evaluate(predictionAndLabels)}")



```
<a name = "results"><h2>Results</h2>

<p align="justify">Within the next section the interpreted results will be shown, with the obtained data a
table will be made which will show which algorithm is more efficient in precision and
execution time.</p>

<h3>Results svm</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/resultado.JPG" alt="Title" width="100%"></p>

<p align="justify">Within this algorithm as previously explained, it tries to separate the coefficients
given in the information by separating them in a plane, in this case they give us the
coordinates within the plane where each class is staying, which in total are 5
previously adjusted and classified within our vector. We have an accuracy of 88% of
our trained data, which is an acceptable precision for the amount of data we have.</p>

<h3>Results DecisionTreeClassification</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/arbol.JPG" alt="Title"></p>
<p align="justify">In this algorithm, it creates the structure of a decision tree, making predictions
through the data stored in our dataset, occupying an accuracy of 89% and 11%
error, being one of the most accurate algorithms when making a decision, the
disadvantage it would have with others is the very complex way of interpreting the
data.</p>

<h3>Results Linear Logistic regression</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/matriz.JPG" alt="Title"></p>
<p align="justify">Within our result it gives us a matrix which separates all the data in a matrix putting it
in quadrants for a better interpretation, taking into account that in this algorithm it is
separating into 4 classes with an accuracy of 89%. One of the fastest and easiest
algorithms to interpret from the other algorithms.</p>

<h3>Results Multilayer perceptron</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/mlp.JPG" alt="Title"></p>
<p align="justify">The algorithm gives us a prediction and precision of 88% and shows us the predictions that are made when classifying against the real valuesthat we have in our data set, which are found when creating the neuron layers with a certain architecture. equal precision in all iterations used with this algorithm.</p>

<a name = "accuracy"><h3>Comparison table of Accuracy</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/tablas1.JPG" alt="Title"></p>
<p align="justify">Carrying out a deep analysis of our data we can see that the precision percentages
are really similar between a range of 87-89%, so we can interpret that these three
algorithms work with a very similar logic. Another point to highlight is how the SVM
and Multilayer have an exact precision and does not change as in the decision tree
or logistic this is given by the information given in our dataset and does not vary in
the decisions of yes and no, as it differs in the case From the decision tree that
simply taking paths through nodes can have different precisions and interpretations
of the code.
To conclude we can see that they are all so similar but even if it is by thousandths,
there is one that is more precise than the others, in this case it would be logistic
regression having a 0.8994378247842454% precision and the most imprecise in
terms of what has a lower percentage of thousandths is multilayer with a
0.8827505142521305% but in turn it is the one that never varies what can be an
advantage in its favor.
</p>
<br>
<a name = "run"><h3>Comparison run time table</h3>
<p align="center" ><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/tablas2.JPG" alt="Title"></p>
<p align="justify">With the analysis of the execution time between the algorithms we can conclude that
the algorithm that takes the longest is the multiplayer with an average of
approximately 12 seconds although it is a short code but the process it performs on
the neuron takes a long time to accommodate the data and extract the output result.
On the other hand, the fastest algorithm could be said to be logistic regression with
an average of approximately 3 seconds, given that its matrix system is much more
efficient for controlling data than the others.
Concluding with the interpretation of both tables, we can realize that the multilayer is
a little more complex than the others since its algorithms are based on a neural
network, which is more complex for the computer to understand than a simple
matrix, which is the case of logistic regression taking out what is the best algorithm
to interpret the necessary information.
</p>

<a name = "conclusion"><h2>Conclusion</h2>
<p align="justify">Today everyone is connected, which generates large amounts of information which
is very valuable to interpret and analyze behaviors for different areas such as
commerce, scientific research, marketing, among many other disciplines.
The use of algorithms for the realization of Big Data is a fundamental tool in the
analysis of data, since we can create large information networks to interpret and
search among thousands of data.
We made the comparison of 4 regularly used algorithms and we were able to see
which is the best option when analyzing our data, this with a powerful set of tools
such as Spark and Scala, which are the next union for the interpretation of the data.
</p>

<a name = "References"><h2>References</h2>
  
* ICEMD. (2019, 31 agosto). Apache Spark: Introducción, qué es y cómo funciona. Recuperado 13 de junio de 2020, de https://www.icemd.com/digital-knowledge/articulos/apache-spark-introduccion-que-es-y-como-funciona/

* Implantación y Gestión de Negocios S.L. (2020, 4 junio). Historia del Big Data: un largo viaje poco conocido. Recuperado 13 de junio de 2020, de https://ignsl.es/historia-del-big-data/

* NOVOSELTSEVA, E. (2019, 27 mayo). Lenguaje Scala: razones por las que sigue ganando popularidad. Recuperado 13 de junio de 2020, de https://apiumhub.com/es/tech-blog-barcelona/lenguaje-scala/

* Universidad Autónoma de Madrid. (2013, octubre). Algoritmos SVM para problemas sobre big data (1). Recuperado de
https://repositorio.uam.es/bitstream/handle/10486/14108/66152_Yvonne_Gala_Garcia.pdf?sequence=1&isAllowed=y

* Zamorano, O., & Barraza, A. (2020, 28 mayo). OsziiRk/BigData. Recuperado 15 de junio de 2020, de https://github.com/OsziiRk/BigData/tree/Unidad_2
