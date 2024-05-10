package org.duolingo.utilidades;

import javax.swing.JOptionPane;

import org.duolingo.entidades.Diccionario;

public class Menu {
    public static void mostrarMenu() {
        Diccionario diccionario = new Diccionario();
        String menu;
        Boolean bucle = true;
        while (bucle) {
            menu = JOptionPane.showInputDialog(null, """
                    SELECCIONA UNA OPCION
                    1. Añadir palabra 
                    2. Eliminar palabra
                    3. Existe palabra
                    4. Mostrar inicial disponible
                    5. Ver palabra por inicial
                    Q. Cerrar programa
                """, "Duolingo", JOptionPane.INFORMATION_MESSAGE);
            switch (menu) {
                case "1":
                diccionario.añadirPalabra();
                    break;
                case "2":
                diccionario.eliminarPalabra();
                    break;
                case "3":
                diccionario.existePalabra();
                    break;
                case "4":
                diccionario.mostrarIniciales();
                    break;
                case "5":
                diccionario.verPalabras();
                    break;
                case "Q":
                    bucle = false;
                    break;
                default:
                    break;
            }
        }
    }
}
