fun main() {
var Details= CurrentAccount("Tanyasis Mayiana", "123456",600)
    println(Details.deposit(300.0))
    println(Details.withdraw(200.0))
    Details.details()
    product("rice",3,150,"groceries")
    fun listOfProduct(){

    }
    println( evenIndices("banana"))
}
open class CurrentAccount(var accountName:String,var accountNumber:String,var balance:Int ){
    fun deposit(amount: Double){
        var newBalance= amount+balance
        println(newBalance)
    }
    fun withdraw(amount: Double){
        var decresedAmount= balance-amount
        println(decresedAmount)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
 class SavingsAccount(accountName: String,accountNumber: String,balance: Int){
     fun save (withdrawals: Int){

     }
 }

data class product(var name:String,var weight:Int,var price:Int,var category:String)

fun evenIndices(word:String):String{
    var word= "banana"
    word.indices
    return word
}