class Bank(private var accountname: Long = 0, private var pincode: Int = 0, private var balance: Double = 0.0) {


    var accountname_GetSet: Long = accountname
        get() {
            return field
        }
        set(value) {
            field = value
        }


    var pincode_GetSet: Int = pincode
        get() {
            return field
        }
        set(value) {
            field = value
        }


    var balance_GetSet: Double = balance
        get() {
            return field
        }
        set(value) {
            field = value
        }


    fun getBalance() {

        println("Balance: ${balance_GetSet}")

    }


    fun withdraw(money:Double) {

        if(money>balance)
        {
            println("\nYou don't have enough money in your balance")
        }
        else {

            println("\nBalance before withdraw: ${balance}")

            balance = balance - money

            println("Withdraw: ${balance}")

            println("Balance after withdraw: ${balance}\n")
        }
    }

    fun addMoney(money:Double) {

        if(money>10000)
        {
            println("\nYou cannot deposit more than ${10000}")
        }
        else {

            println("\nBalance before adding money: ${balance}")

            balance = balance + money

            println("Added money: ${balance}")

            println("Balance after adding money: ${balance}\n")
        }
    }


    fun getAccount() {

        println("Account: ${accountname_GetSet}")
        getBalance()

    }
}