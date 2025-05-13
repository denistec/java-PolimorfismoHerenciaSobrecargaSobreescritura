package TallerPolimorfismoHerenciaSobreescritura;

public abstract class Empleado {
    protected String nombre;
    protected int codigo;
    protected String tipo;

   //constructor
    public Empleado(String nombre, int codigo, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //este método se va a sobreescribir en las clases Empleado por fijo y Empleado por horas
    public double calcularSalario() {
        return 0;
    }
}


