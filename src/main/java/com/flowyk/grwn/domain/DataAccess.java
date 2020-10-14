package com.flowyk.grwn.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.RequestScope;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.Connection;
import java.util.Collection;

@Repository
@Transactional
@RequestScope
public class DataAccess {

    @Autowired
    EntityManager entityManager;

    public void insertProduct(Product product) {
        entityManager.persist(product);
    }

    public Collection<Product> loadProducts() {
        TypedQuery<Product> q = entityManager.createQuery("SELECT product FROM Product product", Product.class);
        return q.getResultList();
    }

}
