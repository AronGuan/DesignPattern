�۲���ģʽ  
���壺�������֮��һ�Զ��������������������һ������ı�״̬ʱ���������е������߶���˵��֪ͨ���Զ����¡�  

��ȣ����綩���ʼ���ϵͳһ���м���list���������е��û����ͻ�Ҫ����ϵͳע��(��list������û�����)��Ȼ�������ʼ�ʱ��ϵͳ�ͱ������������е��û����󣬵��÷���(update()�ķ���)�� �����javase���Ǻܳ�����androidҲ�ǡ�

������ɫ������(subject)�͹۲���(Observer),��������registerObserver()ע�᷽����removeObserver()�Ƴ�������norifyObservers()֪ͨ����  
�������
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
�۲��߶����лص�����  
`void update(float temp,float humidity, float pressure);`  
 
��������  
Ҫ��:����̨����������Ϣ��֪ͨ���еĲ����)
������:WeatherData��
������Observer��������Ҳ�̳���DisplayElement��չʾ��Ϣ