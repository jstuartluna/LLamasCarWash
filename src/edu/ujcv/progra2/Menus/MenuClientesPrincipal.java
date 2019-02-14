package Menus;

public class MenuClientesPrincipal implements IMenuItem {

    public String getLabel() {
        return "Clientes";
    }

    public void runAction() {
        MenuClientes Consumers = new MenuClientes();
        Consumers.verOpcionesClientes();
        Consumers.verOpcionesClientes1();
    }
}
