const n1Elem= document.getElementById("n1")
const n2Elem= document.getElementById("n2")
const calcolaBtn= document.getElementById("calcolaBtn")
const resElem= document.getElementById("result")
const op= document.getElementById("operation")



const operations = {
    '+': (a, b) => a + b,
    '-': (a, b) => a - b,
    '*': (a, b) => a * b,
    '/': (a, b) => {
        if (b === 0) {
            throw new err("Division by zero is not allowed")
        }
        return a / b
    },
    '^': (a, b) => a ** b
}


function compute(f, a, b){
    return f(a,b)
}

calcolaBtn.addEventListener("click", function () {
    const a = Number(n1Elem.value)
    const b = Number(n2Elem.value)
   try{ 
    const res = compute(operations[op.value], a, b)
    resElem.textContent = res
   }catch (err) {
    resElem.textContent= err.message
   }
})