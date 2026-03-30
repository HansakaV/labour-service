package com.eca.busdepot.labourservice.controller;

import com.eca.busdepot.labourservice.model.Labour;
import com.eca.busdepot.labourservice.repository.LabourRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labours")
@RequiredArgsConstructor
public class LabourController {
    
    private final LabourRepository labourRepository;
    
    @GetMapping
    public List<Labour> getAllLabours() {
        return labourRepository.findAll();
    }
    
    @PostMapping
    public Labour addLabour(@RequestBody Labour labour) {
        return labourRepository.save(labour);
    }
    
    @DeleteMapping("/{id}")
    public void deleteLabour(@PathVariable Long id) {
        labourRepository.deleteById(id);
    }
}
