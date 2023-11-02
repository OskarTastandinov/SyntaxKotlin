package Fun
fun main(){
    println(test("Alex", "Marley", 18, false))
    enter(12,"Bob")
}
fun test(firstName: String, lastName: String, age: Int, parents: Boolean): Any{
    val data = ("$firstName $lastName $age $parents")
    return data
}
fun enter(age: Int, name: String){
    println("Возраст: $age, имя: $name ")
}