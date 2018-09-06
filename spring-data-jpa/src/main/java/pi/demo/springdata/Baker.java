package pi.demo.springdata;

import javax.persistence.Embeddable;

@Embeddable
public class Baker {
    private String name;
    private int age;
    private String sex;
}
