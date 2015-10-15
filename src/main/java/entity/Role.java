package entity;

import javax.persistence.*;

/**
 * Created by kotun on 16.10.2015.
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
