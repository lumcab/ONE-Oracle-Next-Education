function juego()
{
    var pantalla = document.querySelector("canvas");
    var pincel = pantalla.getContext("2d");
    pincel.fillStyle = "#080808";
    pincel.fillRect(0, 0, 400, 400);
    var radio = 10;
    var xAleatorio = 200;
    var yAleatorio = 200;

    function DibujarCirculo(x, y, radio, color)
    {
        pincel.fillStyle = color;
        pincel.beginPath();
        pincel.arc(x, y, radio, 0, 2 * Math.PI);
        pincel.fill();
    }

    function disenharObjetivo(x, y)
    {
        DibujarCirculo(x, y, radio + 20, 'red');
        DibujarCirculo(x, y, radio + 10, 'white');
        DibujarCirculo(x, y, radio, 'red');
    }

    function sortearPosition(maximo)
    {
        return Math.floor(Math.random() * maximo);  // floor redondea para abajo
    }

    function limpiar()
    {
        pincel.clearRect(0, 0, 400, 400);
    }

    function actualizar()
    {
        limpiar();
        xAleatorio = sortearPosition(400);
        yAleatorio = sortearPosition(400);
        disenharObjetivo(xAleatorio, yAleatorio);
    }

    function disparar(evento)
    {
        var x = evento.pageX - pantalla.offsetLeft; //pos x
        var y = evento.pageY - pantalla.offsetTop; //pos y
        if ((x < xAleatorio + radio) && (x > xAleatorio - radio) && (y < yAleatorio + radio) && (y > yAleatorio - radio)) {
            alert('Tiro certero');
        }
    }

    setInterval(actualizar, 700);
    pantalla.onclick = disparar;
}
function rect()
{
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

    setInterval(actualizar, 5);
}
window.onload = rect;
//window.onload = juego;