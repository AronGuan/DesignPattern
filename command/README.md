命令模式:将"请求"封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象，命令模式也可支持可撤销的操作。

类比:遥控器，上面的每一个键都是一个命令(命令对象)，控制着对象，如电视机，电灯(接收者)，整个遥控器可以看成宏命令(传入一组命令数组，循环执行，可以对一组接收者执行命令)。  

![alt 命令模式](https://github.com/AronGuan/DesignPattern/blob/master/images/command.PNG)  

封装了接收者和一个或一组动作，也可以实现日志（记录储存在硬盘，命令对象读取，并按顺序执行）和事务系统（记录操作的命令，） 
核心接口
```
public interface Command {
	public void execute();
	public void undo();
}

//宏命令对象
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
