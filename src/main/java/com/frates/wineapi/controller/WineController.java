package com.frates.wineapi.controller;

import com.frates.wineapi.domain.model.Wine;
import com.frates.wineapi.domain.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wines")
public class WineController {

    @Autowired
    private WineRepository wineRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Wine> getWines() {
        return wineRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Wine postWine(@RequestBody Wine wine) {
        return wineRepository.save(wine);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Wine> deleteWine(@PathVariable Long id) {
        try {
            if (!wineRepository.existsById(id)) {
                return ResponseEntity.notFound().build();
            }

            wineRepository.deleteById(id);

            return ResponseEntity.noContent().build();
        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Wine> putWine(@PathVariable Long id,
                                        @RequestBody Wine wine) {
        try {
            if (!wineRepository.existsById(id)) {
                return ResponseEntity.notFound().build();
            }

            wine.setId(id);
            wine = wineRepository.save(wine);

            return ResponseEntity.ok(wine);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
