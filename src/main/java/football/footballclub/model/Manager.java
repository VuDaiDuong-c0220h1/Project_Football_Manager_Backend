package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String email;

    private String password;

    private String username;

    @OneToOne
    private Club club;
}
