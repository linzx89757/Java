package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1.����HelloWorld��һ������
		//HelloWorld helloworld = new HelloWorld();
		//2.Ϊuser���Ը�ֵ
		//helloworld.setUser("Amy");
		//3.����hello()
		//helloworld.hello();
		
		//1.����Spring ��IOC����
		//ApplicationContext ����IOC����
		//ClassPathXmlApplicationContext : ��AppliationContext �ӿڵ�ʵ���࣬��ʵ�������·���������������ļ�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbeanʵ��
		//����id��λ��IOC�����е�bean
		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloworld");
		System.out.println(helloworld);
		//3.����hello()
		helloworld.hello();
	}

}
