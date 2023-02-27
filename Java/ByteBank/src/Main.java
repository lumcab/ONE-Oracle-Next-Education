package ByteBank.src;

public class Main {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.Depositar(100000);
		cuenta1.setAgencia(01);
		cuenta1.setNumero(783674564);
		cuenta1.titular.setNombre("Andres");
		cuenta1.titular.setDocumento("8236747478");
		cuenta1.titular.setTelefono("3124324534");
		cuenta1.titular.setDireccion("cra.32 #45-65");
		
		Cuenta cuenta2 = new Cuenta();
		cuenta2.Depositar(100000);
		cuenta2.setAgencia(2);
		cuenta2.setNumero(783674564);
		cuenta2.titular.setNombre("Lucia");
		cuenta2.titular.setDocumento("12345234");
		cuenta2.titular.setTelefono("312534534");
		cuenta2.titular.setDireccion("cra.54 #23-95");
		
		Empleado funcionario1 = new Empleado();
		funcionario1.setNombre("Diego");
		funcionario1.setDocumento("4523434567");
		funcionario1.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		
		// En este caso ambos hacen referencia al mismo objeto o memoria lo cual
		//primera
		// cuenta se ve afectada
		// cuenta1 = cuenta2;
		
		System.out.println(cuenta1.titular.getNombre() + ". su saldo es: " +
		cuenta1.getSaldo());
		cuenta1.Depositar(5000);
		System.out.println(cuenta2.titular.getNombre() + ". su saldo nuevo es: " +
		cuenta1.getSaldo());
		cuenta1.Retirar(4500);
		
		if (cuenta1.Retirar(50000)) {
		System.out.println(cuenta1.titular.getNombre() +
		". Retiro exitoso, Su nuevo saldo es: "
		+ cuenta1.getSaldo());
		} else {
		System.out.println("Saldo insuficiente");
		}
		System.out.println(
		cuenta2.titular.getNombre() + ".  El saldo de su cuenta es: " +
		cuenta2.getSaldo());
		
		if (cuenta1.Transferir(20000, cuenta2)) {
		System.out.println(cuenta1.titular.getNombre() +
		". Transferencia exitosa, Su nuevo saldo es: "
		+ cuenta1.getSaldo());
		System.out.println(cuenta2.titular.getNombre() +
		". el nuevo saldo de su cuenta es: "
		+ cuenta2.getSaldo());
		} else {
		System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Se tiene " + Cuenta.contadorDeCuentas() +
		" cuentas creadas");
		
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.getBonificacion());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());


		// control bonificaion

		Empleado diego = new Empleado();
		diego.setSalario(2000);

		Gerente jimena = new Gerente();
		jimena.setSalario(10000);

		Contador cesar = new Contador();
		cesar.setSalario(5000);

		System.out.println("salario Diego es: " + diego.getSalario());
		System.out.println("salario Diego es: " + jimena.getSalario());
		System.out.println("salario Diego es: " + cesar.getSalario());

	}

}
