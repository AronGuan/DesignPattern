���ģʽ   
����:�����㽫������ϳ����νṹ������"����/����"��νṹ������ÿͻ���һ�µķ�ʽ�����������Լ�������ϡ�(���ܹ��������ṹӦ����ͬ�Ĳ���(�����ӡ))��֦��Ҷ������һ���Ĳ���

���ϲ�ĸ�����ӿڣ�Ҷ�ǻ�����POJO�࣬��֦ʵ���˲���������

��ͼ
![alt ���ģʽ](https://github.com/AronGuan/DesignPattern/blob/master/images/singleton.PNG)
ͨ�������ķ�ʽ�������ӽڵ㡣  

����(�͹ݲ͵�)  
���Ĵ��벿��
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