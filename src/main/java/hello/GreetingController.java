package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {
    public static final String template = "Fuck off, %s!";
    public final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method=RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name",
					   defaultValue="you") String name) {
	return new Greeting(counter.incrementAndGet(),
			    String.format(template, name));
    }

    @RequestMapping(path="/greeting", consumes={"application/json", "application/xml", "application/yaml"}, method=RequestMethod.POST)
    public Greeting otherGreeting(@RequestBody
                                  GreetingInput input) {
        String name = input.name;
        return greeting(name);
    }

}
