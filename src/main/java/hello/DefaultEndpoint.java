package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultEndpoint {
    @RequestMapping("/")
    public String deafultEndpoint () {
	return "Fuck off as a service.  Brought to you by Spring Boot"
    }
}
