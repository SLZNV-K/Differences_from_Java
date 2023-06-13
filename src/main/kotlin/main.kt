package ru.netology

fun main() {
//    Задача №1. Денежные переводы
    println("Задача №1. Денежные переводы")
    println()
    val amount = 1000
    val commission = 0.0075
    val commissionAmount = if (amount * commission > 35) amount * commission else 35
    println("Комиссия при переводе $amount рублей составит: $commissionAmount рублей")
    println("-----------------------------------------------------------------------")

//    Задача №2. Люди/Человеки
    println("Задача №2. Люди/Человеки")
    println()
    val likes = 1539
    val str = if (likes % 10 == 1) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(str)
    println("-----------------------------------------------------------------------")

//    Задача №3. Меломан
    println("Задача №3. Меломан")
    println()
    var price = 100_000
    val discount = 100
    val discountPercentage = 0.05
    val regularUsers = false
    val regularUserDiscount = 0.01

    if (1000 < price && price <= 10_000) {
        price -= discount
        println("Применена скидка 100 рублей")
    }
    if (price > 10_000) {
        price -= (price * discountPercentage).toInt()
        println("Применена скидка 5% от общей суммы")
    }

    if (regularUsers) {
        price -= (price * regularUserDiscount).toInt()
        println("Применена скидка постоянного покупателя 1% от общей суммы")
    }
    println("Сумма после учета всех скидок: $price")
}