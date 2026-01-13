package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

    @Bean
    public DriverManagerDataSource myDataSources(){
      DriverManagerDataSource dataSource=new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
      dataSource.setUsername("root");
      dataSource.setPassword("2000@nitesh");
      return dataSource;
    }

    @Bean
    public JdbcTemplate myjdbcTemplate(){
      JdbcTemplate jdbcTemplate=new JdbcTemplate();
      jdbcTemplate.setDataSource(myDataSources());

      return jdbcTemplate;
    }
}
