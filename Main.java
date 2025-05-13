package TallerPolimorfismoHerenciaSobreescritura;

public class Main {
    public static void main(String[] args) {
        Empleado fijo = new EmpleadoSueldoFijo("Ana", 101, 1500.0);
        Empleado porHoras = new EmpleadoPorHoras("Luis", 102, 120, 12.5);

        System.out.println(fijo.getNombre() + " gana: $" + fijo.calcularSalario());
        System.out.println(porHoras.getNombre() + " gana: $" + porHoras.calcularSalario());
    }
}
