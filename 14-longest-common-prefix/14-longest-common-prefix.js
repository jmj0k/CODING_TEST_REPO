/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let p = strs[0];
    
    for (let i in p) {
        for (let s of strs) {
            if (s[i] !== p[i]) return s.slice(0, i);
        }
    }
    return p;
    
};