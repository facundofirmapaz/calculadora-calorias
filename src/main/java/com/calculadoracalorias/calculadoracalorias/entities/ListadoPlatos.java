package com.calculadoracalorias.calculadoracalorias.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ListadoPlatos
{
    private ArrayList<Plato> platos;
}
