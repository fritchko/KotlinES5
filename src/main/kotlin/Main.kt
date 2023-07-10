//Scrivi un metodo extension che filtra una lista per valore (es. minore di 500)

//Scrivi un metodo extension che stampa i valori della lista

//Poi crea una lista che ha almeno 10 membri, filtrali e stampa i valori che passano il filtro

fun List<Int>.filterByValue(value: Int): List<Int> {
    return this.filter { it < value}
}

fun List<Int>.printListValues() {
    this.forEach { println(it) }
}

fun main() {
    val listaBella = listOf(100,200,300,400,500,600,700,800,900,1000)
    val filteredList = listaBella.filterByValue(500)
    filteredList.printListValues()
}