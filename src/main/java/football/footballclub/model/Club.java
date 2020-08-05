package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Data
@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String establishYear;
    private String logo;
    private String awayShirt;
    private String homeShirt;

    @OneToOne
    private Stadium stadium;

    @OneToOne
    private Coach coach;

    @OneToMany
    private List<Player> players = new ArrayList<>();

    @OneToMany
    private List<Squad> squadList = new ArrayList<>();
}
