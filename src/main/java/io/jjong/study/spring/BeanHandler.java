package io.jjong.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanHandler {
  private ApplicationContext context;

  public BeanHandler(Class<?> configClass) {
    this.context = new AnnotationConfigApplicationContext(configClass);
  }

  /**
   * class를 context에 등록 한다.
   * @param classes
   */
  public void register(Class<?>... classes) {
    ((AnnotationConfigApplicationContext)context).register(classes);
    ((AnnotationConfigApplicationContext)context).refresh();
  }

  public <T> T getBean(String name, Class<T> requireType) {
    return context.getBean(name, requireType);
  }
  /**
   * 등록된 bean을 context 에서 찾아서 리턴 한다.
   * @param requireType
   * @param <T>
   * @return
   */
  public <T> T getBean(Class<T> requireType) {
    return context.getBean(requireType);
  }
}
