package domain;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    public Car(){}
    public Car(Long id,String marka,PropCar prptscar) {
        this.id=id;
        this.marka=marka;
        this.prptscar=prptscar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marka;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prpt")
    private PropCar prptscar;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public PropCar getPrptscar() {
        return prptscar;
    }

    public void setPrptscar(PropCar prptscar) {
        this.prptscar = prptscar;
    }


}
