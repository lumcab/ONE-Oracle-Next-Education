public class Main {
    public static void main(String[] args) {
        // Imprime en consola
        System.out.println("Tipo Variable");

        // Creando un objeto
        TipoVariable variable = new TipoVariable();

        // Designando variables
        int variableEdad = 14;
        double decimal = 5.5;
        int edad = 18;
        int cantidadPersonas = 2;

        // Llamando objeto
        variable.mostrarEdad(variableEdad);


        // Forzando conversion de variables
        variableEdad = (int) decimal;
        variable.mostrarEdad(variableEdad);

        // Usando condicionales
        if (edad > 17 && cantidadPersonas > 1) {
            System.out.println("Pueden entrar");

        } else {
            System.out.println("no puede entrar");
        }
        // Usanmdo Booleans
        boolean esPareja = cantidadPersonas > 1;
        boolean mayorEdad = edad > 17;

        if (esPareja && mayorEdad) {
            System.out.println("Pueden entrar");
        } else {
            System.out.println("no puede entrar");
        }

        // Ciclos While
        int contador = 0;
        int numeroTabla = 3;
        System.out.println("Tabla de multiplicar del " + numeroTabla);
        while (contador < 10) {
            contador++;
            System.out.println(numeroTabla + " x " + contador + " = " + numeroTabla * contador);
        }
        int numeroSuma = 100;
        int sumador = 1;
        int suma = 0;
        System.out.print("Factorial de " + numeroSuma);
        while (sumador <= numeroSuma) {
            suma = suma + sumador;
            sumador++;
        }
        System.out.println(" es " + suma);

        //Ciclos FOR
        for (int contadora = 1; contadora <= 10; contadora++) {
            int numero = 5;
            System.out.println(numero + " x " + contadora + " = " + numero * contadora);


        }

        // matriz
        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= 5; columna++) {
                /*if (columna>fila){
                    break;
                }*/
                System.out.print("* ");
            }
            System.out.println("");
        }


        // Ejercicio de hallar el nuemero factorial
        int resultado = 1;
        int numeroFactorial = 6;
        for (int i = 1;i <= numeroFactorial;i++) {
            resultado *= i;
        }
        System.out.println("el factorial de " + numeroFactorial + " es " + resultado);
    }
}
