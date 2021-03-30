package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.CaloriaIngredienteDto;
import com.calculadoracalorias.calculadoracalorias.entities.CaloriaIngrediente;

public class CaloriaIngredienteDtoMapper
{
    public static CaloriaIngrediente mapToCaloriaIngrediente(CaloriaIngredienteDto c)
    {
        return new CaloriaIngrediente(IngredienteDtoMapper.mapToIngrediente(c.getIngrediente()), c.getCaloria());
    }

    public static CaloriaIngredienteDto mapToDto(CaloriaIngrediente c)
    {
        return new CaloriaIngredienteDto(IngredienteDtoMapper.mapToDto(c.getIngrediente()), c.getCaloria());
    }
}
