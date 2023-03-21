package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("Hello world!");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1 : " + obj1);
        ctx.close();
    }
}