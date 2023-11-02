package One

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println(gameChoice)
}
fun getGameChoice(optionParam: Array<String>) =
    optionParam[(Math.random()*optionParam.size).toInt()]
