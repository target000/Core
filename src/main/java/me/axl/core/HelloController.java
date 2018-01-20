package me.axl.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say/{firstName}/{lastName}")
    @ResponseBody
    public String handler(@PathVariable String firstName, @PathVariable String lastName) {
	return "Hello " + firstName + " " + lastName + "!\n";
    }

}
