package recursion

class Reverse_String {

    fun solution(s: CharArray): CharArray {
        return recursion(s, 0)
    }

    private fun recursion(s: CharArray, count: Int): CharArray {
        val n = s.size - 1
        return if (count <= (n) / 2) {
            val temp = s[count]
            s[count] = s[n - count]
            s[n - count] = temp
            recursion(s, count + 1)
        } else {
            s
        }
    }

}