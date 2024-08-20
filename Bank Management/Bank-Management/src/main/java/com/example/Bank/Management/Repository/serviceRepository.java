package com.example.Bank.Management.Repository;

import com.example.Bank.Management.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface serviceRepository extends JpaRepository<Service, Integer> {
}
