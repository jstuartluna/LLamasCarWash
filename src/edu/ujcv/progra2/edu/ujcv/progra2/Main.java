package edu.ujcv.progra2;


import Menus.IMenuItem;
import Menus.MenuClientesPrincipal;
import Menus.MenuPrincipal;

import java.util.ArrayList;

public class Main {

    public static int valorSalida = 0;

        public static void main(String[] args) {

            ArrayList<IMenuItem> itemsMenuPrincipal = new ArrayList<>();
            itemsMenuPrincipal.add(new MenuClientesPrincipal());
            //itemsMenuPrincipal.add(new MenuProductos2());
            //itemsMenuPrincipal.add(new MenuFacturas2());
            //itemsMenuPrincipal.add(new MenuReportes2());
            //itemsMenuPrincipal.add(new Salir());
            MenuPrincipal menuPrincipal = new MenuPrincipal(itemsMenuPrincipal);
            while (valorSalida == 0) {
                menuPrincipal.mostrarMenu();
                menuPrincipal.leerOpcionLuegoProcessar();
            }
    }

}
