package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.LibraryBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryBookRepository extends JpaRepository<LibraryBookEntity, Integer> {
}
