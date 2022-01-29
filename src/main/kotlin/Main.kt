fun rectangle_area(): Double {
    return 1.5
}

fun circle_area(): Double {
    return 2.5
}

fun triangle_area():Double {
    return 3.5
}

fun ellipse_area():Double {
    return 4.5
}

fun main(args: Array<String>) {
    var Selection: Int = 1
    var Area: Double = 5.5

    do {
        // Allow User to select a shape
        println("Calculate area of: Rectangle/Square ('1'), Circle ('2'), Triangle ('3'), Ellipse ('4'), or Exit ('5')")
        print("Enter option (1 ... 5) ")
        Selection = readLine()!!.toInt()

        when (Selection) {
            1 -> Area = rectangle_area()
            2 -> Area = circle_area()
            3 -> Area = triangle_area()
            4 -> Area = ellipse_area()
            5 -> println("Exit")
            else -> println("Invalid option")
        }
        // If user not exiting, print area
        if (Selection > 0 && Selection < 5)
            println("Area = " + Area)
        println()
    } while (Selection != 5)

    println("Program arguments: ${args.joinToString()}")
}