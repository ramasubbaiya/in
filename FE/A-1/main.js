function isPrimeNumber() {
    let input = document.getElementById('inputNumber').value;
    let isPrime = false;
    let outputText = "Please enter a valid number!";

    if (input && input > 0) {
        for (let i = 2; i < (input / 2); i++) {
            if (input % i == 0) {
                isPrime = true;
            }
        }
        outputText = isPrime ? 'It is a Prime Number' : 'It is not a Prime Number';
    }

    document.getElementsByTagName('h3')[0].innerHTML = outputText;
}