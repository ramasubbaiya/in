// check button
function checkMe() {
    let input = document.getElementById('inputNumber').value;
    let outputText = 'Please enter a valid number!';

    // check input is greater than zero, if not ask to reenter the number
    if (input > 0) {
        outputText = (isPrimeNumber(input)) ? 'It is a Prime Number' : 'It is not a Prime Number';
    }

    // show the result
    document.getElementsByTagName('h3')[0].innerHTML = outputText;
}

// isPrimeNumber gets a number greater than zero as an arguments, returns true when the input is a prime number else it is false
var isPrimeNumber = function(input) {

    if (input < 2) return false;

    if (input % 2 == 0) return false;

    for (let i = 3; i <= Math.floor(Math.sqrt(input)); i += 2) {
        if (input % i == 0) {
            return false;
        }
    }

    return true;
}