package WebApp.demo;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactList(){
        List<Contact> listContact  = new ArrayList<>();

        // moze tutaj byc polaczenie z baza danych database
        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "England"));
        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "Australia"));
        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));

        return listContact;

    }

}
