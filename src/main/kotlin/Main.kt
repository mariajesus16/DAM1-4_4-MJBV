class Pila<T> {
    private var lista = mutableListOf<T>()

    fun top(): T = lista[0]
    fun push(something: T) = lista.add(0, something)
    fun pop(): Boolean = lista.remove(lista[0])
    fun empty(): Boolean = lista.isEmpty()
    fun isNotEmpty(): Boolean = lista.isNotEmpty()

}

fun <T> reverse(lista: List<T>): List<T> {
    val pila = Pila<T>()
    val iterador = lista.iterator()
    val lista2 = mutableListOf<T>()
    while (iterador.hasNext()) {
        pila.push(iterador.next())
    }
    while (pila.isNotEmpty()) {
        pila.top()?.let { lista2.add(it) }
        pila.pop()
    }
    return lista2
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev)) {
        println("Error")
    } else {
        println("Correcto")
        println(numbersRev)
    }
}