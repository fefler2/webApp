package WebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AppController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("AppController-> welcome ()");
        return "index";
    }

    @RequestMapping("/list/contact")
    public String listContact(Model model){
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList=  business.getContactList();

        model.addAttribute("contacts", contactList);

        return "contact";
    }

}
