
import java.io.PrintStream;

public class Coffee extends Food {
    private String shot;

    public Coffee() {
        super("Coffee");
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " with " + this.shot + " shot espresso consumed");
    }

    public void setParam(String param) {
        this.shot = param;
    }

    public String getSize() {
        return this.shot;
    }

    public void setSize(String size) {
        this.shot = size;
    }
}
