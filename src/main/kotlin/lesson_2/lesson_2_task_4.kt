package lesson_2

fun main() {
    val cristal = 7
    val ore = 11
    val cristalExtraction = 7
    val oreExctraction = 12

    if (cristalExtraction > cristal) {
        val print = cristalExtraction + (cristal * 0.20).toInt()
        println("Было добыто $print кристалов с бафф")
    } else {
        println("Было добыто $cristalExtraction кристалов")
    }

    if (oreExctraction > ore) {
        val print = oreExctraction + (ore * 0.20).toInt()
        println("Было добыто $print руды с бафф")
    } else {
        println("Было добыто $oreExctraction руды")
    }

}