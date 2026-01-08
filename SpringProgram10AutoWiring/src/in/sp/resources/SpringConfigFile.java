package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

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
        public Subjects createSubjObj(){
        Subjects subj=new Subjects();

            List<String> subjects_list=new ArrayList<String>();
            subjects_list.add("java");
            subjects_list.add("python");
            subjects_list.add("c++");

            subj.setSubjects(subjects_list);
             return subj;
        }
        @Bean
        public Student createStdObj(){
        Student std=new Student();
        std.setName("nitesh");
        std.setRollno(123);
 //      std.setAddress(createAddObj());  //manually D I
 //           std.setSubjects(createSubjObj()); // manually DI
        return std;
        }
    }


