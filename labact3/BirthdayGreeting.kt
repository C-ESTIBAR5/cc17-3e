fun main() {
    val name = "Chan"
    val age = 20
    val year = 365
    val dayage = age * year
    val border = "==%%"
    val timesToRepeat = 5
    
    printBorder(border,timesToRepeat)
    print("Happy Birthday! Chan \n")
    printBorder(border,timesToRepeat)
    print("I am ${age} years old  \n")
    print("${age} is the best age to learn Kotlin! \n")
    print("\n")
    print("I am ${dayage} days old  \n")
    print("${name} is already ${dayage} days old!\n")
    
    
    //lets print a cake yeeeeeyy
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")   
}

	fun printBorder(border:String, timesToRepeat: Int) {
       
        repeat(timesToRepeat) {
           print(border)
        }
        println("")
    }
