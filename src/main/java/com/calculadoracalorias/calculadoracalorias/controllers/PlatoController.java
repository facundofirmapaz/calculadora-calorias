package com.calculadoracalorias.calculadoracalorias.controllers;

import com.calculadoracalorias.calculadoracalorias.dtos.*;
import com.calculadoracalorias.calculadoracalorias.dtos.mappers.InformacionCaloriasDtoMapper;
import com.calculadoracalorias.calculadoracalorias.dtos.mappers.ListadoInformacionDtoMapper;
import com.calculadoracalorias.calculadoracalorias.dtos.mappers.ListadoPlatosDtoMapper;
import com.calculadoracalorias.calculadoracalorias.dtos.mappers.PlatoDtoMapper;
import com.calculadoracalorias.calculadoracalorias.entities.InformacionCalorias;
import com.calculadoracalorias.calculadoracalorias.exceptionsHandlers.IngredientNotFound;
import com.calculadoracalorias.calculadoracalorias.services.PlatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/plato")
public class PlatoController
{
    private final PlatoService platoService;

    public PlatoController(PlatoService platoService)
    {
        this.platoService = platoService;
    }

    @PostMapping("/informacion-calorias")
    public ResponseEntity<?> calcularCalorias(@RequestBody PlatoDto plato)
    {
        InformacionCalorias info = platoService.getOInformacionCalorias(PlatoDtoMapper.mapToPlato(plato));

        InformacionCaloriasDto resp = InformacionCaloriasDtoMapper.mapToDto(info);

        return ResponseEntity.ok(resp);
    }

    @PostMapping("/informacion-calorias-listado")
    public ResponseEntity<?> calcularCalorias(@RequestBody ListadoPlatosDto plato)
    {
        ArrayList<InformacionCalorias> info = platoService.getOInformacionCaloriasListado(ListadoPlatosDtoMapper.mapToListadoPlatos(plato));

        ListadoInformacionDto resp = ListadoInformacionDtoMapper.mapToDto(info);

        return ResponseEntity.ok(resp);
    }

    @ExceptionHandler(IngredientNotFound.class)
    public ResponseEntity<?> handleException(IngredientNotFound e)
    {
        ErrorDto errorDto = new ErrorDto("Ingrediente error", e.getMessage());

        return ResponseEntity.badRequest().body(errorDto);
    }
}
