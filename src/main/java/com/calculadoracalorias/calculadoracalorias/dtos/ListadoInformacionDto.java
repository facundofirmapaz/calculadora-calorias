package com.calculadoracalorias.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ListadoInformacionDto
{
    private ArrayList<InformacionCaloriasDto> informacionCaloriasDtos;
}
