package com.calculadoracalorias.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaloriaIngredienteDto
{
    private IngredienteDto ingrediente;
    private double caloria;
}
