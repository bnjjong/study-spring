package io.jjong.study.spring.ioc;

public class LongSword implements Sword{
  private int damage = 10;

  @Override
  public boolean isUsable() {
    return true;
  }

  @Override
  public int getDamage() {
    return this.damage;
  }
}
