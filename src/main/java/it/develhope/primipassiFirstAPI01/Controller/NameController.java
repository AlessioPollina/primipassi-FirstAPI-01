package it.develhope.primipassiFirstAPI01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/")
    public String getName(){
        return "Ciao, io sono Alessio";
    }

    @PostMapping(value = "/")
    public String postName(){
        StringBuilder name = new StringBuilder("Alessio");
        StringBuilder reverseName = name.reverse();
        return String.format("Ciao, il mio nome è %s%n", reverseName);

    }
}
