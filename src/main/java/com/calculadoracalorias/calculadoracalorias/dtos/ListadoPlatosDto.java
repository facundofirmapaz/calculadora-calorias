package com.calculadoracalorias.calculadoracalorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ListadoPlatosDto
{
    private ArrayList<PlatoDto> platos;
}
