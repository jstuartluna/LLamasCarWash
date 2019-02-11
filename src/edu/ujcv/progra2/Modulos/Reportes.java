package Modulos;

public class Reportes {
    private String nombre;
    private String RTN;
    private String Servicios;
    private String total;

    public Reportes (String nombre, String RTN, String Servicios, String total){
        this.nombre = nombre;
        this.RTN = RTN;
        this.Servicios = Servicios;
        this.total = total;
    }

    public Reportes(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getServicios() {
        return Servicios;
    }

    public void setServicios(String servicios) {
        Servicios = servicios;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
