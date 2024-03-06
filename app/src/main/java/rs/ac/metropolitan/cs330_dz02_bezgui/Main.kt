package rs.ac.metropolitan.cs330_dz02_bezgui

fun main()
{
    println("Unesite visinu (cm): ")
    val height = readLine()?.toFloatOrNull()
    println("Unesite težinu (kg): ")
    val weight = readLine()?.toFloatOrNull()

    if (height != null && weight != null && height > 0 && weight > 0) {
        val bmi = calculateBMI(height, weight)
        println("BMI: $bmi")
    } else {
        println("Uneli ste neispravne vrednosti.")
    }
}

fun calculateBMI(height: Float, weight: Float): Float {
    return weight / (height * height)*10000
}