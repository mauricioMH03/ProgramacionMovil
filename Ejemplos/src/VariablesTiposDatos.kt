//Existen 3 tipos de variables en kotlin
/*
var: variables que pueden cambiar su valor (mutables)
val: variables que no pueden modificar su valor (inmutables), la asignación puede suceder en runtime
const: tampoco se puede modificar su valor, pero la asignación de su valor se determina en compile time o tiempo de compilación*/

const val PI = 3.1416
const val number3= 24
//Las variables const se declaran de manera global

fun identificador(){
    println("Ingresa un valor para identificar que tipo de dato se está ingresando")
}


fun identificarTipoDato(dato: Any) {
    when (dato) {
        is String -> println("Es una cadena (String)")
        is Int -> println("Es un entero (Int)")
        is Double -> println("Es un número decimal (Double)")
        else -> println("Es de otro tipo")
    }
}

fun main(){

    val number1 = 12

    //number1 = 34
    // aquí saldria un error como: Kotlin: Val cannot be reassigned
    println(number1)

    //const val number3= 24
    //aqui habria un error como este: Modifier 'const' is not applicable to 'local variable'
    //a diferencia es que const está pensado para declarar variables de forma global,
    // mientras que val o var de manera local porque const se declara en tiempo de compilación.
    println(number3)

    //Declaracion implicita
    //La asignación de tipo de dato en la variable es automática dependiendo del dato.
    //Vamos a imprimir el tipo de dato de cada valor implícito

    val implicitVal = "Esta es una string implícita" //Debe ser String
    println(implicitVal.javaClass.kotlin)

    val implicitNumber = 13 //Debe ser Int
    println(implicitNumber.javaClass.kotlin)

    //Declaración Explicita.
    //Permite conocer el tipo de dato que va a almacenar la variable, sirve para fijar una variable con una base
    //de tipo en una clase y lanzar un error al asignar mal un tipo de dato.

    //val explicitVal: Int = "Aprende Kotlin con UPIICSA"
    // println(explicitVal.javaClass.kotlin)
    // Si tratamos de hacer esto nos sale un error:
    //Type mismatch.
    //Required: Int
    //Found: String

    val explicitVal: String = "Aprende Kotlin con UPIICSA"
    println(explicitVal.javaClass.kotlin)

    // Números (Numbers)
    //val byte: Byte = 127 // 8 bits
    //val short: Short = 1234 // 16 bits
    //val int: Int = 324 // 32 bits
    //val long: Long = 1000000000000 // 64 bits

    var long = 27L //Long
    println(long.javaClass.kotlin)

    //Constantes literales Se pueden escribir los números en su representación binaria y hexadecimal (no así en octal)
    val hexadecimal = 0x0F
    println(hexadecimal.javaClass.kotlin)
    val binary = 0b00001011
    println(binary.javaClass.kotlin)


    var decimal: Float = 3.5F

    var c = PI * decimal

    println("El perímetro del círculo es: $c")


}