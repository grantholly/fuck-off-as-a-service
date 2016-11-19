package hello;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by gholly on 11/14/16.
 */
public class GreetingControllerTest {

    private GreetingController greetingController;

    @org.junit.Before
    public void setUp() throws Exception {
        greetingController = new GreetingController();

    }

    @org.junit.Test
    public void greeting() throws Exception {
        Greeting output = greetingController.greeting("Grant");
        assertNotNull(output.id);
        assertEquals("Fuck off, Grant!", output.getContent());
    }

    @org.junit.Test
    public void otherGreeting() throws Exception {

    }

}