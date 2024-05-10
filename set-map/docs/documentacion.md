# Documentacion Programa Set y Map

Consta de 3 clases con distintos metodos como son la clase "Diccionario, Menu y Validador".

![Alt text](<Captura de pantalla 2024-05-10 204625.png>)

## Clase Diccionario

Contiene 5 metodos de los cuales son: 

### añadirPalabra: 

Este metodo consiste en añadir palabras dentro de nuestro map creado, primero preguntamos por una nueva palabra y haremos el metodo se subString para recoger la primera letra de la palabra, convirtiendose en su clave y añadiendose al map con un set. 

(![Alt text](<Captura de pantalla 2024-05-10 211631.png>))

Asi se puede ver el metodo ejecutado. 

(![Alt text](<Captura de pantalla 2024-05-10 211835.png>))

### eliminarPalabra:

Este metodo trata de hacer lo contrario, siendo que primero preguntara por una palabra ya registrada si existe y si lo es, sera eliminada.

(![Alt text](<Captura de pantalla 2024-05-10 212257.png>))

Asi ejecutado.

(![Alt text](<Captura de pantalla 2024-05-10 212403.png>))

### existePalabra: 

El siguiente metodo lo que hara es preguntar por una palabra para revisar si existe dentro del map primero recogiendo su clave con el metodo anterior de subString para despues ya revisar si se encuentra en la clave la palabra requerida

(![Alt text](<Captura de pantalla 2024-05-10 212554.png>))

### mostrarIniciales: 

El metodo lo que hara es recorrer con un forEach todo el map e ir mostrando cada una de las claves existentes.

(![Alt text](<Captura de pantalla 2024-05-10 212851.png>))

### verPalabras:

El metodo preguntara al usuario una letra para identificar que clave quiere para hacer un forEach recorriendo todo el map de la clave correspondiente.

(![Alt text](<Captura de pantalla 2024-05-10 213046.png>))

## Clase Menu 

En esta clase lo que tendremos sera un menu utilizando un while con switch-case junto con el JOptionpane, juntandolos en todas las clases mencionadas anteriormente y un sexto caso para cerrar el programa.

(![Alt text](<Captura de pantalla 2024-05-10 213314.png>))

## Clase Validador

Dentro de esta clase tendremos un metodo que lo que hara sera es sanitanizar las palabras introducidas dentro del programa como son caracteres especiales o letras mayusculas y numeros, utilizando Pattern.

(![Alt text](<Captura de pantalla 2024-05-10 213812.png>))

Con esto acabaria la documentacion.

PD: Hice la parte de github despues de haber hecho el programa para evitar muchos problemas que tuve en mi ultima practica, espero que se pueda realizar las practicas de esta forma porque me resulta mucho mas facil el hacerlas.



