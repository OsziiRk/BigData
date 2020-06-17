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
