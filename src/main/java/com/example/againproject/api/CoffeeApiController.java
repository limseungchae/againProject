package com.example.againproject.api;

import com.example.againproject.dto.CoffeeDto;
import com.example.againproject.entity.Coffee;
import com.example.againproject.repository.CoffeeRepository;
import com.example.againproject.service.CoffeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CoffeeApiController {

    @Autowired
    private CoffeService coffeService;

    // GET
    @GetMapping("/api/coffees")
    public Iterable<Coffee> index() {
        return coffeService.index();
    }

    @GetMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> show(@PathVariable Long id) {
        Coffee coffee = coffeService.show(id);
        return (coffee != null) ?
                ResponseEntity.status(HttpStatus.OK).body(coffee) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    // POST
    @PostMapping("/api/coffees")
    public ResponseEntity<Coffee> create(@RequestBody CoffeeDto coffeeDto) {
        Coffee coffee = coffeeDto.toEntity();
        if (coffee.getId() != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Coffee created = coffeService.create(coffee);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
    // PACH
    @PatchMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> update(@PathVariable Long id,
                                         @RequestBody CoffeeDto coffeeDto) {
        Coffee updated = coffeService.update(id, coffeeDto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    // DELETE
    @DeleteMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> delete(@PathVariable Long id) {
        Coffee deleted = coffeService.delete(id);
        return (deleted != null) ?
                ResponseEntity.status(HttpStatus.OK).body(null):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
