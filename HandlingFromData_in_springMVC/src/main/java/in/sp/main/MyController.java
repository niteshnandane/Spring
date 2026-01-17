package in.sp.main;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @GetMapping("/hello")
    public ModelAndView openHelloPage(){
        System.out.println("openHelloPage() method executed");
        ModelAndView mav=new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }
     @GetMapping("/aboutUs")
    public String openAboutUsPage(){
        return "about-us";
    }

    @GetMapping("/test")
    public String testHtmlPage(){

        return "test";
    }

    @GetMapping("/myform")
    public String openFormPage(){
        return "myform";
    }
/* method 1 to get provide data
    @PostMapping("/submitForm")
    public String handleMyForm(HttpServletRequest rq){
       String myname= rq.getParameter("name1");
       String myemail=rq.getParameter("email1");
       String myphone=rq.getParameter("phone1");

        System.out.println("MyName :" +myname);
        System.out.println("MyEmail :" +myemail);
        System.out.println("PhoneNO :" +myphone);

        return "profile";
    }

 */
}
