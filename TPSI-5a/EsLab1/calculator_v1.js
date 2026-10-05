const n1Elem= document.getElementById("n1")
const n2Elem= document.getElementById("n2")
const calcolaBtn= document.getElementById("calcolaBtn")


const op= document.getElementById("operation")

function sum(a, b){
    return a+b
}

function dif(a, b){
    return a-b
}

function chooseOp(operand) {
    switch(operand){
    case '+': 
    return sum

    case '-':
        return dif

    }
}

calcolaBtn.addEventListener("click", function () {
    const a = Number(n1Elem.value)
    const b = Number(n2Elem.value)
    
    const chosenOp = chooseOp(op.value)
    const res = compute(chosenOp, a, b)
})