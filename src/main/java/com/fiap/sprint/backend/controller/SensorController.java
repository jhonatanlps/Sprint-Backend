package com.fiap.sprint.backend.controller;

import com.fiap.sprint.backend.model.Sensor;
import com.fiap.sprint.backend.service.SensorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sensores")
@CrossOrigin
public class SensorController {

    @Autowired
    private SensorService service;

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping
    public List<Sensor> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Sensor atualizar(@PathVariable Long id, @RequestBody Sensor sensor) {
        return service.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}