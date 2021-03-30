package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.ListadoPlatosDto;
import com.calculadoracalorias.calculadoracalorias.dtos.PlatoDto;
import com.calculadoracalorias.calculadoracalorias.entities.ListadoPlatos;
import com.calculadoracalorias.calculadoracalorias.entities.Plato;

import java.util.ArrayList;

public class ListadoPlatosDtoMapper
{
    public static ListadoPlatos mapToListadoPlatos(ListadoPlatosDto l)
    {
        ArrayList<Plato> platos = new ArrayList<>();

        for (PlatoDto p: l.getPlatos())
            platos.add(PlatoDtoMapper.mapToPlato(p));

        return new ListadoPlatos(platos);
    }

    public static ListadoPlatosDto mapToDto(ListadoPlatos l)
    {
        ArrayList<PlatoDto> platos = new ArrayList<>();

        for (Plato p: l.getPlatos())
            platos.add(PlatoDtoMapper.mapToPlatoDto(p));

        return new ListadoPlatosDto(platos);
    }
}
