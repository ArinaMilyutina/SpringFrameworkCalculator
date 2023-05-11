package by.tms;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String type;
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
