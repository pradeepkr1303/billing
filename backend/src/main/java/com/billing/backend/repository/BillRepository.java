package com.billing.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Long> {

}
