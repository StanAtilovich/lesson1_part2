package lesson_2

fun main(){
    val permanentEmployee = 50
    val permanentEmployeeSalary = 30_000
    val intern = 30
    val internSalary = 20_000
    val employee = permanentEmployee + intern


    val allPermanentEmployeeSalary = permanentEmployee * permanentEmployeeSalary
    println("Зарплата постоянных сотрудников: $allPermanentEmployeeSalary")

    val allInternSalary = intern * internSalary
    println("Зарплата интернов: $allInternSalary")

    val salary = allPermanentEmployeeSalary + allInternSalary


    val averageSalary = salary/employee
    println("Зарплата сотрудника после прихода интернов: $averageSalary")



}