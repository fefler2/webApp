package WebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @RequestMapping("/")
    public String welcome(){
        System.out.println("AppController-> welcome ()");
        return "index";
    }

}