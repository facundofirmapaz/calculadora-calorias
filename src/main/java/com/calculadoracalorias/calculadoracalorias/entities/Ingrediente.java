package com.calculadoracalorias.calculadoracalorias.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingrediente
{
    private String nombre;
    private double peso;
}
