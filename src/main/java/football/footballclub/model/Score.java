package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int minutes;

    @OneToOne
    private Player scoredPlayer;

    @OneToOne
    private Player assistedPlayer;
}
