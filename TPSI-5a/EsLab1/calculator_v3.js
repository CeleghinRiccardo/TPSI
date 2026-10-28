const n1Elem = document.getElementById("n1");
const n2Elem = document.getElementById("n2");
const calcolBtn = document.getElementById("calcolaBtn")
const sumBtn = document.getElementById("sumBtn")
const sotBtn = document.getElementById("sotBtn")
const divBtn = document.getElementById("divBtn")
const prodBtn = document.getElementById("prodBtn")

const op = document.getElementById("operation");
const resElem = document.getElementById("result")
const errElem = document.getElementById("error")

let interval;
const LIMIT = 1000000;

const regole =[
    (t1, t2) =>{
    if(t1 === ""|| t2 === "") throw new Error("Inserre entrambi i valori")
    },
    (a, b) => {
    if(a > LIMIT || b > LIMIT || a < -LIMIT || b < -LIMIT) throw new Error("BOOM! Valore troppo grande o troppo piccolo")
    },

]

//JS OBJ = hashmap -> K,V
const operations = {
    '+': (a, b) => a + b,
    '-': (a, b) => a - b,
    '/': (a, b) => {
        if (b === 0) throw new Error("Denominator is zero.")
        return a / b;
    },
    '%': (a, b) => {
        if (b === 0) throw new Error("Divisione per zero.")
        return a % b;
    },
    '**': (a, b) => a ** b,
    'max': (a, b) => Math.max(a, b),
    'min': (a, b) => Math.min(a, b),
    'media': (a, b) => (a + b) / 2
}

//Not the usual one... ;)
function chooseOp(symbol) {
    const op = operations[symbol]
    if (op === undefined) throw new Error("Operation not recognised: " + symbol)
    return op
}

function scegliOperaziome(simbolo) {
    const v = operations[simbolo]
    if(v === undefined) throw new Error("Operazione non supportata: " + simbolo)
    return v;
}

function valida (regole, v1, v2) {
    for (const r of regole) {
        r(v1, v2)
    }   
}

function compute(f, a, b) {
    return a+" "+f.name+" "+b+" = "+f(a, b)
}

function executeComp(a , op, b){
    try {
        valida(regole, n1Elem.value, n2Elem.value)
        //prendere primo numero
        const a = Number(n1Elem.value)
        const b = Number(n2Elem.value)

        const res = compute(scegliOperaziome(op), a, b)
        errElem.textContent = ""
        resElem.textContent = res
    } catch (err) {
        errElem.textContent = err.message
    }
}


function forOperation(sym) {
    return function () {
        executeComp(n1Elem.value, sym, n2Elem.value)
    }
}

sumBtn.addEventListener("click", forOperation(sumBtn.textContent))
sotBtn.addEventListener("click", forOperation(sotBtn.textContent))
divBtn.addEventListener("click", forOperation(divBtn.textContent))
prodBtn.addEventListener("click", forOperation(prodBtn.textContent))


//Come controllo il btn? AEL
calcolBtn.addEventListener("click", function () {
    
    try {
        valida(regole, n1Elem.value, n2Elem.value)
        //prendere primo numero
        const a = Number(n1Elem.value)
        const b = Number(n2Elem.value)
        const res = compute(scegliOperaziome(op.value), a, b)
        errElem.textContent = ""
        resElem.textContent = res
    } catch (err) {
        errElem.textContent = err.message
    }
    clearInterval(interval);

})

//Eseguo quando HTML è renderizzato
document.addEventListener("DOMContentLoaded", () => {
    //setTimeout setInterval
    let i = 0

    setTimeout(() => console.log("qui"), 2000)
    //interval = setInterval(() => console.log("repetion"), 500)
})

n1Elem.addEventListener("input", (e) => {
    let v = e.target.value
    if (v.length >= 10) {
        //n1Elem.disabled = true
        //n1Elem.readOnly = true
        n1Elem.value = v.slice(0, 10)
    }
})