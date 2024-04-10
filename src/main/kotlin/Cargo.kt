data class Cargo (var sender: String = "", var recipient:String = "", var weight:Double = 0.0){

    fun InfoOfCargo():String
    {
        return "Sender: ${sender}, Recipient: ${recipient}, Weight: ${weight}"
    }

}