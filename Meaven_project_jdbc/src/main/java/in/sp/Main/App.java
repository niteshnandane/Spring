package in.sp.Main;

import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    JdbcTemplate jdbcTemplate =context.getBean(JdbcTemplate.class);

/*

       //------------  insert Operation-------------------

        int std_roll=105;
        String std_name="manav";
        float std_marks=91.20f;

    String sql="insert into student  values(?,?,?);";
 int count=   jdbcTemplate.update(sql,std_roll,std_name,std_marks);

 if(count>0){
     System.out.println("data insert");
 }else {
     System.out.println("insertion failed");
 }
      */
/*

     //  -----------------------Update Operation-----------------
          float std_marks=90.5f;
          int std_roll=101;
       String query="update student set std_marks=? where std_roll=?";
        int count=   jdbcTemplate.update(query,std_marks,std_roll);

        if(count>0){
            System.out.println("data update");
        }else {
            System.out.println("update failed");
        }
             */
        /*

        //----------Delete Operation------------------


        int std_roll=105;
        String query="delete from  student where std_roll=?";
        int count=   jdbcTemplate.update(query,std_roll);

        if(count>0){
            System.out.println("data delete");
        }else {
            System.out.println("deletion failed");
        }

         */

        //-----------------fatch data--------------------------
        String query="select *from student";
        List<Student> list=jdbcTemplate.query(query,new StudentRowMapper());
        for(Student std :list){
            System.out.println("Rollno :"+std.getRollno());
            System.out.println("Name :"+std.getName());
            System.out.println("Marks :"+std.getMarks());
            System.out.println("--------------------------------------------------");
        }
    }

}
