����ģʽ  
1.�򵥹���  
���Ը��ݲ�����ָ��ʵ������Щ�ࡣ
�����е���ͼ    
![alt �򵥹���](https://github.com/AronGuan/DesignPattern/blob/master/images/simpleFactory.PNG)  
���Ĵ���  
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
2.��������ģʽ  
����:����һ����������Ľӿڣ������������Ҫʵ������������һ�����������������ʵ�����Ƴٵ����ࡣ  
ԭ��:�ڲ�֪��ʵ������Щ����ʱ����������������������ֻ����ӿڷ�����  

![alt �򵥹���](https://github.com/AronGuan/DesignPattern/blob/master/images/factoryMethod.PNG)   
���Ĳ���`abstract Pizza createPizza(String item);`    

3.���󹤳�ģʽ  
����:�ṩһ���ӿڣ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ�������ࡣ    

���:ֻ֪��Ҫ����������Ҳ��������������Ҳ���Ƿɻ�����������������Ҳ��֪������Ĳ�Ʒ��Ҫ�������������ֻ����ӿں�Ҫ��

���Ǽ򵥹����͹�������ģʽ�Ľ�ϣ���֪������Ľ���ʲô������Ҫ�ù�������ģʽ(���󹤳������ж���ӿڣ����󷽷�)�������ü̳���ʵ�ֳ��󷽷����ڹ��������в�֪������Ĳ�Ʒ��ֻ�Ƕ���һ���򵥹����ӿڣ��ɿͻ����Լ����塣(���������)��

![alt ���󹤳�](https://github.com/AronGuan/DesignPattern/blob/master/images/abstractFactory.PNG)   
���Ĳ���   
```
//���󹤳��࣬����ӿ�
public abstract class PizzaStore {
	protected abstract Pizza createPizza(String item);
	
//ʵ�ֽӿڣ���ʹ�ü򵥹���	
public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

//����򵥹���ʵ�ּ򵥹���PizzIngredientFactory�ӿ�		
public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{	
```