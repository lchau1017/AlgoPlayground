package leetcode.array

class `1_TwoSum` {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mm = HashMap<Int, Int>()

        var res = mutableListOf<Int>()

        for (i in nums.indices) {
            mm[nums[i]] = i
        }

        for (i in nums.indices) {
            val temp = mm[target - nums[i]]
            if (temp != null && temp > i) {
                res.add(i)
                res.add(mm.getOrElse(target-nums[i]) { 0 })
            }
        }

        return res.toIntArray()
    }
}