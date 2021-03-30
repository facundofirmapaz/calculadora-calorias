package com.calculadoracalorias.calculadoracalorias.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaloriaIngrediente
{
    private Ingrediente ingrediente;
    private double caloria;
}
