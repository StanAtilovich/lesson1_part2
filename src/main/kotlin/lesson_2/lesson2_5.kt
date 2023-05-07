package lesson_2

fun main(){
    fun calculateFutureValue(initialDeposit: Int, annualRate: Double, years: Int): Double {
        val rate = 1 + annualRate
        val compoundInterest = Math.pow(rate, years.toDouble())
        val futureValue = initialDeposit * compoundInterest
        return futureValue
    }

    val futureValue = calculateFutureValue(70_000, 0.167, 20)
    println(String.format("Ваш вклад через 20 лет составит %.3f рублей",futureValue))

}