ģ�巽��ģʽ  
���壬��һ�������ж���һ���㷨�ĹǼܣ�����һЩ�����ӳٵ������У�ģ�巽��ʹ����������ڲ��ı��㷨�ṹ������£����¶����㷨�е�ĳЩ���衣   

���:jsf facet�У�ҳ��ֻ�����һЩ�̶��Ĳ���(�ܹ�)�����Ǿ�������ݲ�д������ҳ��̳�����д�Ͼ�������ݡ�  



![alt ����ģʽ](https://github.com/AronGuan/DesignPattern/blob/master/images/templateMethod.PNG)  
```
public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	abstract void brew();//ֻ����ӿڣ���������ʵ��
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
```