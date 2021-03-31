package com.calculadoracalorias.calculadoracalorias.dtos.mappers;

import com.calculadoracalorias.calculadoracalorias.dtos.InformacionCaloriasDto;
import com.calculadoracalorias.calculadoracalorias.dtos.ListadoInformacionDto;
import com.calculadoracalorias.calculadoracalorias.entities.InformacionCalorias;

import java.util.ArrayList;

public class ListadoInformacionDtoMapper
{
    public static ListadoInformacionDto mapToDto(ArrayList<InformacionCalorias> infos)
    {
        ArrayList<InformacionCaloriasDto> informacionCaloriasDtos = new ArrayList<>();
        for (InformacionCalorias i: infos)
            informacionCaloriasDtos.add(InformacionCaloriasDtoMapper.mapToDto(i));

        return new ListadoInformacionDto(informacionCaloriasDtos);
    }
}
