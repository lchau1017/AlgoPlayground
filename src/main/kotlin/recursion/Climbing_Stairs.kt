package recursion

class Climbing_Stairs {

    fun solution(n: Int): Int {
//        return climbStairs(n)
        return dp_bottom_up(n)

    }

    //worse tc
    private fun climbStairs(n: Int): Int {
        return if (n == 1 || n == 0)
            1
        else
            climbStairs(n - 1) + climbStairs(n - 2)
    }

    private fun dp_bottom_up (n: Int): Int {
        if (n == 1) {
            return 1
        }
        val dp = IntArray(n + 1)
        dp[1] = 1
        dp[2] = 2
        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n]
    }

}