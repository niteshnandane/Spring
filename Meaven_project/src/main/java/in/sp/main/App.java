package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

     String loc = "in/sp/resources/applicationContext.xml";
     ApplicationContext context = new ClassPathXmlApplicationContext(loc);
     Student st = context.getBean(Student.class);
     st.display();

    }
}
