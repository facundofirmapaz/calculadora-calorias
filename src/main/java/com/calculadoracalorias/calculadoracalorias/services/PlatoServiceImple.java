package com.calculadoracalorias.calculadoracalorias.services;

import com.calculadoracalorias.calculadoracalorias.entities.*;
import com.calculadoracalorias.calculadoracalorias.exceptionsHandlers.IngredientNotFound;
import com.calculadoracalorias.calculadoracalorias.repositories.PlatoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;

@Service
public class PlatoServiceImple implements PlatoService
{

    private final PlatoRepository platoRepository;

    public PlatoServiceImple(PlatoRepository platoRepository)
    {
        this.platoRepository = platoRepository;
    }

    @Override
    public InformacionCalorias getOInformacionCalorias(Plato plato)
    {
        ArrayList<CaloriaIngrediente> caloriaIngredientes = new ArrayList<>();

        double totalCaloria = 0;

        for (Ingrediente i: plato.getIngredientes())
        {
            Caloria c = platoRepository.getCaloriaByNombreIngrediente(i.getNombre());

            double caloria = c.getCalories() * i.getPeso();

            totalCaloria += caloria;

            caloriaIngredientes.add(new CaloriaIngrediente(i, caloria));
        }

        Comparator<CaloriaIngrediente> c = Comparator.comparingDouble(CaloriaIngrediente::getCaloria);

        Ingrediente masCalorico = caloriaIngredientes.stream().max(c).get().getIngrediente();

        return new InformacionCalorias(totalCaloria, caloriaIngredientes, masCalorico);
    }

    @Override
    public ArrayList<InformacionCalorias> getOInformacionCaloriasListado(ListadoPlatos platos)
    {
        ArrayList<InformacionCalorias> infos = new ArrayList<>();

        for (Plato p: platos.getPlatos())
            infos.add(getOInformacionCalorias(p));

        return infos;
    }
}
