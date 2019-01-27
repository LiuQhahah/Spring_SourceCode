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
