class Calculator {

    fun addition(a: Double, b: Double): Double {
        return a + b
    }

    fun subtraction(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplication(a: Double, b: Double): Double {
        return a * b
    }

    fun division(a: Double, b: Double): Double {
        if (b == 0.0) {
            println("\nDivision by zero is not allowed!")
        }
        return a / b
    }
}