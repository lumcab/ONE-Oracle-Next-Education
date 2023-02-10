
public class Main {

	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 10000;
		primeraCuenta.agencia = 01;
		primeraCuenta.numero = 783674564;
		primeraCuenta.Titular = "Andres";

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 95000;
		segundaCuenta.agencia = 02;
		segundaCuenta.numero = 123474564;
		segundaCuenta.Titular = "Lucia";

		System.out.println(primeraCuenta.agencia);
	}

}
