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
    }
}
