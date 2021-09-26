
<h1>Unit 3</h1>
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
<br>
<ul>
<li><a href = "#Kmeans" target="_self"> Kmeans </a>
<li><a href = "#Examen1u3" target="_self"> Test </a>

<br>
<a name = "Kmeans"><h1> Kmeans </h1></a>

<p align="justify">K-means is an unsupervised classification (clustering) algorithm that groups objects into k classification groups in their characteristics. Grouping is performed by minimizing the sum of distances between each object and the centroid of its group or cluster. Quadratic distance is often used.</p>
<p align="center"><img src="https://github.com/OsziiRk/Recursos_Bigdata/blob/master/aDTF2cZ.png" style="max-width:100%;"></p>



The algorithm consists of three steps:

* Initialization: once the number of groups, k, has been chosen, k centroids are established in the data space, for example, choosing them randomly.
* Assignment objects to centroids: each object in the data is assigned to its closest centroid.
* Update centroids: the position of the centroid of each group is updated taking as a new centroid the position of the average of the objects belonging to that group.



<p align="justify"> The main advantages of the k-means method are that it is a simple and fast method. But it is necessary to decide the value of k and the final result depends on the initialization of the centroids. In principle, it does not converge to the global minimum but to a local minimum.</p>

<br>
<a name = "Examen1u3"><h1> Test </h1></a>
<h3>Instructions</h3>
<p align="justify">Develop the following instructions in Spark with the Scala programming language.</p>
<h3>Description</h3>
<p align="justify">This is the test performed in unit 3, the objective of this practical exam is to try to group clients from specific regions from a wholesale distributor. This is based on the sales of some product categories, using the kMeans algorithm and the dataset: Whole sale customersdata.csv </p>
<h3>Code</h3>

```scala

// Test, Unit 3 Kmeans
// Zamorano Garcia Osvaldo Arturo 
// Barraza Sierra Alexis Fernando


// Point 1 Import a simple Spark session.
// Spark Session
import org.apache.spark.sql.SparkSession

// Point 2 Use the lines of code to minimize errors
// Code to minimize errors
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

// Point 3 Create an instance of the Spark session
// Spark Session
val spark = SparkSession.builder().getOrCreate()

// Point 4 Import the Kmeans library for the grouping algorithm.
// The Kmeans algorithm is imported
import org.apache.spark.ml.clustering.KMeans

// Point 5 Loads the Wholesale Customers Data dataset
val dataset = spark.read.option("header","true").option("inferSchema","true").format("csv").load("Wholesale customers data.csv")

// Point 6 Select the following columns: Fresh, Milk, Grocery, Frozen, Detergents_Paper,
// Delicassen and call this set feature_data
val feature_data = dataset.select($"Fresh", $"Milk", $"Grocery", $"Frozen", $"Detergents_Paper", $"Delicassen")

// Point 7 Import Vector Assembler and Vector
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

// Point 8 Create a new Vector Assembler object for feature columns as a
// input set, remembering that there are no labels
val assembler = new VectorAssembler().setInputCols(Array("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")).setOutputCol("features")

// Point 9 Use the assembler object to transform feature_data
val traning = assembler.transform(feature_data)

// Point 10 Create a Kmeans model with K = 3
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(traning)

// Point 11 Evaluate the groups using Within Set Sum of Squared Errors WSSSE and print the centroids.
// Squared Errors
val WSSSE = model.computeCost(traning)
println(s"Within Set Sum of Squared Errors = $WSSSE")

// Centers
println("Cluster Centers: ")
model.clusterCenters.foreach(println)




```

