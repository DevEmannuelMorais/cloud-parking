package dio.desafioprojeto.emanuel.dio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {
     @Id
     private Integer invoice;
     private LocalDateTime entryDate;
     private LocalDateTime exitDate;
     private Double bill;
     @OneToMany
     private List<Car> cars;
}
