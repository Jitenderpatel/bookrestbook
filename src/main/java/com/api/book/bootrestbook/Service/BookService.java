package com.api.book.bootrestbook.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.bean.Books;
import com.api.book.bootrestbook.repository.BookRepository;



@Service
public class BookService {
//
	@Autowired
	private BookRepository bookRepository;
//	
//	public static List<Books> list = new ArrayList<Books>();
//	
//
//	static {
//		list.add(new Books(1, "springboot", "2000", "poonam"));
//		list.add(new Books(2, "spring", "500", "jitender"));
//		list.add(new Books(3, "Hibernate", "200", "patel"));
//	}
//
	public List<Books> getAllRecords() {
      List<Books>list=new ArrayList<Books>();
//        list.add(new Books(1,"springboot","2000","poonam"));
//        list.add(new Books(2,"spring","500","jitender"));
//        list.add(new Books(3,"Hibernate","200","patel"));
		list= bookRepository.findAll();
		return list;
	}
//
	public Books getByID(int id) {
       // Optional<Books>list=bookRepository.findById(id)

	      List<Books>list=new ArrayList<Books>();
	      list= bookRepository.findAll();
	      System.out.println(list);
		Books book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}
//	
	public Books saveRecord(Books book) {
		   Books books=bookRepository.save(book);
		System.out.println(book.toString());
		return book;
	}
	public Books updateRecord(Books book) {
		// TODO Auto-generated method stub
		 List<Books>list=new ArrayList<Books>();
	      list= bookRepository.findAll();
	      Books bookss = list.stream().filter(e -> e.getId() == book.getId()).findFirst().get();
	      System.out.println("gg"+bookss);
	      Books booksss=null;
	      if(bookss.getId()==book.getId()) {
//	    	         books.setId(bookss.getId());
//	    	         books.setName(bookss.getName());
//	    	         books.setPrice(bookss.getPrice());
//	    	         books.setAuthor(bookss.getAuthor());
		  booksss = bookRepository.save(book);
		 System.out.println("record is update");
		 
			System.out.println(book.toString());}else{
				System.out.println("record is not update");
			}
		
		return booksss;
	}
}
