package com.calculadoracalorias.calculadoracalorias.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Plato
{
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
}
