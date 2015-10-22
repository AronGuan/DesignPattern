模板方法模式  
定义，在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。   

类比:jsf facet中，页面只定义好一些固定的部分(架构)，但是具体的内容不写，其他页面继承它，写上具体的内容。  
Arrays.sort()也是一个例子。


![alt 单例模式](https://github.com/AronGuan/DesignPattern/blob/master/images/templatemethod.PNG)  
```
public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	abstract void brew();//只定义接口，让子类来实现
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
```
