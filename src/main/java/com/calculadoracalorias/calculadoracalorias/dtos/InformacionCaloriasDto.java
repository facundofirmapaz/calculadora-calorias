package com.calculadoracalorias.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class InformacionCaloriasDto
{
    private double caloriasTotales;
    private ArrayList<CaloriaIngredienteDto> caloriasIngredientes;
    private IngredienteDto masCalorico;
}
