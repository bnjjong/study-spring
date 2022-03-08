package io.jjong.study.spring.ioc;

public class ShortSword implements Sword {
  private int damage = 5;

  @Override
  public boolean isUsable() {
    return true;
  }

  @Override
  public int getDamage() {
    return this.damage;
  }
}
