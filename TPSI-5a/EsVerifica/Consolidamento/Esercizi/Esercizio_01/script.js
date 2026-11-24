// Esercizio 1: Convertitore

const valore = document.getElementById("valore");
const btnConverti = document.getElementById("converti");
const menuConversione = document.getElementById("conversione");
const result = document.getElementById("risultato");
const error = document.getElementById("error");



const conversioni = {
    "km-m": (valore) => valore * 1000,
    "m-km": (valore) => valore / 1000,
    "C-F": (valore) => (valore * 9/5) + 32,
    "F-C": (valore) => (valore - 32) * 5/9,
    "ore-min": (valore) => valore * 60,
    "min-ore": (valore) => valore / 60,
    "giorni-ore": (valore) => valore * 24,
}
function computeConversione(f, a) {
    return f(a);
}


function convertitore(){
    const value= Number(valore.value)
    const res= computeConversione(scegliOperazione(menuConversione.value), value)
    result.textContent=res
}


function scegliOperazione(testo) {
    const op = conversioni[testo];
    if(testo === undefined) throw new Error("CONVERSIONE INESISTENTE "+testo)
        return op;
}


function scegli(mappa, key){
    if(mappa[key] === undefined) throw new Error("NON SUPPORTATO "+key)
    return mappa[key];
    
}

valore.addEventListener("input", convertitore)

btnConverti.addEventListener("click", convertitore) 
