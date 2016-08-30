package hello;

public class Greeting {
    public final long id;
    private final String content;

    public Greeting(long id, String content) {
	this.id = id;
	this.content = content;
    }

    private long getId() {
	return id;
    }

    public String getContent() {
	return content;
    }
}
