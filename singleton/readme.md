单件模式  
定义:确保一个类只有一个实例，并提供一个全局访问点。  

![alt 单例模式](https://github.com/AronGuan/DesignPattern/blob/master/images/singleton.PNG)  

核心代码  
```
	private static Singleton uniqueInstance;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
```  
但是以上代码，有可能引起多线程问题，不止创建一个对象，解决方式：  
>*同步getInstance()方法，这种方法不必要  
>*急切实例化  
>*双重检查加锁  

1. 急切实例化方式
`private static Singleton uniqueInstance = new Singleton();` //直接实例化  
2. 双重检查加锁  
```
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {//不为空时加锁
				if (uniqueInstance == null) {//进入后在检查
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
```