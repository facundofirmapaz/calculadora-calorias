package com.calculadoracalorias.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredienteDto
{
    private String nombre;
    private double peso;
}
