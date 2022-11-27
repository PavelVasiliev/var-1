fun main(args: Array<String>) {
    println("Calculating the volume of a parallelepiped")

    //Input data
    println("Length:" )
    val lenght = readln().toDouble()
    println("Width:" )
    val widht = readln().toDouble()
    println("Height:" )
    val height = readln().toDouble()

    //Result
    val result = lenght * widht * height
    print("The volume = $result")

}