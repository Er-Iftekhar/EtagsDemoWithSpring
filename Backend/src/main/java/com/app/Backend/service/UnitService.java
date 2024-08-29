package com.app.Backend.service;

import com.app.Backend.entity.Unit;
import com.app.Backend.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UnitService {
    private final UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public Unit findById(UUID id){
        return unitRepository.findById(id).orElseThrow();
    }

    public void save(Unit unit){
        unitRepository.save(unit);
    }

    public List<Unit> findAll(){
        return unitRepository.findAll();
    }
}
