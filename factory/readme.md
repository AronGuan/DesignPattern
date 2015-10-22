工厂模式  
1.简单工厂  
可以根据参数来指定实例化哪些类。
例子中的类图    
![alt 简单工厂](https://github.com/AronGuan/DesignPattern/blob/master/images/simpleFactory.PNG)  
核心代码  
```
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
```  
2.工厂方法模式  
定义:定义一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类的实例化推迟到子类。  
原因:在不知道实例化哪些对象时，由子类来决定。工厂类只定义接口方法。  

![alt 简单工厂](https://github.com/AronGuan/DesignPattern/blob/master/images/factoryMethod.PNG)   
核心部分`abstract Pizza createPizza(String item);`    

3.抽象工厂模式  
定义:提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。    

类比:只知道要建立工厂，也许是汽车工厂，也许是飞机工厂，汽车工厂上也不知道具体的产品，要有子类决定，你只定义接口和要求。

像是简单工厂和工厂方法模式的结合，不知道具体的建立什么，所以要用工厂方法模式(抽象工厂类中中定义接口，抽象方法)，这里用继承来实现抽象方法。在工厂方法中不知道具体的产品，只是定义一个简单工厂接口，由客户端自己定义。(这里用组合)。

![alt 抽象工厂](https://github.com/AronGuan/DesignPattern/blob/master/images/abstractFactory.PNG)   
核心部分   
```
//抽象工厂类，定义接口
public abstract class PizzaStore {
	protected abstract Pizza createPizza(String item);
	
//实现接口，并使用简单工厂	
public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

//具体简单工厂实现简单工厂PizzIngredientFactory接口		
public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{	
```