/**
 * @param {string} s
 * @return {number}
 */

var lengthOfLongestSubstring = function(s) {
    let longest = 0;
    let current = "";
    
    for (let i = 0; i < s.length; i++) {
        current = current.substring(current.indexOf(s[i]) + 1)        
        current += s[i];
        if (current.length > longest) longest = current.length;
    }
    return longest;
};