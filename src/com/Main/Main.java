package com.Main;

import com.it.pojo.Books;
import com.it.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Object obj = app.getBean("user");
        System.out.println(obj);
        User u = (User)app.getBean("user");
        System.out.println(u);
       /* Books b = (Books) app.getBean("book");
        System.out.println(b);*/
        Books b = (Books) app.getBean("books");
        System.out.println(b);
       Books b1 =  app.getBean("book",Books.class);
       Books b2 =  app.getBean("book",Books.class);
        System.out.println(b1);
        System.out.println(b2);
    }
}
