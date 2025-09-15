package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, este es nuestra primera aplicación usando IntelliJ!!");
        System.out.println("Esta es una actualización del proyecto.");

        Mensaje m1 = new Mensaje(1L, "Titulo","texto del mensaje", LocalDate.now());
        Mensaje m2 = new Mensaje(2L, "Titulo2","texto del mensaje2", LocalDate.now());
        Mensaje m3 = Mensaje.builder()
                .id(3L)
                .titulo("Titulo3")
                .texto("Texto del mensaje 3")
                .fecha(LocalDate.now())
                .build();

        List<Mensaje> mensajes = new ArrayList<>();

        mensajes.add(m1);
        mensajes.add(m2);
        mensajes.add(m3);

        mensajes.forEach(mensaje -> {
            System.out.println(mensaje.getTitulo() + " " + mensaje.getFecha().toString());
        });
    }
}