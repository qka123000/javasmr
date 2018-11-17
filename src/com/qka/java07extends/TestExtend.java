package com.qka.java07extends;

/*
 * 面向对象的特征：
 * 1.为什么要有继承性；
 * 	把多个类，公共的属性和方法抽取出来；放到一个类中，然后继承这个类；简化代码；
 * 
 * 2 语法：class A extends B
 * 	实现A继承B
 * 	子类:A;父类（基类SuperClass）：B
 * 
 * 3 子类继承父类以后，父类中声明的属性、方法、子类就可以获取到并使用；
 * 	注意：当父类中有私有的属性或者方法时，子类同样可以获取得到，只是由于封装性的设计使得子类不可以直接调用罢了；
 *  子类除了通过集成，获取父类的结构之外，还可以定义自己的特有的成分；
 *  extends:子类是对父类功能的“扩展”，明确子类不是父类的子集；
 * 4.java只支持单继承，一个子类只能有一个父类，一个父类可以有多个子类；
 * 5.子类父类是相对的概念.graduate extends student extends person
 * 
 * 方法的重写: ---(区别于方法的重载:) 
 * 	1 前提:子类继承父类
 * 	2子类继承父类后,若父类的方法对子类不适用,那么子类可以对父类的方法重写,覆盖,覆写(override)
 * 	3重写规则:
 * 		1) 要求子类方法的返回值类型,方法名,参数列表,于父类的方法一样;
 * 		2) 子类方法的饰符不能小于(大于等于)父类的方法如子类的 eat 方法是private的父类是public的会报错;
 * 		3) (没讲到暂时忽略)子类父类方法必须同为static或同为非static的;
 * 		4) (没讲到暂时忽略)若父类方法抛异常,那么子类方法抛的异常类型不能小于父类的;
 * */
public class TestExtend {
	public static void main(String args[]) {
		Student s = new Student();
		s.eat();

		Worker w = new Worker();
		w.walk();

		Person p = new Person();
		p.eat();
		s.setAge("11");
		s.setName("z3f");
		System.out.println(s.getAge() + "," + s.getName());

		Graduate g = new Graduate();
		g.eat();
		g.show();
	}
}
