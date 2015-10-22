迭代器模式  
定义:提供一种方法顺序访问聚合对象中的各个元素，而有不暴露其内部的表示。  

![alt 单例模式](https://github.com/AronGuan/DesignPattern/blob/master/images/iterator.PNG)  

涉及的设计原则  
一个类应该只有一个引起变化的原因。  这里是把游走(遍历)和管理(存储)分开来。  
方式就是实现iterator接口，实现hasNext(),next(),remove()方法。  
