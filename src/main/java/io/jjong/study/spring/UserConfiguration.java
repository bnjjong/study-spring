package io.jjong.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfiguration {

  @Bean()
  public User user() {
    return new User("user", 99, "Jeju");
  }

  @Bean("Henry")
  public User user1() {
    return new User("Henry", 38, "Seoul");
  }

  @Bean("James")
  @Scope("prototype")
  public User user2() {
    return new User("James", 29, "Busan");
  }

}
