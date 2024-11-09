package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.LibraryTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryTransactionRepository extends JpaRepository<LibraryTransactionEntity,Integer> {
}
