package ch.filecloud.samples.sja.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by domi on 10/27/14.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}