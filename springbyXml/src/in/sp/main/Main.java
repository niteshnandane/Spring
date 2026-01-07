package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
         String config_loc="in/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);

         Student std= (Student) context.getBean("stdId");
         std.display();

         Student  std1=(Student) context.getBean("stdId2");
         std1.display();
    }
}
/*
 1. spring-bean-xxx.jar
  2. spring-core-xxx.jar
   3. spring-context-xxx.jar
    4. spring-logging-xxx.jar
     5. spring-expression-xxx.jar
 */