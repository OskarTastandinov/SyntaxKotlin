package ReadLine

fun main(){
    var x = readLine()?.toInt()
    if (x != null) {
        if (x <= 10) {
            println("неправильно")
        }else{
            println(x)
        }
    }
}