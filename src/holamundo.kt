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

}