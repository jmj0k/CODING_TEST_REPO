/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if (!nums.length) return 0;
    let idx = 1
    for(let i = 0 ; i < nums.length - 1; i++) {
        if (nums[i] !== nums[i+1]) {
            nums[idx++] = nums[i+1]
        }
    }
    return idx
    
};