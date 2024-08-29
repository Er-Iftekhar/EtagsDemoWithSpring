package com.app.Backend.controller;

import com.app.Backend.entity.Unit;
import com.app.Backend.service.UnitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/unit")
public class UnitController {
    private final UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @GetMapping("/{id}")
    Unit getById(@PathVariable UUID id){
        return unitService.findById(id);
    }

    @GetMapping("/all")
    List<Unit> getAllUnits(){
        return unitService.findAll();
    }

    @PostMapping("/save")
    void saveUnit(@RequestBody Unit unit){
        unitService.save(unit);
    }
}
