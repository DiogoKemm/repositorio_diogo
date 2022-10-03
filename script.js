function valorFinal() {
    const codigo = document.getElementById('codigo').value;
    let quantidade = document.getElementById('quantidade').value;
    var preco;

    if (codigo == 100) {
        preco = 1.70;
    } else if (codigo == 101) {
        preco = 2.30;
    } else if (codigo == 102) {
        preco = 2.60;
    } else if (codigo == 103) {
        preco = 2.40;
    } else if (codigo == 104) {
        preco = 2.50;
    } else if (codigo == 105) {
        preco = 1;
    }

    document.getElementById('valorFinal').innerHTML = Math.round(preco * quantidade);
}

function quadrado() {
    let i;
    let teste;
    for(i = 0; i <= 100; i++) {
        if (i % 2 == 0) {
            teste = i * 2;
            console.log(teste);
        }
    }
}

quadrado();

