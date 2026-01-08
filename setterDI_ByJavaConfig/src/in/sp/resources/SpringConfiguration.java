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
       Address addr=new Address();
       addr.setHouseno(111);
       addr.setCity("khandwa");
       addr.setPincode(53563);
       return addr;

}
@Bean
public Student createstdobj(){
    Student std=new Student();
    std.setRollno(103);
    std.setName("nitesh");
    std.setAddress(createAddObj());
    return std;
}
}
