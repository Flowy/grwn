package com.flowyk.grwn.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class DataAccess {

    @Autowired
    SessionFactory sessionFactory;

    public void insertProduct(Product product) {


        //Session session = HibernateUtils.getHibernateQuery()
    }

}
