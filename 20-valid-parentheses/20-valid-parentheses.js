/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let tmp_arr = [];
    s = s.split('');
    let bracket = {
        '(': ')',
        '[': ']',
        '{': '}',
    };
    let keys = Object.keys(bracket);

    for (let i = 0; i < s.length; i++) {
        if (keys.includes(s[i])) {
            tmp_arr.push(s[i])
        } else {
            if (bracket[tmp_arr[tmp_arr.length - 1]] == s[i]) {
                tmp_arr.pop();
            } else return false;
        }
    }
    if(tmp_arr.length != 0) return false;
    else return true;
    
};