#Data Structures with Java (Second Edition)
---
🔽**Java类型**🔽

	Java数据类型
		|---- 原始类型
		|		|---- 数值类型
		|		|		|---- 整型
		|		|		|		|---- 整数
		|		|		|		|		|---- byte
		|		|		|		|		|---- short
		|		|		|		|		|---- int
		|		|		|		|		|---- long
		|		|		|		|---- 字符
		|		|		|				|---- byte
		|		|		|---- 浮点类型
		|		|				|---- float
		|		|				|---- double
		|		|---- 布尔类型
		|				|---- boolean
		|---- 引用类型
				|---- 数据组
				|---- 接口
				|---- 类
				|---- 枚举

---
🔽**Java定义一个类的格式**🔽

```java
modifers class class-name associations {
	declarations
}
```
modifers 是关键字（比如 ==public== 和 ==abstract==），class-name 是表示类名称的标识符（比如Person），associations 是子句（比如==extends== Object），declarations 是对类成员的声明。

---
🔽**构造函数与其他方法的区别**🔽

构造函数是创建对象的子程序，它与方法类似，区别在于：

* 其名称和类名相同
* 没有返回类型
* 通过 ==new== 操作符调用

🔽**修饰符**🔽

>用于类、接口和枚举的修饰符：

|修饰符|含义|
|:-:|:-:|
|abstract|该类不能被实例化|
|final|该类不能被继承|
|strictfp|浮点结果将与平台无关|
|public|可以从任何其他类访问|

>构造函数修饰符

|修饰符|含义|
|:-:|:-:|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|

>字段修饰符

|修饰符|含义|
|:-:|:-:|
|final|必须初始化而且不能对其进行改变|
|static|同一存储适用于该类的所有实例|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|
|transient|不是对象的永久状态|
|volatile|可以由异步线程修改|


>方法修饰符

|修饰符|含义|
|:-:|:-:|
|abstract|主体内容缺失，需要在子类中定义|
|public|访问范围为所有类|
|protected|访问范围仅限于当前类及其子类|
|private|访问范围仅限于当前类|
|final|在类继承中不能被重写|
|static|不带有隐式参数|
|native|主体内容是在另一种编程语言中实现的|
|strictfp|浮点结果将与平台无关|
|synchronized|必须锁定后才能被线程调用|
|volatile|可以由异步线程修改|

>局部变量修饰符

|修饰符|含义|
|:-:|:-:|
|final|必须初始化而且不能对其进行改变|












