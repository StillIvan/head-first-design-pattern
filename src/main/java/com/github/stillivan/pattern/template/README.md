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