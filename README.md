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
<li><a href = "#Practica1u2" target="_self"> Practice 1 LinearRegression</a>
<li><a href = "#Practica2u2" target="_self"> Practice 2 LogisticRegression</a>
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
<a name = "Tarea1u2"> <h3>Homework 1</h3> </a>
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

<br>
<a name = "Tarea2u2"> <h3>Homework 2</h3> </a>
<h3>Investigate Vectorassembler, Vectors, Rootmeansquared Error</h3>
<br>
<a name = "Tarea3u2"> <h3>Homework 3</h3> </a>
<h3>Investigate Pipeline, Matriz of confusion</h3>
<br>
<h1>Practices</h1>
<a name = "Practica1u2"> <h3>Practice 1 LinearRegression</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 1

```

<a name = "Practica2u2"> <h3>Practice 2 LogisticRegression</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 2

```

<a name = "Practica3u2"> <h3>Practice 3 Decision tree classifier</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 3

```

<a name = "Practica4u2"> <h3>Practice 4 Random forest classifier</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 4

```

<a name = "Practica5u2"> <h3>Practice 5 Gradient-boosted tree classifier</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 5

```

<a name = "Practica6u2"> <h3>Practice 6 Multilayer perceptron classifier</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 6

```

<a name = "Practica7u2"> <h3>Practice 7 Linear Support Vector Machine</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 7

```

<a name = "Practica8u2"> <h3>Practice 8 One-vs-Rest classifier</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 8

```

<a name = "Practica9u2"> <h3>Practice 9 Naive Bayes</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Practice 9

```

<h1>Tests</h1>
<a name = "Examen1u2"> <h3>Test 1</h3> </a>
<h4>Instructions</h4>
<h4>Description</h4>
<p align="justify">describe.</p>
<h4>Code</h4>

```scala

// Test 1

```
