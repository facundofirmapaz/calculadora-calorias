package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.CaloriaIngredienteDto;
import com.calculadoracalorias.calculadoracalorias.dtos.InformacionCaloriasDto;
import com.calculadoracalorias.calculadoracalorias.dtos.IngredienteDto;
import com.calculadoracalorias.calculadoracalorias.entities.CaloriaIngrediente;
import com.calculadoracalorias.calculadoracalorias.entities.InformacionCalorias;
import com.calculadoracalorias.calculadoracalorias.entities.Ingrediente;

import java.util.ArrayList;

public class InformacionCaloriasDtoMapper
{
    public static InformacionCalorias mapToInformacionCalorias(InformacionCaloriasDto i)
    {
        ArrayList<CaloriaIngrediente> calorias = new ArrayList<>();

        for (CaloriaIngredienteDto c: i.getCaloriasIngredientes())
            calorias.add(CaloriaIngredienteDtoMapper.mapToCaloriaIngrediente(c));

        Ingrediente ingrediente = IngredienteDtoMapper.mapToIngrediente(i.getMasCalorico());

        return new InformacionCalorias(i.getCaloriasTotales(), calorias, ingrediente);
    }

    public static InformacionCaloriasDto mapToDto(InformacionCalorias i)
    {
        ArrayList<CaloriaIngredienteDto> calorias = new ArrayList<>();

        for (CaloriaIngrediente c: i.getCaloriasIngredientes())
            calorias.add(CaloriaIngredienteDtoMapper.mapToDto(c));

        IngredienteDto ingrediente = IngredienteDtoMapper.mapToDto(i.getMasCalorico());

        return new InformacionCaloriasDto(i.getCaloriasTotales(), calorias, ingrediente);
    }
}
