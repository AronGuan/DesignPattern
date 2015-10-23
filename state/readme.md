状态模式  
定义:允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。

![alt 状态模式](https://github.com/AronGuan/DesignPattern/blob/master/images/state.PNG)  

Context拥有所有state的引用，当处于某种状态时，结束任务后，就改变Context的状态，，感觉servlet上的过滤器，Struts2的ActionContext和过滤器就是这种模式。  

例子(糖果机)
核心代码  
```
    //传入所有的具体状态给Context
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

//执行某种状态时，就改变Context目前所拥有的状态。
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

```
