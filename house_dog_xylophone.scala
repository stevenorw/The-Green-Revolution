//1. Definitions & Imports

import scala.collection.mutable.ListBuffer

object TheGreenRevolution { 

//2. Variables 

val countries = List("India", "China", "Brazil")
val crops = List("Wheat", "Rice", "Cotton")
val population = List(13, 19, 200)
val goals = new ListBuffer[String]

//3. Main program

def main(args: Array[String]): Unit = { 
  goals += "Increase crop yields"
  goals += "Reduce the global use of fertilizer"
  goals += "Reduce child labor in agriculture"
  goals += "Create sustainable agriculture techniques" 
  
//4. Initial Loop

for (i <- 0 until countries.length) {
  println(s"The Green Revolution in ${countries(i)} is focused on:") 
  for (j <- 0 until goals.length) {
    println(s"\t ${goals(j)}")
  }
  println("---------------------")

//5. Expansion loop

  for (k <- 0 until crops.length) {
    println(s"We are focusing on ${crops(k)}")
    println(s"The population of  ${countries(i)} is: ${population(i)}") 
    println("---------------------")
  }
  
//6. End of program

  }
  println("End of The Green Revolution")
}

//7. Call main method

TheGreenRevolution.main(Array[String]())

}