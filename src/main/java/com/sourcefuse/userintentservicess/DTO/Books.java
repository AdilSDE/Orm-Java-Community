package com.sourcefuse.userintentservicess.DTO;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.List;

//mark class as an Entity
@Entity
//defining class name as Table name
@NoArgsConstructor
@Data
@Table(name = "books")

public class Books
{  
//Defining book id as primary key  
@Id
@Column
private int bookid;  
@Column  (name = "book_name")
private String bookname;  
@Column
private String author;  
@Column  
private int price;

@OneToMany(mappedBy = "books")
private List<Laptop> laptop;
    public Books(int booksId) {
        this.bookid=booksId;
    }
}
