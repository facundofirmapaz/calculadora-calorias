package com.calculadoracalorias.calculadoracalorias.repositories;

import com.calculadoracalorias.calculadoracalorias.entities.Caloria;

public interface PlatoRepository
{
    Caloria getCaloriaByNombreIngrediente(String nombreIngrediente);
}
