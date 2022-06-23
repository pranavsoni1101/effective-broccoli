// Array Synatx in JS is given as:
// array_name = [item1, item2, item3, ... ];

// Question
// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

let array = [50, 20, 34, 45, 89, 69, 76, 6, 72, 54];
let n = array.length;

const getMin =  (array, n) => {
    let min = array[0];
    for(let i = 0 ; i < n; i++){
        min = Math.min(min, array[i])
    }
    return min;
}

const getMax =  (array, n) => {
    let max = array[0];
    for(let i = 0 ; i < n; i++){
        max = Math.max(max, array[i])
    }
    return max;
}

console.log("Maximum: ", getMax(array, n) );
console.log("Minimum: ", getMin(array, n));

