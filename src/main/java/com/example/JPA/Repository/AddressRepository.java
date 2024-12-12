package com.example.JPA.Repository;

import com.example.JPA.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
