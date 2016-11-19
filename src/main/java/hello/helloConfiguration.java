package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Configuration
@ConfigurationProperties("config")
public class helloConfiguration {

    // this will be 'end'
    // this might require getters and setters
    private String another_value;
}
