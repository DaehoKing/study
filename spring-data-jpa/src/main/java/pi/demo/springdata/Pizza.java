package pi.demo.springdata;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Pizza {

    @Id @GeneratedValue
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "pizza")
//    private Set<Topping> toppings = new HashSet<>();

//    public void addToping(Topping topping) {
//        toppings.add(topping);
//        topping.setPizza(this);
//    }

    public void setName(String name) {
        this.name = name;
    }

    //
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
