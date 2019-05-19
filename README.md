# 设计模式示例及示例讲解

- [创建型模式](#1)

本项目包含23中设计模式的简单示例以及部分设计模式详解。

**构建工具**

- Maven

**目录说明**

```
├─java
│  └─designpattern
│      ├─behavioral：行为型设计模式示例
│      ├─creational：创建型设计模式示例
│      └─structural：结构型设计模式示例
└─resources
    ├─doc：各种设计模式详细文档说明
    ├─img：设计模式的UML
    └─xml：设计模式示例使用到的xml资源
```

## 创建型模式{#1}

创建型模式(Creational Pattern)对类的实例化过程进行了抽象，能够将软件模块中对象的创建和对象的使用分离。为了使软件的结构更加清晰，外界对于这些对象只需要知道它们共同的接口，而不清楚其具体的实现细节，使整个系统的设计更加符合单一职责原则。创建型模式隐藏了类的实例的创建细节，通过隐藏对象如何被创建和组合在一起达到使整个系统独立的目的。

- [简单工厂模式（Factory Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/creational/简单工厂模式.md)

  简单工厂模式，又称为静态工厂方法(Static Factory Method)模式。在简单工厂模式中，可以**根据参数的不同返回不同类的实例**。简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。

- [工厂方法模式(Factory Method Pattern)](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/creational/工厂方法模式.md)

  在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，这样做的目的是将产品类的实例化操作延迟到工厂子类中完成，即通过工厂子类来确定究竟应该实例化哪一个具体产品类。

- [抽象工厂模式（Abstract Factory Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/creational/抽象工厂模式.md)

  提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。

- [单例模式（Singleton Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/creational/单例模式.md)

  单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。

- 建造者模式（Builder Pattern）

  建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。

- 原型模式（Prototype Pattern）

  用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

##  结构型模式
结构型模式(Structural Pattern)描述如何将类或者对象结合在一起形成更大的结构，就像搭积木，可以通过 简单积木的组合形成复杂的、功能更为强大的结构。

结构型模式可以分为**类结构型模式**和**对象结构型模式**：

- 类结构型模式关心类的组合，由多个类可以组合成一个更大的系统，在类结构型模式中一般只存在**继承**关系和**实现**关系。
- 对象结构型模式关心**类与对象的组合**，通过关联关系使得在一 个类中定义另一个类的实例对象，然后通过该对象调用其方法。 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。

结构型模式的种类如下，这些设计模式关**注类和对象的组合**。

- [适配器模式（Adapter Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/structural/适配器模式.md)

  将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。

- 桥接模式（Bridge Pattern）

  将抽象部分与实现部分分离，使它们都可以独立的变化。

- 过滤器模式（Filter、Criteria Pattern）

- 组合模式（Composite Pattern）

  将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

- [装饰器模式（Decorator Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/structural/装饰器模式.md)

  动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。

- [外观模式（Facade Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/structural/外观模式.md)

  为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

- 享元模式（Flyweight Pattern）

  运用共享技术有效地支持大量细粒度的对象。

- [代理模式（Proxy Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/structural/代理模式.md)

  给某一个对象提供一个代理，并由代理对象控制对原对象的引用。

##  行为型模式
这些设计模式特别关注对象之间的通信。

- 责任链模式（Chain of Responsibility Pattern）

- [命令模式（Command Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/behavioral/命令模式.md)

  请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

- 解释器模式（Interpreter Pattern）

  种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。

- 迭代器模式（Iterator Pattern）

  提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。

- 中介者模式（Mediator Pattern）

  用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

- 备忘录模式（Memento Pattern）

  在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。

- [观察者模式（Observer Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/behavioral/观察者模式.md)

  定义了对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。观察者模式又叫做发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。

- 状态模式（State Pattern）

  允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。

- 空对象模式（Null Object Pattern）

- [策略模式（Strategy Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/behavioral/策略模式.md)

  定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。

- [模板模式（Template Pattern）](https://github.com/Grootzz/design-pattern/blob/master/src/main/resources/doc/behavioral/模板模式.md)

  定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

- 访问者模式（Visitor Pattern）

  主要将数据结构与数据操作分离。

## 参考

- <https://design-patterns.readthedocs.io/zh_CN/latest/index.html>

- <https://www.runoob.com/design-pattern/design-pattern-tutorial.html>
- <https://javadoop.com/post/design-pattern#toc4>
- <https://blog.csdn.net/hewei0241/article/details/7674450>
- <https://juejin.im/entry/5700b9732e958a005920ec19>
- <https://blog.csdn.net/briblue/article/details/73928350>