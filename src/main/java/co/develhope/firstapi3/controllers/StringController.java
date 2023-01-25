package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController{
    @GetMapping("/")
    public String getConcatenation(@RequestParam(required = true) String requiredString,
                                    String optionalString){
        if(optionalString == null){
            return requiredString;
        }
        return requiredString + optionalString;
    }
}