package com.sourcefuse.userintentservicess.DTO;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

//mark class as an Entity
@Entity
//defining class name as Table name
@NoArgsConstructor
@Data
@Table(name = "laptop")
@Slf4j
 public class Laptop {
    //Defining book id as primary key
    @Id
    @Column
    private int lid;
    @Column(name = "l_name")
    private String lName;
    @Column
    private String author;
    @Column
    private String price;

    private LocalDateTime date=LocalDateTime.now();


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "books_id",
             referencedColumnName = "bookid")
    private Books books;

//    @Column(name = "temp",insertable = false,updatable = false)
//        private int booksId;

    @JsonProperty("booksId")
    public void setBoo(int booksId) {
        log.info(books+"AAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        this.books = new Books(booksId);
    }
    @JsonProperty("booksId")
    public int getBoo() {
        log.info(books.getBookid()+"AAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        return books.getBookid();

    }
}
