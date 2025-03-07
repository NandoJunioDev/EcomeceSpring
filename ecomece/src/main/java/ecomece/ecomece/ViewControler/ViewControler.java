package ecomece.ecomece.ViewControler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller("/login")


public class ViewControler {
    @GetMapping("/login")
    public String hello (){
        return "login";
    }
}
