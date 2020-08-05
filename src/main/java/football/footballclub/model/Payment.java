package football.footballclub.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float moneyIn;

    private float moneyOut;

    private float totalMoney;

    private Date date;
}
