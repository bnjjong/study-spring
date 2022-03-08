package io.jjong.study.spring.ioc;


public class Knight {
  private String name;
  private Sword sword;

  /**
   * 외부에서 객체를 주입 받으므로 제어권이 역전되었다고 얘기 함.
   * @param name
   * @param sword
   */
  public Knight(String name, Sword sword) {
    this.name = name;
    this.sword = sword;
  }
}
