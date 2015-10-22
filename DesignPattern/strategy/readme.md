策略模式  
定义：定义算法族(把变化的行为单独拿出来)，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。  

类比：可以想象能够可以装拆卸的玩具，比如翅膀，翅膀可以有许多种类(可以定义翅膀接口)，而有多个实现方式，而玩具本身有装翅膀的装置(认为是接口的引用，和相应的修改方法)。  

例子中的类关系(鸭子的例子，鸭子有不同的飞行和叫的方式)  
Duck<--ADuck  `class ADuck extends Duck`
而Duck有fly和quack的引用
```
    protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void changeBehavior() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}//修改方法
```  
软件开发的一个不变的真理：change(需求改变),也是设计模式诞生的原因， 可维护，可扩展的软件。
涉及的设计原则  
>* 找出应用中需要改变的之处，把他们独立出来，不要和不需要变化的混在一起 (关注类中的行为，即方法) 
>* 针对接口编程，而不是针对实现编程(用多态和继承)  
>* 多用组合，少用继承 可以增加弹性，不仅可以封装成类，也可以在运行时动态的改变行为。
