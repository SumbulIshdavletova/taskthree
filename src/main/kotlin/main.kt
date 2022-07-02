fun main() {
<<<<<<< HEAD
    var amount = 2000.00
=======
    var amount = 20030.00
>>>>>>> 332a50146ea0b38dddfafe665cd071dc426c9dbc
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
            amount -= (amount * 1 / 100)
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