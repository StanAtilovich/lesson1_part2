package lesson_2



fun main(){
    val trainLeftHour = "9:39"
    val trainLeft = 9*60+39
    println("Поезд выехал в $trainLeftHour или $trainLeft минут")

    val trainOnTheWay = 457
    println("Поезд в пути $trainOnTheWay минут")

    val arrivalTimeMinutes = trainLeft + trainOnTheWay
    println("Время прибытия поезда в минутах $arrivalTimeMinutes")

    fun minutesToHours(arrivalTimeMinutes: Int): Pair<Int, Int>{
        val hours = arrivalTimeMinutes / 60
        val remainder = arrivalTimeMinutes % 60
        return Pair(hours, remainder)

    }

    val (hours, reminder) = minutesToHours(arrivalTimeMinutes)
    println("Поезд приехал в $hours часов $reminder минут")



}