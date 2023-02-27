package ByteBank.src;

public class Empleado {

    private String nombre;
    private String documento;
    private double salario;
    private double suma;
    private int tipo = 0;

    public double getSuma() {
        return suma;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario + getBonificacion();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion() {
        double salida = 0;
        switch (tipo) {
            case 0:
                salida = this.salario * 0.1;
            case 1:
                salida = this.salario * 0.2;
            case 2:
                salida = this.salario * 0.05;
        }
        this.suma += salida;
        return salida;
    }

}
