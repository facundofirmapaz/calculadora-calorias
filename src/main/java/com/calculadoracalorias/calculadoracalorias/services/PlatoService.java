package com.calculadoracalorias.calculadoracalorias.services;

import com.calculadoracalorias.calculadoracalorias.entities.InformacionCalorias;
import com.calculadoracalorias.calculadoracalorias.entities.ListadoPlatos;
import com.calculadoracalorias.calculadoracalorias.entities.Plato;

import java.util.ArrayList;

public interface PlatoService
{
    InformacionCalorias getOInformacionCalorias(Plato plato);

    ArrayList<InformacionCalorias> getOInformacionCaloriasListado(ListadoPlatos platos);
}
