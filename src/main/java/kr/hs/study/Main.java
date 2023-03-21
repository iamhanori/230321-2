package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("Hello world!");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1 : " + obj1);

        TestBean2 obj2 = ctx.getBean("t22", TestBean2.class);
        System.out.println("obj2 : " + obj2);

        TestBean2 obj3 = ctx.getBean("t23", TestBean2.class);
        System.out.println("obj3 : " + obj3);

        ctx.close();
    }
}