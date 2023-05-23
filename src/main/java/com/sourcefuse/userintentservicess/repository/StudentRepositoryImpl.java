package com.sourcefuse.userintentservicess.repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@RequiredArgsConstructor
class StudentRepositoryImpl<T> implements StudentRepositoryCustom<T> {

    @PersistenceContext
    private   EntityManager em;
    CriteriaBuilder cb;
    CriteriaQuery<T> criteriaQuery;
    Root<T> root;

    @Override
    public void createCriteria(Class entityClass) {

        this.cb = this.em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(entityClass);
        root = criteriaQuery.from(entityClass);
    }

    @Override
    public List<T> nameByCourse(String author, String bookname, String lis,Class type) {
        createCriteria(type);
        Predicate authorNamePredicate = cb.equal(root.get("author"), author);
        Predicate titlePredicate = cb.like(root.get("lName"), "%" + bookname + "%");
        List<String> ls = Arrays.asList(new String[]{lis, "320"});
        Predicate inPredi = root.get("price").in(ls);
        Predicate finalPr = cb.or(inPredi, cb.and(authorNamePredicate, titlePredicate));
        //Using criteria builder you can build your criteria queries.
        criteriaQuery.where(finalPr);

        return em.createQuery(criteriaQuery).getResultList();
    }

}