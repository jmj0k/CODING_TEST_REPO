/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    for (let i in nums) {
        //map에 값을 키로 인덱스를 값으로 줌 
        if (map[target - nums[i]] != undefined) {
            return [map[target - nums[i]], i];
        } else map[nums[i]] = i;
    }
};