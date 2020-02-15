// Practice 2

// 1. Create a list called "list" with the elements "rojo", "blanco", "negro"
var list =List("rojo","blanco","negro")

// 2. Add 5 more items to "list": "verde" ,"amarillo", "azul", "naranja", "perla"
list = "verde" ::"amarillo" ::"azul" ::"naranja" ::"perla" :: list

// 3. Bring the elements of "list" "verde", "amarillo", "azul"
list slice (0,3)

// 4. Create a number array in the 1-1000 range in 5-in-5 steps
Array.range(1, 1000, 5)

// 5. What are the unique elements of the List (1,3,3,4,6,7,3,7) use conversion to sets
var list2=List(1,3,3,4,6,7,3,7)
list2.toSet

// 6. Create a mutable map called "names" that contains the following
//   "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23),("Susana",27))

// 6a. Print all map keys
names.keys

// 6b. Add the following value to the map ("Miguel", 23)
names += ("Miguel" -> 23)
