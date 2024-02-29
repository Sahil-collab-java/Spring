package com._09_Spring_TimeStamp_Custom_Generator.Generator;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.EventType;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class CustomIdGenerator implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {

       String prefix ="emp";
       String suffix ="";

//       Connection connection = (Connection) sharedSessionContractImplementor.getJdbcConnectionAccess();
//        Statement statement = connection.createStatement();
//
//        String sql =

        return null;
    }
}
