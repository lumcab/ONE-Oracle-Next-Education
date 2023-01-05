
var pantalla = document.querySelector("canvas");
var pincel = pantalla.getContext("2d");
pincel.fillStyle = "#080808";
pincel.fillRect(0, 0, 300, 3);

function Dibujar(x, y)
{
    pincel.fillStyle = '#28b1bc';
    pincel.fillRect(x, y, 10, 2);
}

function limpiar()
{
    pincel.clearRect(0, 0, 300, 3);
}

x = 0;
sentido = 1;
function actualizar()
{
    limpiar();
    Dibujar(x, 1);
    if (x > 290) {
        sentido = -1;
    } else if (x < 0) {
        sentido = 1;
    } x = x + sentido;
}

window.onload = setInterval(actualizar, 5)