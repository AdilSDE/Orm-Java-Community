package com.sourcefuse.userintentservicess.repository;

import com.sourcefuse.userintentservicess.DTO.Books;
import com.sourcefuse.userintentservicess.DTO.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Laptop, Integer>,StudentRepositoryCustom
{
    long countByAuthorAndPriceIn(String Author, Collection<String> price);


}