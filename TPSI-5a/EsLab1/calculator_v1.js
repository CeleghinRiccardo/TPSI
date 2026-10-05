const n1Elem= document.getElementById("n1")
const n2Elem= document.getElementById("n2")
const calcolaBtn= document.getElementById("calcolaBtn")
const resElem= document.getElementById("result")

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

function compute(f, a, b){
    return f(a,b)
}

calcolaBtn.addEventListener("click", function () {
    const a = Number(n1Elem.value)
    const b = Number(n2Elem.value)
    
    const chosenOp = chooseOp(op.value)
    const res = compute(chosenOp, a, b)
    resElem.textContent= res
    
    console.log(res)
})