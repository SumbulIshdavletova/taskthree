fun main() {
    var amount = 20030.00
    val monthlyUser = true

    if (monthlyUser == false) {
        if (amount <= 1000) {
            println("Ваша конечная цена $amount")
        } else if (amount > 1001 && amount <= 10_000) {
            amount -= 100
            println("Ваша конечная цена $amount")
        } else {
            amount -= (amount * 5 / 100)
            println("Ваша конечная цена $amount")
        }
    } else {
        if (amount <= 1000) {
            amount -= amount * (amount * 1 / 100)
            println("Ваша конечная цена $amount")
        } else if (amount > 1000 && amount <= 10_000) {
            amount = amount - (amount * 1 / 100) - 100
            println("Ваша конечная цена $amount")
        } else {
            amount -= (amount * 5 / 100)
            amount -= (amount * 1 / 100)
            println("Ваша конечная цена $amount")
        }
    }
}