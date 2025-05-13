package TallerPolimorfismoHerenciaSobreescritura;

public class EmpleadoSueldoFijo extends Empleado {
    double sueldoMensual;

    public EmpleadoSueldoFijo(String nombre, int codigo, double sueldoMensual) {
        super(nombre, codigo, "A sueldo fijo");
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}