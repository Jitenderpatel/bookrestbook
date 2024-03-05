package com.api.book.bootrestbook.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.bean.Books;

@Component
//@Service
public class BookService {
    

     public  static List<Books>list=new ArrayList<Books>();

     static{
         list.add(new Books(1,"springboot","2000","poonam"));
        list.add(new Books(2,"spring","500","jitender"));
        list.add(new Books(3,"Hibernate","200","patel"));
     }
    public List<Books> getAllRecords(){
//        List<Books>list=new ArrayList<Books>();
//        list.add(new Books(1,"springboot","2000","poonam"));
//        list.add(new Books(2,"spring","500","jitender"));
//        list.add(new Books(3,"Hibernate","200","patel"));
        return list;
    }

    public Books getByID(int id){
//        List<Books>list=new ArrayList<Books>();
//        list.add(new Books(1,"springboot","2000","poonam"));
//        list.add(new Books(2,"spring","500","jitender"));
//        list.add(new Books(3,"Hibernate","200","patel"));
        Books book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
