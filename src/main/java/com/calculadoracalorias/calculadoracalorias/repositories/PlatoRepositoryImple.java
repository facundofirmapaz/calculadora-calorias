package com.calculadoracalorias.calculadoracalorias.repositories;

import com.calculadoracalorias.calculadoracalorias.entities.Caloria;
import com.calculadoracalorias.calculadoracalorias.exceptionsHandlers.IngredientNotFound;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;

@Repository
public class PlatoRepositoryImple implements PlatoRepository
{
    @SneakyThrows
    @Override
    public Caloria getCaloriaByNombreIngrediente(String nombreIngrediente)
    {
        ArrayList<Caloria> calorias = null;

        calorias = loadDataBase();

        Caloria resultado = null;

        if (calorias != null)
        {
            for (Caloria x : calorias)
            {
                if (x.getName().equals(nombreIngrediente))
                {
                    resultado = x;
                    break;
                }
            }
        }

        if(resultado == null)
            throw new IngredientNotFound("Ingrediente no encontrado: " + nombreIngrediente);

        return resultado;
    }

    private ArrayList<Caloria> loadDataBase()
    {
        File file;
        ArrayList<Caloria> calorias = null;

        try
        {
            file = ResourceUtils.getFile("classpath:food.json");
            ObjectMapper objectMapper = new ObjectMapper();
            com.fasterxml.jackson.core.type.TypeReference<ArrayList<Caloria>> typeReference = new com.fasterxml.jackson.core.type.TypeReference<>() {};

            calorias = objectMapper.readValue(file, typeReference);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return calorias;
    }
}