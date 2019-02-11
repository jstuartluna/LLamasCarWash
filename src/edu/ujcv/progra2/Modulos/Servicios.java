package Modulos;

public class Servicios {
    private String descripcionservicio;
    private String codigoservicio;
    private String precioservicio;

    public Servicios(String descripcionservicio, String codigoservicio, String precioservicio){
        this.codigoservicio = codigoservicio;
        this.descripcionservicio = descripcionservicio;
        this.precioservicio = precioservicio;
    }

    public Servicios(){}

    public String getDescripcionservicio(){
        return descripcionservicio;
    }

    public void setDescripcionservicio(String descripcionservicio) {
        this.descripcionservicio = descripcionservicio;
    }

    public String getCodigoservicio() {
        return codigoservicio;
    }

    public void setCodigoservicio(String codigoservicio) {
        this.codigoservicio = codigoservicio;
    }

    public String getPrecioservicio() {
        return precioservicio;
    }

    public void setPrecioservicio(String precioservicio) {
        this.precioservicio = precioservicio;
    }
}
