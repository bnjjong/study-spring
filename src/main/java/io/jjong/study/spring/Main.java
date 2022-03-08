package io.jjong.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    BeanHandler handler = new BeanHandler(UserConfiguration.class);

    User henry = handler.getBean("Henry",User.class);
    System.out.println(henry);

    // modify bean
    henry.setAge(30);

    henry = handler.getBean("Henry",User.class);
    System.out.println(henry);

    User james = handler.getBean("James", User.class);
    System.out.println(james);

    // modify bean
    james.setAddress1("Ulsan");
    james = handler.getBean("James", User.class);

    System.out.println(james);

    User user = handler.getBean("user", User.class);
    System.out.println(user);

  }
}
