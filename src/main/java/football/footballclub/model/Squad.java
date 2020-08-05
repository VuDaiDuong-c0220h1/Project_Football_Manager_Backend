package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
@Data
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Player> players = new ArrayList<>();

    @OneToMany
    private List<Formation> formations = new ArrayList<>();
}
