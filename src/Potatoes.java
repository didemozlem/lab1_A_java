

import java.io.PrintStream;

public class Potatoes extends Food {
    private String type;

    public Potatoes() {
        super("Potato");
    }

    public void setParam(String param) {
        this.type = param;
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(this.type + " " + var10001 + " consumed");
    }

    public String getSize() {
        return this.type;
    }

    public void setSize(String name) {
        this.type = name;
    }
}
