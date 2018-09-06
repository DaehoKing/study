package pi.demo.springdata;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String address;
    private String zipCode;
    private String city;
}
