fun rectangle_area(): Double {
    // Collect user input for rectangle (or square): Width & Height and return the calculated area
    var Width: Double
    var Height:Double
    println("For a square, enter the same Width and Height")
    print("Enter the Width of a rectangle: ")
    Width = readLine()!!.toDouble();
    print("Enter the Height of a rectangle: ")
    Height = readLine()!!.toDouble();
    return Width * Height
}

fun circle_area(): Double {
    // Collect user input for circle: Radius and return the calculated area
    var Radius: Double
    var Pi: Double = 3.14159
    print("Enter the radius of a circle: ")
    Radius = readLine()!!.toDouble();
    return Radius * Radius * Pi
    return 2.5
}

fun triangle_area():Double {
    // Collect user input for triangle: Base & Height and return the calculated area
    var Base: Double
    var Height: Double
    print("Enter the Base of a triangle: ")
    Base = readLine()!!.toDouble();
    print("Enter the vertical Height of a triangle: ")
    Height = readLine()!!.toDouble();
    return Base * Height * 0.5
}

fun ellipse_area():Double {
    // Collect user input for ellipse: Major & Minor Axis radius and return the calculated area
    var Major: Double
    var Minor: Double
    var Pi: Double = 3.14159
    print("Enter the Major Axis radius of an ellipse: ")
    Major = readLine()!!.toDouble();
    print("Enter the Minor Axis radius of an ellipse: ")
    Minor = readLine()!!.toDouble();
    return Major * Minor * Pi
}

fun main(args: Array<String>) {
    var Selection: Int = 1
    var Area: Double = 5.5

    do {
        // Allow User to select a shape
        println("Calculate area of: Rectangle/Square ('1'), Circle ('2'), Triangle ('3'), Ellipse ('4'), or Exit ('5')")
        print("Enter option (1 ... 5): ")
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