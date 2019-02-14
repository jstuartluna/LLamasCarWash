package Menus;

import Modulos.Clientes;
import util.LectorTeclado;
import util.fileio.EscritorCvsClientes;
import util.fileio.LectorCvsClientes;

import java.util.ArrayList;

public class MenuClientes {

    private ArrayList<Clientes> clientes1 = new ArrayList<>();

    public void verOpcionesClientes(){
        System.out.printf("Escoja una Opcion Valida");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Eliminar Cliente");
        System.out.println("3. Ver Lista de Clientes");
        System.out.println("4. Salir");
    }

    public int verOpcionesClientes1() {
        LectorTeclado lt = new LectorTeclado();
        int opcion = lt.leerEntero("Ingrese una opcion", "Ah ingresado una opcion  no valida");
        switch (opcion) {
            case 1:
                agregarCliente();
                System.out.println("\n");
                break;
            case 2:
                eliminarCliente();
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n La lista de cliente es:");
                System.out.println("Codigo Cliente \t Identidad\t Primer nombre \t Primer Apellido");
                verClientes();
                System.out.println("\n");
                break;

        }
        return opcion;
    }

    public ArrayList<Clientes> agregarCliente() {
        LectorTeclado lt = new LectorTeclado();
        Clientes digitardatos = new Clientes();
        digitardatos.setCodigocliente(lt.leerString("Ingrese un codigo unico para el cliente"));
        digitardatos.setNumeroidentidad(lt.leerString("Ingrese el numero de identidad del cliente"));
        digitardatos.setNombre(lt.leerString("Ingrese el Nombre del Cliente"));
        digitardatos.setApellidos(lt.leerString("Ingrese el Primer apellido del Cliente"));
        clientes1.add(new Clientes(digitardatos.getNumeroidentidad(), digitardatos.getNombre(), digitardatos.getApellidos(), digitardatos.getCodigocliente()));
        EscritorCvsClientes.writeCsvFile("ClientesLista.Csv", clientes1, true);
        return clientes1;
    }


    public void eliminarCliente() {
        clientes1 = LectorCvsClientes.readCsvFile("Clientes.csv");
        int i = 0;
        for (Clientes cliente:clientes1) {
            i++;
            if(clientes1.size()== i){
                clientes1.remove(clientes1.size()-1);
                EscritorCvsClientes.writeCsvFile("Clientes.Csv",clientes1,false);
                clientes1.add(new Clientes("","","",""));
            }
        }
    }

    public void verClientes() {
        clientes1 = LectorCvsClientes.readCsvFile("ClientesLista.Csv");
        for (Clientes cliente : clientes1) {
            System.out.println(cliente.getCodigocliente() + "\t" + cliente.getNumeroidentidad() + "\t" + cliente.getNombre() + "\t"
                    + cliente.getApellidos() + "\t");
        }
    }

}
