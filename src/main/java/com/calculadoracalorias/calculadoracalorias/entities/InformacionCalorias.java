package com.calculadoracalorias.calculadoracalorias.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class InformacionCalorias
{
    private double caloriasTotales;
    private ArrayList<CaloriaIngrediente> caloriasIngredientes;
    private Ingrediente masCalorico;
}