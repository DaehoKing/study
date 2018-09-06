package pi.demo.springdata;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class JpaRunner implements ApplicationRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PizzaRepository pizzaRepository;

    @Autowired
    private ToppingRepository toppingRepository;

    //    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Account account = new Account("pi", "hibernate");
        Pizza pizza = new Pizza();
        Topping topping = new Topping();
        topping.setName("cheeze");
//        pizza.addToping(topping);
        pizza.setName("cheee pizza");
        topping.setPizza(pizza);
        toppingRepository.save(topping);
//        pizzaRepository.save(pizza);
//        pizzaRepository.save(pizza1);
//        System.out.println("22222222222222222222");
//        entityManager.persist(pizza);
    }
}
