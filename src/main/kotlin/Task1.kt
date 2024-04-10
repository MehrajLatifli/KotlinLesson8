import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var bankArray = arrayOf<Bank>()

    val bank1 = Bank(1234567890, 2431, 1000.0)
    val bank2 = Bank(9876543212, 1234, 500.0)

    bankArray += bank1
    bankArray += bank2

    print("Enter account: ")
    val pincode = scanner.nextInt()

    for ((index, item) in bankArray.withIndex()) {
        if (bankArray.contains(bank1)) {
            if (bank1.pincode_GetSet == pincode) {
                bank1.getAccount()

                Choose(scanner, bank1)
                break
            }
        }

        if (bankArray.contains(bank2)) {
            if (bank2.pincode_GetSet == pincode) {
                bank2.getAccount()

                Choose(scanner, bank2)
                break
            }
        } else {
            println("There is no such account")
            break
        }
    }
}


fun Choose(scanner: Scanner, bank: Bank) {
    println("\n1 <- Add money")
    println("2 <- Withdraw money")
    print("Enter your choice: ")
    val choice = scanner.nextInt()

    when (choice) {
        1 -> {
            print("Enter money: ")
            val money = scanner.nextDouble()
            bank.addMoney(money)
        }
        2 -> {
            print("Enter money: ")
            val money = scanner.nextDouble()
            bank.withdraw(money)
        }
        else -> println("Invalid choice")
    }
}
