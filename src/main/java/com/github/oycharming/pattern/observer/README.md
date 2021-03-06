## 观察者模式 - Observer pattern
观察者模式定义了对象之间的一对多以来,这样一来,当一个对象改变状态时,它的所有依赖者都会受到通知并自动更新。

## 代码说明
用个比较简单的例子理解观察者模式,观察者模式就好像是用户和微信公众号的关系,用户可以订阅微信公众号,也可以取消订阅微信公众号。当用户订阅了微信公众号的时候,微信公众号有更新也会通知到用户;如果用户取消订阅微信公众号,也就收不到微信公众号的更新了。

本代码的例子是天气数据源与显示不同天气状况的屏幕,当天气数据源变化的时候,所有屏幕的数据也需要变化。

* data 包是天气数据,其中 J 开头的是实现 Java 自带的 java.util.Observable 接口;
* display 包是展示不同天气状况的屏幕,其中 J 开头的是实现 Java 自带的 java.util.Observer 接口;

## 观察者模式如何体现设计原则

* **找出应用中可能需要变化之处,把它们独立出来,不要和那些不需要变化的代码混在一起:**在观察者模式中,会改变的是主题的状态,以及观察者的数目和类型。用这个模式,你可以改变依赖于主题状态的对象,却不改变主题。这就叫提前规划。
* **针对接口编程,而不是针对实现编程:**主题与观察者都是用接口,观察者利用主题的接口向主题注册,而主题利用观察者的接口通知观察者。这样可以让两者之间运作正常,又同时具有松耦合的有点。
* **多用组合,少用继承:**观察者模式利用"组合"将许多观察者组合进主题中。对象之间的这种关系不是通过继承产生的,而是在运营时利用组合的方式而产生的。
* **为交互对象之间的松耦合设计而努力:**