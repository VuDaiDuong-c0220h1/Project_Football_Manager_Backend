package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
@Data
public class MatchResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String result;

    @OneToOne
    private Stadium stadium;

    private String opponent;

    private float matchPayment;

    @OneToMany
    private List<Score> scoreList = new ArrayList<>();
}
