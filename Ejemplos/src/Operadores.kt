data class Punto(val x: Double, val y: Double)
fun calcularPendiente(punto1: Punto, punto2: Punto): Double {
    return (punto2.y - punto1.y) / (punto2.x - punto1.x)
}
fun main() {
    val punto1 = Punto(4.0,3.0)
    val punto2 = Punto(-3.0,-2.0)
    val pendiente = calcularPendiente(punto1, punto2)
    println("La pendiente es: $pendiente")
}