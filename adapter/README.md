适配器模式  
定义:将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。  

类比:偷梁换柱,客户端意味调用的是这个接口，其实内部调用的是另一个接口的方法。



![alt 适配器模式](https://github.com/AronGuan/DesignPattern/blob/master/images/adapter.PNG)  

核心代码  
```
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
```