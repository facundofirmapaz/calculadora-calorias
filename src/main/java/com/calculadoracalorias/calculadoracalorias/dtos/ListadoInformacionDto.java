package com.calculadoracalorias.calculadoracalorias.dtos;

import com.calculadoracalorias.calculadoracalorias.dtos.mappers.InformacionCaloriasDtoMapper;
import com.calculadoracalorias.calculadoracalorias.entities.InformacionCalorias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

public class ListadoInformacionDto
{
    private ArrayList<InformacionCaloriasDto> informacionCaloriasDtos;

    public ListadoInformacionDto(ArrayList<InformacionCalorias> infos)
    {
        informacionCaloriasDtos = new ArrayList<>();
        for (InformacionCalorias i: infos)
            informacionCaloriasDtos.add(InformacionCaloriasDtoMapper.mapToDto(i));
    }
}
