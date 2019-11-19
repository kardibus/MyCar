package domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "propcars")
public class PropCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prpt;

    @OneToMany(mappedBy = "prptscar", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Car> carList;

    public PropCar(){}
    public PropCar(String prpt) {
        this.prpt = prpt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrpt() {
        return prpt;
    }

    public void setPrpt(String prpt) {
        this.prpt = prpt;
    }
}
