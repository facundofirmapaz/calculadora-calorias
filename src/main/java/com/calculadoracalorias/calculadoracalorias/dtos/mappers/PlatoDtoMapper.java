package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.IngredienteDto;
import com.calculadoracalorias.calculadoracalorias.dtos.PlatoDto;
import com.calculadoracalorias.calculadoracalorias.entities.Ingrediente;
import com.calculadoracalorias.calculadoracalorias.entities.Plato;

import java.util.ArrayList;

public class PlatoDtoMapper
{
    public static Plato mapToPlato(PlatoDto p)
    {
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();

        for (IngredienteDto i: p.getIngredientes())
            ingredientes.add(IngredienteDtoMapper.mapToIngrediente(i));

        return new Plato(p.getNombre(), ingredientes);
    }

    public static PlatoDto mapToPlatoDto(Plato p)
    {
        ArrayList<IngredienteDto> ingredientes = new ArrayList<>();

        for (Ingrediente i: p.getIngredientes())
            ingredientes.add(IngredienteDtoMapper.mapToDto(i));

        return new PlatoDto(p.getNombre(), ingredientes);
    }

}
