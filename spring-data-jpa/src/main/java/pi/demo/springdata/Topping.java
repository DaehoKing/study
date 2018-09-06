package pi.demo.springdata;

import javax.persistence.*;

@Entity
public class Topping {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
