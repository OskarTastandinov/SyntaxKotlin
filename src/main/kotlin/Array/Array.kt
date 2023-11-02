package Array
fun testArray2(): ArrayList<Int> {
    var arr = arrayListOf(1,1,2,3,4)
    return arr
}
fun main(){
    //testArray()
    for (x in testArray2()) println(x)




}
fun testArray(){
    var arr = arrayOf(1,2,3,4,5)
    println(arr.size)
    println(arr.get(0))
    println(arr[0])
}

