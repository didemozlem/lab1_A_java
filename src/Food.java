// sanal - абстракт
// конкрре
public abstract class Food implements Consumable { // Yemek tüketilebilirler türünden.
    String name = null;
    String size = "";

    public Food(String name) {
        this.name = name;
    }

    public abstract void setParam(String param); // sanal olduğu için bu yapıdan türetilen bütün
                                                 // siniflar bunu yapmak zorunda.

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String equals() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
