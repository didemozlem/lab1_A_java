

import java.io.PrintStream;

public class IceCream extends Food {
    private String siryp;

    public IceCream() {
        super("IceCream");
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " with " + this.siryp + " syrup eaten");
    }

    public void setParam(String param) {
        this.siryp = param;
    }
}
