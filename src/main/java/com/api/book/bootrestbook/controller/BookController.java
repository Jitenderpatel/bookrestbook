package com.api.book.bootrestbook.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.Service.BookService;
import com.api.book.bootrestbook.bean.Books;




@RestController
@RequestMapping("/")
public class BookController {
@Autowired
  BookService bookService;
  
   // @RequestMapping(value="/books", method=RequestMethod.GET)
    @GetMapping("/books")
    public List<Books> getBook(){
        // Books books= new Books();
        // books.setId(1);
        // books.setAuthor("Jitender");
        // books.setName("Tripati");
        // books.setPrice("2999");
            return this.bookService.getAllRecords();
    }
   // @RequestMapping(value="/books/{id}", method=RequestMethod.GET)
    @GetMapping("/books/{id}")
    public Books getById(@PathVariable int id) {
    	
    	Books books=bookService.getByID(id);
    	return books;
    }
   
    @PostMapping("/books")
    public Books Save(@RequestBody Books book) {
        //TODO: process POST request
        System.out.println("books method call");
        return book;
    }
    
    @DeleteMapping("/Book/{id}")
    public Books deleteRecord(@PathVariable int id){
           Books book= this.bookService.getByID(id);
      return  book;
    }
    
}
