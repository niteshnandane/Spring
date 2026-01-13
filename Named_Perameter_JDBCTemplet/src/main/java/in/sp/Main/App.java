package in.sp.Main;

import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=context.getBean(NamedParameterJdbcTemplate.class);

        Map<String, Object> map=new HashMap<String, Object>();
        map.put("key_rollno",105);
        map.put("key_name","rahul");
        map.put("key_marks",80.5f);
        String insertdata="insert into student values(:key_rollno,:key_name,:key_marks)";
        int count=namedParameterJdbcTemplate.update(insertdata,map);
        if(count>0){
            System.out.println("data insert");
        }
        else {
            System.out.println(" insertion failed");
        }
    }
}
