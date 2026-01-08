package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddObj(){ // createAddObj:this bean object and set values
        Address addr=new Address();

            addr.setHouseno(100);
        addr.setCity("khandwa");
        addr.setPincode(566363);
        return addr;
        }
        @Bean
        public Student createStdObj(){
        Student std=new Student();
        std.setName("nitesh");
        std.setRollno(123);
 //       std.setAddress(createAddObj());  //manually D I
        return std;
        }
    }


