package dio.desafioprojeto.emanuel.dio.DTO;

import org.springframework.stereotype.Component;


public record CarDTO(String license, String state, String model, String color) {
    public CarDTO {
    }

}
