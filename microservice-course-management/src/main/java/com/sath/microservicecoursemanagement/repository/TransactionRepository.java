package com.sath.microservicecoursemanagement.repository;

import com.sath.microservicecoursemanagement.model.Transaction;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByUserId(Long userId);
    List<Transaction> findAllByCourseId(Long courseId);
}
