package com.sourcefuse.userintentservicess.repository;

import jakarta.persistence.EntityManager;

import java.util.List;

public interface StudentRepositoryCustom<T> {

    void createCriteria(Class entityClass);

    List<T> nameByCourse(String author, String bookname,String lis,Class type);

}