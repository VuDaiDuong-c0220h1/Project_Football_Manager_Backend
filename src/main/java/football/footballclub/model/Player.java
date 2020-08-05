package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private int height;
    private int shirtNumber;

    @OneToOne
    private Country country;

    @OneToOne
    private Images images;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Position> position = new ArrayList<>();

    @OneToMany
    private List<PlayerIndex> playerIndex = new ArrayList<>();

    @OneToOne
    private Foot foot;

    @OneToOne
    private Status status;
}
