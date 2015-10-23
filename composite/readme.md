组合模式   
定义:允许你将对象组合成树形结构来表现"整体/部分"层次结构，组合让客户以一致的方式处理个别对象以及对象组合。(即能够对整个结构应用相同的操作(例如打印))，枝和叶可以有一样的操作

最上层的根定义接口，叶是基本的POJO类，而枝实现了操作方法。

类图
![alt 组合模式](https://github.com/AronGuan/DesignPattern/blob/master/images/singleton.PNG)
通过迭代的方式来访问子节点。  

例子(餐馆餐单)  
核心代码部分
```
public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
}
```  