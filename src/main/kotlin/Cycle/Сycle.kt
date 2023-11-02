package Cycle
fun testsCycle(){
    var range = 1..5
     for (x in range)  println(x)
}
fun testsCycle1(){
    for (x in 1..10 step 2) println(x)
}
fun testsCycle2(){
    for (x in 10 downTo 1 step 2) println(x)
}
fun testsCycle3(){
    for (x in 1 until 10) println(x)
}
fun testsCycle4(){
    var x = 1
    while (x < 11) {
        x =+ 1 }
}
fun testsCycle5(){ // Работа со списком
    var list = mutableListOf("c", "a", "t")
    if (list[0] == "c") {
        list[0] = "k"
        for (list1 in list) print(list1)
    }
}
fun main(){
    //testsCycle()
    //testsCycle1()
    //testsCycle2()
    //testsCycle3()
    testsCycle4()
    testsCycle5()


}