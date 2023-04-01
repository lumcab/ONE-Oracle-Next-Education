const d = document,
    noTexto = d.querySelector(".no-texto"),
    output = d.querySelector(".texto-desencriptado"),
    captura = d.getElementById("capturador"),
    mostrar = d.querySelector(".mostrar-texto-desencriptado");

const removeAccents = (str) =>
{
    return str.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
};

function Encriptar()
{
    let capturar = captura.value;
    capturar = removeAccents(capturar);
    capturar = capturar.replaceAll(/[\!\@\#\$\%\^\&\*\)\(\+\=\.\<\>\{\}\[\]\:\;\'\"\|\~\`\_\-]/g,"");
    if (capturar === "") {
        alert("Por favor, ingrese un texto para ser encriptado.");
    } else {
        let encriptar = capturar
            .toLowerCase()
            .replaceAll("e", "enter")
            .replaceAll("i", "imes")
            .replaceAll("a", "ai")
            .replaceAll("o", "ober")
            .replaceAll("u", "ufat");

        noTexto.style.display = "none";
        output.classList.remove("no-display");
        mostrar.value = encriptar;
    }
}

function Desencriptar()
{
    let capturar = captura.value;
    capturar = removeAccents(capturar);
    capturar = capturar.replaceAll(
        /[\!\@\#\$\%\^\&\*\)\(\+\=\.\<\>\{\}\[\]\:\;\'\"\|\~\`\_\-]/g,
        ""
    );
    if (capturar === "") {
        alert("Por favor, ingrese un texto para ser desencriptado.");
    } else {
        let desencriptar = capturar
            .toLowerCase()
            .replaceAll("enter", "e")
            .replaceAll("imes", "i")
            .replaceAll("ai", "a")
            .replaceAll("ober", "o")
            .replaceAll("ufat", "u");

        noTexto.style.display = "none";
        output.classList.remove("no-display");
        mostrar.value = desencriptar;
    }
}

function copiar()
{
    navigator.clipboard.writeText(mostrar.value);
    alert("¡Copiado al portapapeles!");
}
