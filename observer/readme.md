观察者模式  
定义：定义对象之间一对多的依赖，这样依赖，当一个对象改变状态时，它的所有的依赖者都会说到通知并自动更新。  

类比：比如订阅邮件，系统一般有集合list来管理所有的用户，客户要先向系统注册(即list中添加用户对象)，然后有新邮件时，系统就遍历集合中所有的用户对象，调用方法(update()的方法)。 这个在javase倒是很常见，android也是。

两个角色：主题(subject)和观察者(Observer),而主题有registerObserver()注册方法，removeObserver()移除方法，norifyObservers()通知方法  
主题对象
```
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)     observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
```
观察者对象有回调方法  
`void update(float temp,float humidity, float pressure);`  
 
在例子中  
要求:气象台接受气象信息后，通知所有的布告板)
主题是:WeatherData，
其它是Observer对象，另外也继承了DisplayElement来展示信息