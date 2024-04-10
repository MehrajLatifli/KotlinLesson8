fun main() {
    val customer = Customer("Name_1", "Surname_2", "1234567890")

    customer.printInfo()

    val itemCount = 6
    val pricePerItem = 100.0

    val totalPrice = customer.calculatePrice(itemCount, pricePerItem)
    println("Total Price after discount: $totalPrice")
}