package Modulos;

public class Facturas {
    private String numeroFactura;
    private String totalfacturado;
    private String descripcionServicio;
    private String rtn;
    private String clientes;

    public Facturas (String numeroFactura, String totalfacturado, String descripcionServicio, String rtn, String clientes){
        this.numeroFactura = numeroFactura;
        this.totalfacturado = totalfacturado;
        this.descripcionServicio = descripcionServicio;
        this.rtn = rtn;
        this.clientes = clientes;
    }

    public String getNumeroFactura(){
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura){
        this.numeroFactura = numeroFactura;
    }

    public String getTotalfacturado() {
        return totalfacturado;
    }

    public void setTotalfacturado(String totalfacturado) {
        this.totalfacturado = totalfacturado;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }
}
