package ch.filecloud.samples.sja.jpa;

import ch.filecloud.samples.sja.aop.ReFormat;

import javax.persistence.*;

/**
 * Created by domi on 10/27/14.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    @ReFormat
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
