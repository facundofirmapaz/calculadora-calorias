package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.IngredienteDto;
import com.calculadoracalorias.calculadoracalorias.entities.Ingrediente;

public class IngredienteDtoMapper
{
    public static Ingrediente mapToIngrediente(IngredienteDto i)
    {
        return new Ingrediente(i.getNombre(), i.getPeso());
    }

    public static IngredienteDto mapToDto(Ingrediente i)
    {
        return new IngredienteDto(i.getNombre(), i.getPeso());
    }
}
