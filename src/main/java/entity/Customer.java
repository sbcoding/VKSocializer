package entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kotun on 18.10.2015.
 */
@Entity
public class Customer extends User {
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Account> accounts;

}
