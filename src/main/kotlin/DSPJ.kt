import java.util.Scanner

fun main() {
     val scn = Scanner(System.`in`)

     val myList = mutableListOf<String>()
     println("Enter no. of iterations:")
     var n = scn.nextInt()
     scn.nextLine()
     while (n > 0){
          println("Enter Names:")
          val input = scn.nextLine()
          myList.add(input)
          n--
     }
       val  newList = myList
           .filter {
                it.contains("M",true) ||
                it.contains("B",true)
           }
            .map { it.uppercase() }
     println("Names: $newList")
     }







