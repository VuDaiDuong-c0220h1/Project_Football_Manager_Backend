package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String image;

    @OneToOne
    private Country country;
}
