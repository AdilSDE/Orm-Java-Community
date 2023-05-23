package com.sourcefuse.userintentservicess.controller;

import com.sourcefuse.userintentservicess.DTO.Books;
import com.sourcefuse.userintentservicess.DTO.Laptop;
import com.sourcefuse.userintentservicess.repository.BooksRepository;
import com.sourcefuse.userintentservicess.repository.MovieRepository;
import com.sourcefuse.userintentservicess.repository.StudentRepository;
//import com.sourcefuse.userintentservicess.service.BooksService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BooksController   
{  
//autowire the BooksService class
 private final StudentRepository studentRepository;
 private final BooksRepository booksRepository;
    private final MovieRepository movieRepository;
 //@Autowired
 //BooksService booksService;
//creating a get mapping that retrieves all the books detail from the database

@PostMapping("/book")
private Laptop getAllBooks(@RequestBody Laptop laptop)
{
    booksRepository.save(new Books(10));

  return studentRepository.save(laptop);
 //return  studentRepository.countByAuthorAndPriceIn(laptop.getAuthor(), Arrays.asList(laptop.getPrice()));
}
    @GetMapping("/getAll")
    private List<Laptop> getAll()
    {
        System.out.println(movieRepository.findMoviesByName("goo"));
        return (List<Laptop>) studentRepository.findAll();
        //return  studentRepository.countByAuthorAndPriceIn(laptop.getAuthor(), Arrays.asList(laptop.getPrice()));
    }
/*//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{bookid}")  
private Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksService.getBooksById(bookid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid)   
{  
booksService.delete(bookid);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/books")
private int saveBook(@RequestBody Books books)
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/books")  
private Books update(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  */
}  