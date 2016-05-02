package com.briup.ch05;
 
public class Test
{
	public static void main(String[] args){
		/**
		//实例化对象
		 1.类加载：将Student类加载到内存中
		 2.根据Studet类在堆内存中开辟内存空间
		 3.在jvm将中的对象变量进行初始化
		 4.调用构造函数完成顾客初始化
		 5.将顾客的内存首地址返回
		*/
		Student stu1 = new Student();
	    stu1.setId(1001L);
		stu1.setName("张三");
		stu1.setGender("男");
		/*System.out.println("stu1 id:"+stu1.getId());
        System.out.println("stu1 name:"+stu1.getName());    
        System.out.println("stu1 gender:"+stu1.getGender()); 
		System.out.println(stu1);//在默认情况下，打印对象。完整类名@hash码*/
		System.out.println(stu1.toString());
    
         Student stu2 = new Student(1001L, "李四","男");
		 /*stu2.setId(1002L);1
		 stu2.setName("李四");
		 stu2.setGender("男");*/

		 
		System.out.println(stu2);//在Student中写了一个toString在测重复调用试类中可以
	}
	 
} 
