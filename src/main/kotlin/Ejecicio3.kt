



fun main() {

    val u1 = 27.0
    val u2 = 350.0
    val u3 = 10.0

    val c = "Celsius"
    val f = "Fahrenheit"
    val k = "Kelvin"

    val cf = { ini: Double -> (((9.0 / 5.0) * ini) + 32.0) }
    val kc = { ini: Double -> ini - 273.15 }
    val fk = { ini: Double -> (((5.0 / 9.0) * (ini - 32)) + 273.15) }

    printFinalTemperature(u1, c, f, cf)
    printFinalTemperature(u2, k, c, kc)
    printFinalTemperature(u3, f, k, fk)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")

}