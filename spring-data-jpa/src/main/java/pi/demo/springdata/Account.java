package pi.demo.springdata;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Account {
    @Id @GeneratedValue
    private Long id;

    @Column
    private String username;

    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Transient
    private String yes;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "address", column = @Column(name = "home_address"))
//    })

    public Account() {}

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
