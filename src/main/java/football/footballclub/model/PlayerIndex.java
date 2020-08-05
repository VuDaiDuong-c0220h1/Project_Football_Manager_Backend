package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class PlayerIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
