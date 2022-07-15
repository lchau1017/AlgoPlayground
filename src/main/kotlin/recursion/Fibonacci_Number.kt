package recursion

class Fibonacci_Number {

    fun solution(n: Int): Int {
        return fib(n)
    }

    private fun fib(n: Int): Int {
        return if (n > 1) {
            fib(n - 1) + fib(n - 2)
        } else {
            if (n == 1) {
                return 1
            } else {
                return 0
            }
        }
    }
}