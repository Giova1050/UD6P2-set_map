package org.duolingo.utilidades;

import java.util.regex.Pattern;

public class Validador {
    public static boolean sanitanizacion(String palabraValidada) {
        Pattern pattern = Pattern.compile("^[a-zA-Z&&[^ñÑ]]+$");

        pattern.matcher(palabraValidada);

        return true;

    }
}
