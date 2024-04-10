data class Customer(val name: String, val surname: String, val customerNumber: String) {

    fun printInfo() {
        println("Name: $name $surname")
        println("Customer nuumber: $customerNumber")
    }

    fun calculatePrice(itemCount: Int, price: Double): Double {

        val totalPrice = itemCount * price
        val discountThreshold = 5
        val discountPercentage = 30

        return if (itemCount > discountThreshold) {
            val discount = totalPrice * discountPercentage / 100
            totalPrice - discount
        } else {
            totalPrice
        }
    }
}