package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Address createAddObj()
    {
       Address addr=new Address(111,"khandwa",74673);

       return addr;

}
@Bean
public Student createstdobj(){
    Student std=new Student(103,"nitesh",createAddObj());

    return std;
}
}
