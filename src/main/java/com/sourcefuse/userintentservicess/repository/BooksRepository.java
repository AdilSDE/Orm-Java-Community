package com.sourcefuse.userintentservicess.repository;

import com.sourcefuse.userintentservicess.DTO.Books;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
