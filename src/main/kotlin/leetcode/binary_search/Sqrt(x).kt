package leetcode.binary_search

class `Sqrt(x)` {

    fun solution(x: Int): Int {
        if (x < 2) return x
        var num: Long
        var pivot: Int
        var left = 2
        var right = x / 2
        while (left <= right) {
            pivot = left + (right - left) / 2
            num = pivot.toLong() * pivot
            if (num > x) right = pivot - 1
            else if (num < x) left = pivot + 1
            else return pivot
        }
        return right
    }

}