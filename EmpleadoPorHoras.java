package TallerPolimorfismoHerenciaSobreescritura;

public class EmpleadoPorHoras extends Empleado {
    double horasTrabajadas;
    double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int codigo, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, codigo, "Por horas");
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
