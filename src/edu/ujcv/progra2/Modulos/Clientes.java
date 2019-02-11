package Modulos;

public class Clientes {

    private String nombre;
    private String apellidos;
    private String codigocliente;
    private String numeroidentidad;

    public Clientes (String codigocliente, String nombre, String apellidos, String numeroidentidad){
        this.codigocliente = codigocliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroidentidad = numeroidentidad;
    }

    public Clientes(){
    }

    public String getCodigocliente(){
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroidentidad() {
        return numeroidentidad;
    }

    public void setNumeroidentidad(String numeroidentidad) {
        this.numeroidentidad = numeroidentidad;
    }
}
