package ByteBank.src;

public class Cuenta {

    public Cuenta() {
        agencia = 1;
        numero = 1;
        contadorCuentas++;
    }

    private double saldo;
    private int agencia;
    private int numero;
    private static int contadorCuentas = 0;
    Cliente titular = new Cliente();

    public void Depositar(double valor) {
        this.saldo += valor;
    }

    public boolean Retirar(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean Transferir(double valor, Cuenta cuenta) {
        if (valor < saldo) {
            this.saldo -= valor;
            cuenta.Depositar(valor);
            ;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("No se permiten valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int contadorDeCuentas() {
        return contadorCuentas;
    }

}
