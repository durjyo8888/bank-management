package com.example.Bank.Management.Repository;

import com.example.Bank.Management.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface branchRepository extends JpaRepository<Branch, Integer> {

}
