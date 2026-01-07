package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean("stdobj")
   public Student stdId1(){
     Student std=new Student();
     std.setName("nitesh");
     std.setRollno(101);
     std.setEmail("nitesh20@gmail.com");
     return  std;
   }

    @Bean("stdobj1")
    public Student stdId2(){
        Student std=new Student();
        std.setName("skti");
        std.setRollno(102);
        std.setEmail("skti20@gmail.com");
        return  std;
    }
}
