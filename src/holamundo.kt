/*
Primeros pasoscon Kotlin
 */

fun main(args: Array<String>)
{
    var saludo: String = "Hola"
    var nombre: String = "Fabian"
    var indice: Int = 0
    val dias = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println("Concatenacion")
    println("$saludo $nombre")
    when(saludo)
    {
        "hola" -> println("Es hola")
        "Hola" -> println("Es Hola")
        "holas" -> println("Es holas")
        else ->
        {
            println("No se encontro el saludo")
        }
    }
    when(indice)
    {
        in 1..5 -> println("Es menor que 5") //con in puede definir rangos de comparacion
        in 6..9 -> println("Es mayor que 6")
        !in 1..9  -> print("No es un numero entre 1 y 9")
    }

    val respuesta : String = when(saludo) //when puede guardar la respuesta.
    {
        "hola" -> "Es hola"
        "Hola" -> "Es Hola"
        else -> "No reconoci el saludo"
    }
    println(respuesta)
    print("\n")
    println(dias.get(3))
    for (posicion in dias.indices)
            println(dias.get(posicion))
    /*
    Otra variante es obtener del for es que in devuelva la posicion y el valor
     */
    for ((posicion,valor) in dias.withIndex())
        println("En la posicion $posicion tenemos el dia $valor")


    /*
    * Otra forma de solo presentar los valores
    * */
    for(dias in dias)
        println(dias)

    /*
    * Lista de valores val inmutables o var mutables
    *
    * */

    val cadena: List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    var tamaño = cadena.size
    var primero = cadena.first()
    var ultimo = cadena.last()
    println("Tamaño: $tamaño Primer dato: $primero Ultimo dato: $ultimo")

    /*
    *  Tambien se pueden aplicar filtros
    * */
    val a = cadena.filter { it == "Lunes" || it == "Jueves" }   //busca Lunes o Jueves y almacena el resultado en la variable a. Admite varios filtros.
    println(a)
    /*
      Lista mutables
     */
    var cadenaVariable: MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado") //Cuidado hay que declarar la lista como MutableList
    println(cadenaVariable) //Sin domingo
    cadenaVariable.add("Domingo")
    println(cadenaVariable) //Agregado domingo al final
    cadenaVariable.add(0,"Semana") //Tambien puedo agregar en un indice especifico, queda claro que agrega y no borra nada
    println(cadenaVariable)

    cadenaVariable.none() //Nos devuelve un true si está vacía la lista
    cadenaVariable.firstOrNull() //Nos devolverá el primer campo, y si no ha
    cadenaVariable.elementAtOrNull(2) //El elemento del índice 2, si no hay,
    cadenaVariable.lastOrNull() //Último valor de la lista o null

    /*
    * Recorrer una lista mutable
    * */
    for (entrada in cadenaVariable)
        println(entrada)
    for ((indice,contenido) in cadenaVariable.withIndex())
        println("La posicion $indice contiene $contenido")

    var nuevalista: MutableList<String> = mutableListOf()

    cadenaVariable.forEach{
        nuevalista.add(it+":")  //Concateno un caracter a cada elemento de la lista de String
    }
    println(nuevalista)
}