// generate random inputs in an arry and get the biggest number
var generateAndTest = function() {

    // new array size with random size from 1 - 10 limit
    let newArrSize = getRandomInt(1, 10);

    let newArr = getNewArrBySize(newArrSize);

    // display the input array in console
    console.table(newArr);

    let result = getBiggestNumber(newArr);

    // display the result in html
    document.getElementsByTagName('h3')[0].innerHTML = result;

    // display the result in console
    console.log("%cResult:", "color: red; font-size:15px;", result);

    // remove the biggest number from array
    removeBiggestNumberFromArr(newArr, result);

    // display the input array after deleting the biggest number in console
    console.table(newArr);
}

// get random inputs in an array by proving max length
var getNewArrBySize = function(newArrSize) {
    let newArr = [];

    for (let i = 0; i < newArrSize; i++) {
        newArr.push(getRandomInt(1, 1000))
    }

    return newArr;
}

// get the largest number from the array
var getBiggestNumber = function(inputArr) {

    let max = Number.MIN_VALUE;
    for (let value of inputArr) {
        if (max < value) {
            max = value;
        }
    }

    return max;
}

// get a random integer between the maximum and minimum values
var getRandomInt = function(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

// 
var removeBiggestNumberFromArr = function(inputArr, value) {
    let key = inputArr.indexOf(value);
    return inputArr.splice(key, 1);
}