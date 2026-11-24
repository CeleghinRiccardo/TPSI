// Esercizio 2: Contatore
let valore = document.getElementById("valore");
const btnMeno10 = document.getElementById("meno10");
const btnMeno1 = document.getElementById("meno1");
const btnPiu1 = document.getElementById("piu1");
const btnPiu10 = document.getElementById("piu10");
const btnReset = document.getElementById("azzera");
const display = document.getElementById("display");
let valoreCorrente = 0;

function cambiaDi(valoreCorrente, n) {
    const nuovoValore = () => { return valoreCorrente + n; };
    valoreCorrente = nuovoValore.value;
    display.textContent = valoreCorrente;
}

function reset(valore) {
    valore=0
    valoreCorrente = 0;
}

btnMeno10.addEventListener("click",cambiaDi(valoreCorrente, -10))
btnMeno1.addEventListener("click",cambiaDi(valoreCorrente, -1))
btnPiu1.addEventListener("click",cambiaDi(valoreCorrente, 1))
btnPiu10.addEventListener("click",cambiaDi(valoreCorrente, 10))
btnReset.addEventListener("click",reset(valoreCorrente))