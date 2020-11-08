package harish.hibare.primeno

import java.util.*

fun isPrimeNo(number: Int): Boolean {
    if(number<2) return false
    for (i in 2..number/2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Enter Number  : ")
    val num: Int = sc.nextInt()
    
    if (isPrimeNo(num)) {
        println("$num is a Prime Number")
    } else {
        println("$num is not a Prime Number")
    }
}