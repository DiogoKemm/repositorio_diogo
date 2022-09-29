function fatorial(num) {
    if (num < 0) {
        return -1;
    } else if (num == 0) {
        return 1;
    } else {
        return (num * fatorial(num - 1))
    }
}

function formulaBinomial() {
    var n = document.getElementById('n').value;
    var x = document.getElementById('x').value;
    var p = document.getElementById('p').value;
    console.log(combinatoria(n, x) * (p**x) * ((1 - p)**(n-x))); 
}

function combinatoria(teste, teste2) {
    return fatorial(teste) / (fatorial(teste2)*fatorial((teste-teste2)));
}

