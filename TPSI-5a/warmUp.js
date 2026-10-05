function double(n) {
    return n*2
}

function increment(n){
    return n+1
}

function applay(f, x){
    return f(x)
}

console.log(applay(double, 21));
console.log(applay(increment, 2));
console.log(applay(double, applay(increment, 5)));

