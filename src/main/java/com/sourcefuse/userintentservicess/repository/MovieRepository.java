package com.sourcefuse.userintentservicess.repository;

import com.sourcefuse.userintentservicess.DTO.Laptop;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Repository
public class MovieRepository {

    @Autowired
    private JdbcTemplate template;
//
//    @PostConstruct
//    public void createTable() {
//        template.execute("CREATE TABLE movies (id bigint auto_increment primary key, name VARCHAR(50), year int, rating int)");
//    }

//    public void createMovie(String name, int year, int rating) {
//        template.update("INSERT INTO movies (id, name, year, rating) VALUES (?,?,?,?)",
//                null, name, year,s rating);
//    }

    public List<Laptop> findMoviesByName(String nameStartsWith) {
        // Write your code here
        String par="%"+nameStartsWith+"%";
        return template.query("SELECT lid, l_name, author, price FROM laptop WHERE l_name LIKE ?",new BeanPropertyRowMapper<>(Laptop.class),par);

    }
}