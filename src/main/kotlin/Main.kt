fun main() {
    var bobik = Dog("Bobik", 2, "Овчарка")
    var dogs = arrayOf(Dog("Bobik", 2, "Овчарка"), Dog("Bob", 3, "Mixed"))
    dogs[1].weight = 15
    dogs[1].bark()
}