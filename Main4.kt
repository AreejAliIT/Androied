import kotlin.random.Random

fun main(){
    var c = 0
    val random = Random.nextInt(10)
    val random1 = Random.nextInt(20)
    val random2 = Random.nextInt(11)
    println("Welcome to MATH game, \n Enter 1️⃣ for Coding Dojo version OR 2️⃣ for Areej's version ")
    val version = readLine()!!.toInt()
    when (version) {
        1 -> {  println("Coding Dojo math game, please enter two numbers:")
                while (c < 3){
            try {
                print("First number: ")
                val num1 = readLine()!!.toInt()
                print("Second number:  ")
                val num2 = readLine()!!.toInt()
                val result = num1*random+num2
                println("$num1 * X + $num2 = $result")
                print("Guess X >> " )
                val guess = readLine()!!.toInt()
                if(guess == random){
                    print("Got it ✅")
                    break
                }else{
                    print("Wrong☹️, it is $random")
                    break
                }
            }catch (e: Exception){
                println("Pleas enter only numbers!❌ ")
            }
                    c++
          }
        }
        2 -> {
             print("⭐️ ️Areej's math game ⭐️️\n")
            while (c < 3){
            try {
                println("What is $random1 + $random2 - $random ?")
                val result = random1 + random2 - random
                val guess = readLine()!!.toInt()
                if(guess == result){
                    print("Got it ✅")
                    break
                }else{
                    print("Wrong☹️, it's $result")
                    break
                }
            }catch (e: Exception){
                println("❌ Pleas enter only numbers! ")
            }
                c++
           }
        }
    }
}