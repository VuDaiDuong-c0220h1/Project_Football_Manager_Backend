package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Player player;
}
