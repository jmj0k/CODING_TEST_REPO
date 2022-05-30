/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    
    let fibo_arr = [0, 1];
    
    for (let i = 2; i < n + 1; i ++) {
        let num = fibo_arr [i - 1] + fibo_arr [i - 2];
        fibo_arr.push(num);
    }
    return fibo_arr[n];
    
};