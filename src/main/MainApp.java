package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;

public class MainApp {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");

        MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency) factory
                .getBean("MySpringWriterBeanWithDependency");

        test.run();
    }
}
