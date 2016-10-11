## 模板方法 - Template pattern

模板方法模式在一个方法中定义一个算法的骨架，而将一些不走延迟到子类中。模板方使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

## 模板方法的模板

```Java
abstract class AbstractClass{
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }
    
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    
    final void concreteOperation() {
         System.out.println("concrete operation.");
    }
}
```

## 模板方法要点

- 钩子是一种方法，它在抽象类中不做事，或者只做默认的事情，子类可以选择要不要去覆盖它；
- 为了防止子类改变模板方法，而已将模板方法声明为 final；
- 工厂方法是模板方法的一个特殊版本；

## Java 中的模板方法

- Java 中 Arrays.sort 需要结合 Comparable 接口来使用，需要实现 comparedTo() 接口；

## 设计原则

- 好莱坞原则：别调用（打电话给）我们，我们会调用（打电话给）你
    - 我们告诉子类，"不要调用我们，我们会调用你"