package org.example;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class Mensaje {
    private Long id;
    private String titulo;
    private String texto;
    private LocalDate fecha;
}
