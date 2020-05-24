import java.math.BigInteger

fun main() {
    val start = System.currentTimeMillis()

    for (i in 1..10) {
        calculateFactorial(10.toBigInteger())
    }

    val end = System.currentTimeMillis()

    print("Calculated 10 factorials of 100000 in ${end-start}")
}

fun calculateFactorial(n: BigInteger): BigInteger {
    if ( n == BigInteger.ZERO) {
        BigInteger.ONE
    }
    var i = BigInteger.ONE
    var result = BigInteger.ONE

    while (i <= n) {
        result = result.multiply(i)
        i = i.inc()
    }

    return result
}