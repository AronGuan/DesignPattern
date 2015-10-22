����ģʽ  
����:ȷ��һ����ֻ��һ��ʵ�������ṩһ��ȫ�ַ��ʵ㡣  

![alt ����ģʽ](https://github.com/AronGuan/DesignPattern/blob/master/images/singleton.PNG)  

���Ĵ���  
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
�������ϴ��룬�п���������߳����⣬��ֹ����һ�����󣬽����ʽ��  
>*ͬ��getInstance()���������ַ�������Ҫ  
>*����ʵ����  
>*˫�ؼ�����  

1. ����ʵ������ʽ
`private static Singleton uniqueInstance = new Singleton();` //ֱ��ʵ����  
2. ˫�ؼ�����  
```
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {//��Ϊ��ʱ����
				if (uniqueInstance == null) {//������ڼ��
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
```