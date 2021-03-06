package com.lnu.RESTfulCafe.model.user;

import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
@SequenceGenerator(name = "roleseq", initialValue = 1, allocationSize=1)
public class Role {
    private @Id @GeneratedValue(generator = "roleseq") Long id;
    private @Column(unique=true) String name;

    public Role () {}

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id.equals(role.id) && name.equals(role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
