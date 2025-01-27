package org.duolingo.entidades;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

import org.duolingo.utilidades.Validador;

public class Diccionario {
    private Map<String, Set<String>> diccionario = new HashMap<>();

    public void añadirPalabra() {
        String nuevaPalabra = JOptionPane.showInputDialog(null, "Introduce una nueva palabra", "Nueva Palabra", 0);
        if (Validador.sanitanizacion(nuevaPalabra)) {
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

    public void existePalabra() {
        String palabraExiste = "";

        String inicialExiste = palabraExiste.substring(0, 1);
        if (this.diccionario.containsKey(inicialExiste)) {
            Set<String> setPalabras = this.diccionario.get(inicialExiste);
            if (setPalabras.contains(palabraExiste)) {
                JOptionPane.showMessageDialog(null, "La palabra existe");
            } else {
                JOptionPane.showMessageDialog(null, "No existe esta palabra");
            }
        }
    }

    public void mostrarIniciales() {
        for (String letra : diccionario.keySet()) {
            JOptionPane.showMessageDialog(null, letra);
        }

    }

    public void verPalabras() {
        String letraInicial = JOptionPane.showInputDialog(null, "Dime una inicial");

        if (this.diccionario.containsKey(letraInicial)) {
            Set<String> setPalabras = this.diccionario.get(letraInicial);

            for (String palabra : setPalabras) {
                JOptionPane.showMessageDialog(null, palabra);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay palabras almacenadas en esa inicial");
        }
    }
}


