package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    public static final String template = "Fuck off, %s!";
    public final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",
					   defaultValue="you") String name) {
	return new Greeting(counter.incrementAndGet(),
			    String.format(tamplate, name));
    }
}
