import java.math.BigInteger

object Factorial {
    fun calculateFactorial(n: BigInteger): BigInteger {
        if (n == BigInteger.ZERO) {
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
}
