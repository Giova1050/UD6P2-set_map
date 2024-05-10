package org.duolingo.entidades;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class Diccionario {
    private Map<String, Set<String>> diccionario = new HashMap<>();

    public void añadirPalabra() {
        String nuevaPalabra = JOptionPane.showInputDialog(null, "Introduce una nueva palabra", "Nueva Palabra", 0);
        if (!Validador.sanitanizacion(nuevaPalabra)) {
            JOptionPane.showMessageDialog(null, "Esta palabra es valida");
        } else {
            JOptionPane.showMessageDialog(null, "Esta palabra no es valida");
            return;
        }

        String inicial = nuevaPalabra.substring(0, 1);
        JOptionPane.showMessageDialog(null, inicial);

        if (this.diccionario.containsKey(inicial)) {
            Set<String> setPalabras = this.diccionario.get(inicial);
            setPalabras.add(nuevaPalabra);
            this.diccionario.put(inicial, setPalabras);
        } else {
            Set<String> nuevoSet = new HashSet<>();
            nuevoSet.add(nuevaPalabra);
            this.diccionario.put(inicial, nuevoSet);
        }
    }

    public void eliminarPalabra() {

        String palabraEliminar = JOptionPane.showInputDialog(null, "Introduce la palabra que quieras eliminar",
                "Nueva Palabra", 0);

        String inicialEliminar = palabraEliminar.substring(0, 1);
        if (this.diccionario.containsKey(inicialEliminar)) {
            Set<String> setPalabras = this.diccionario.get(inicialEliminar);
            if (setPalabras.remove(palabraEliminar)) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado la palabra");
            } else {
                JOptionPane.showMessageDialog(null, "No existe esta palabra");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta inicial no contiene palabras almacenadas");
        }
    }
}
