def containNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums) 
    if (num < 0)
      exists = true

  exists
}

def containNeg2(nums: List[Int]): Boolean = nums.exists(_ < 0)
