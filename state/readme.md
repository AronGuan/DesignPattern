״̬ģʽ  
����:����������ڲ�״̬�ı�ʱ�ı�������Ϊ���������������޸��������ࡣ

![alt ״̬ģʽ](https://github.com/AronGuan/DesignPattern/blob/master/images/state.PNG)  

Contextӵ������state�����ã�������ĳ��״̬ʱ����������󣬾͸ı�Context��״̬�����о�servlet�ϵĹ�������Struts2��ActionContext�͹�������������ģʽ��  

����(�ǹ���)
���Ĵ���  
```
    //�������еľ���״̬��Context
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

//ִ��ĳ��״̬ʱ���͸ı�ContextĿǰ��ӵ�е�״̬��
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

```
