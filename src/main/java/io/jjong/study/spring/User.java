package io.jjong.study.spring;

public class User {
  private String name;
  private int age;
  private String address1;

  public User(String name, int age, String address1) {
    this.name = name;
    this.age = age;
    this.address1 = address1;
  }


  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress1() {
    return address1;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address1='" + address1 + '\'' +
        '}';
  }


}
