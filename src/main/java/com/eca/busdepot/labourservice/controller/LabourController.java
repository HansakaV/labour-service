package com.eca.busdepot.labourservice.controller;

import com.eca.busdepot.labourservice.model.Labour;
import com.eca.busdepot.labourservice.repository.LabourRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labours")
public class LabourController {

    private final LabourRepository labourRepository;

    // ✅ Constructor injection for Java 21 compliance
    public LabourController(LabourRepository labourRepository) {
        this.labourRepository = labourRepository;
    }

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