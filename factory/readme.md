装饰者模式  
定义：动态地将责任(可以理解为行为或方法)附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
  
这里关键是知道有两个角色，一个是基本主件，另一个是装饰者(不能单独存在，必须要包含主件或其他装饰者，通过构造方法来传入，拥有共同的接口)  

类比:流水线，最开始的原材料(基本主件)，每进过一道工序(可以认为是装饰者)，就添加新的功能(方法来进行操作)。  
java当中的io流就是这种模式。

例子
星巴兹，要求在购买咖啡时，能够添加各种调料。咖啡就为基本主件，调料为装饰者。  
基本主件和装饰者的共同接口：Beverage  
装饰者的接口和关键部分:CondimentDecorator  
```
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
```