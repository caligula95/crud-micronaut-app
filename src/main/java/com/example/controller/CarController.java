package com.example.controller;

import com.example.dto.CarDTO;
import com.example.service.CarService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/car")
@Validated
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @Get("/{id}")
    public CarDTO findById(@PathVariable Long id) {
        return carService.findById(id);
    }

    @Get
    public List<CarDTO> findAll() {
        return carService.findAll();
    }

    @Post
    @Status(HttpStatus.CREATED)
    public void save(@Body @Valid CarDTO carDTO) {
        carService.save(carDTO);
    }

    @Delete("/{id}")
    @Status(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        carService.delete(id);
    }
}
