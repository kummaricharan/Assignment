let currentInput = '';
let previousOperand = '';
let selectedOperator = '';

function appendToDisplay(value) {
    currentInput += value;
    updateDisplay();
}

function clearDisplay() {
    currentInput = '';
    previousOperand = '';
    selectedOperator = '';
    updateDisplay();
}

function setOperator(operator) {
    if (currentInput !== '') {
        if (previousOperand !== '') {
            calculateResult();
        } else {
            previousOperand = parseFloat(currentInput);
        }
        currentInput = '';
        selectedOperator = operator;
    }
}

function calculateResult() {
    if (selectedOperator === '' || previousOperand === '' || currentInput === '') {
        return;
    }

    const currentOperand = parseFloat(currentInput);

    switch (selectedOperator) {
        case '+':
            currentInput = (previousOperand + currentOperand).toString();
            break;
        case '-':
            currentInput = (previousOperand - currentOperand).toString();
            break;
        case '*':
            currentInput = (previousOperand * currentOperand).toString();
            break;
        case '/':
            if (currentOperand === 0) {
                currentInput = 'Error';
            } else {
                currentInput = (previousOperand / currentOperand).toString();
            }
            break;
    }

    previousOperand = parseFloat(currentInput);
    selectedOperator = '';
    updateDisplay();
}

function updateDisplay() {
    document.getElementById('display').value = currentInput;
}
