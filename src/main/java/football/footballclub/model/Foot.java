package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Foot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
