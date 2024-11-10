package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.LibraryBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookRepository extends JpaRepository<LibraryBookEntity, Integer> {
}
