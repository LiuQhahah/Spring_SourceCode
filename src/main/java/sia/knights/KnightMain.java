package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;
import sia.knights.config.KnightConfig;

public class KnightMain {

  /**
   * main函数
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    /**
     *
     * 从类路径下的一个或者多个xml配置文件中加载上下文定义
     */
    // bean 基于xml配置的类
//    ClassPathXmlApplicationContext context =
//        new ClassPathXmlApplicationContext(
//            "META-INF/spring/knight.xml");
//
//
//    Knight knight = context.getBean(Knight.class);
//    knight.embarkOnQuest();
//    context.close();

    /**
     * 从一个或多个基于java的配置类中加载Spring 应用上下文6
     */

    //bean 基于java配置的类
//    AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(KnightConfig.class);
//
//    Knight knightJava = contextJava.getBean(Knight.class);
//    knightJava.embarkOnQuest();
//    contextJava.close();

    // 实现吟游诗人的bean,引入xml配置
    ClassPathXmlApplicationContext contextMins = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
    Knight knightMins = contextMins.getBean(Knight.class);
    knightMins.embarkOnQuest();
    contextMins.close();

  }

}
