package com.briup.ch05;
 
public class Test
{
	public static void main(String[] args){
		/**
		//ʵ��������
		 1.����أ���Student����ص��ڴ���
		 2.����Studet���ڶ��ڴ��п����ڴ�ռ�
		 3.��jvm���еĶ���������г�ʼ��
		 4.���ù��캯����ɹ˿ͳ�ʼ��
		 5.���˿͵��ڴ��׵�ַ����
		*/
		Student stu1 = new Student();
	    stu1.setId(1001L);
		stu1.setName("����");
		stu1.setGender("��");
		/*System.out.println("stu1 id:"+stu1.getId());
        System.out.println("stu1 name:"+stu1.getName());    
        System.out.println("stu1 gender:"+stu1.getGender()); 
		System.out.println(stu1);//��Ĭ������£���ӡ������������@hash��*/
		System.out.println(stu1.toString());
    
         Student stu2 = new Student(1001L, "����","��");
		 /*stu2.setId(1002L);1
		 stu2.setName("����");
		 stu2.setGender("��");*/

		 
		System.out.println(stu2);//��Student��д��һ��toString�ڲ��ظ����������п���
	}
	 
} 
