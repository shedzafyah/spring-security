package zw.co.afrosoft.main;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "This is the home page";
    }
}
