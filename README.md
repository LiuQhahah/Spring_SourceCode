# 注解

## 1.knight.xml



### 1 <ref>

    属性指的是当前bean引用的bean，疑问:"quest"指的是下文中id为quest的bean吗？
### 2 <value>

#{T(System).out}  # 含义：


T的 含义：

SlayDragonQuest.java 中使用PrintStream的目的以及与id 为"quest"bean的关系


## 2 测试 BraveKnightTest.java

BraveKnightTest.java, 测试调用embark()方法次数是否于预定设置的次数相等


## 3.解耦





DamselRescuingKnight 直接创建方法 与BraveKnight 通过调用接口，实现接口，调用实现接口的函数


## 4. main 函数

通过上下文获取bean配置文件，然后获取bean(Knight.class)，调用方法

## 5. 切面注入的实现，通过minstrel.xml配置


xml文件中定义了singBeforeQuest与singAfterQuest方法的
/**java

    // 实现吟游诗人的bean,引入xml配置
    ClassPathXmlApplicationContext contextMins = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
    Knight knightMins = contextMins.getBean(Knight.class);
    knightMins.embarkOnQuest();
    contextMins.close();

**/

## 6 Bean 的声明周期

1. Spring 对 bean进行实例化;
2. Spring 将值和bean 的引用注入到bean对应的属性中;
3. 如果bean 实现了 `BeanNameAware`接口，Spring将bean的ID传递给`setBeanName()`方法;
4. 如果bean 实现了`BeanFactoryAware`接口，Spring将调用`setBeanFactory()`方法，将`BeanFactory`容器实例传入;
5. 如果bean 实现了`ApplicationContextAware`接口， Spring将调用`setApplicationContext()`方法，将bean所在的应用上下文的引用传入进来;
6. 如果bean 实现了`BeanPostProcessor`接口，Spring将调用它们的`postProcessBeforeInitialization()`方法;
7. 如果bean 实现了`InitializingBean`接口，Spring将调用它们的`afterPropertiesSet()`方法。类似地，如果bean使用bean使用`init-method`声明了初始化方法，该方法也会被调用;
8. 如果beam 实现了`BeanPostProcessor`接口，Spring将调用它们的`postProcessAfterInitialization()`方法;
9. 此时，bean已经准备就绪，可以被应用程序使用了，它们将一直驻留在应用上下文中，直到该应用上下文被销毁;
10. 如果bean实现了`DisposableBean`接口，Spring将调用它的`destory()`接口方法。同样，如果bean使用`destory-method`声明了销毁方法，该方法也会被调用。

## 7 下载 spring lib 的方法


        (Where can I download Spring Framework jars without using Maven?)[https://stackoverflow.com/questions/19082860/where-can-i-download-spring-framework-jars-without-using-maven]