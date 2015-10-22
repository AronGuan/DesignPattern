����ģʽ:��"����"��װ�ɶ����Ա�ʹ�ò�ͬ�����󣬶��л�����־��������������������ģʽҲ��֧�ֿɳ����Ĳ�����

���:ң�����������ÿһ��������һ������(�������)�������Ŷ�������ӻ������(������)������ң�������Կ��ɺ�����(����һ���������飬ѭ��ִ�У����Զ�һ�������ִ������)��  

![alt ����ģʽ](https://github.com/AronGuan/DesignPattern/blob/master/images/command.PNG)  

��װ�˽����ߺ�һ����һ�鶯����Ҳ����ʵ����־����¼������Ӳ�̣���������ȡ������˳��ִ�У�������ϵͳ����¼����������� 
���Ľӿ�
```
public interface Command {
	public void execute();
	public void undo();
}

//���������
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
```
