package com.geo.geocoding.repository;

import com.geo.geocoding.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findByAddress(String address);
}
