package dio.desafioprojeto.emanuel.dio.controller;

import dio.desafioprojeto.emanuel.dio.DTO.CarDTO;
import dio.desafioprojeto.emanuel.dio.service.CarServiceImpl;
import dio.desafioprojeto.emanuel.dio.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private ICarService carService;
    @PostMapping("/create")
    public ResponseEntity<?> addCar(@RequestBody CarDTO form) {
        if (form.license() == null || form.model() == null) {
            throw new NullPointerException("Revise o formulario");
        }

        return ResponseEntity.ok(carService.create(form));
    }
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(carService.findAll());
    }
}
