//class veri tipi kendi rollerini ve metodlarını içeren, o klassın objeleri bunları kullanabilir.

public class Main {

    public static void main(String[] args) throws Exception { //bütün klass ve objeler buradan yönetiliyor.
        Food[] breakfast = new Food[20];
        //Consumable[] yiyecekler = new Consumable[20];
        int itemsSoFar = 0;
        int Coffee = args.length;

        int Potatoes;
        for(Potatoes = 0; Potatoes < Coffee; ++Potatoes) {
            String arg = args[Potatoes];
            String[] parts = arg.split("/");

            switch (parts[0]) { // Yazılı olan arganları teker teker ne olduklarını kontrol eder,
                case "Potato" -> {
                    breakfast[itemsSoFar] = new Potatoes();
                    breakfast[itemsSoFar].setParam(parts[1]);
                    Potatoes patates = new Potatoes();
                    int sayi = patates.hashCode();
                }
                case "Coffee" -> {
                    breakfast[itemsSoFar] = new Coffee();
                    breakfast[itemsSoFar].setParam(parts[1]);
                }
                case "IceCream" -> {
                    breakfast[itemsSoFar] = new IceCream();
                    breakfast[itemsSoFar].setParam(parts[1]);
                }
            }

            ++itemsSoFar;
        }

        int IceCream = 0;
        Coffee = 0;
        Potatoes = 0;
        //int var12 = breakfast.length;

        for (Food item : breakfast) { //for-each döngüsü. Breakfast bir food ise
                                      // bu döngü her bir Food öğesini temsil eden her itemimnde dönecek.
            if (item == null) {
                break;
            }

            item.consume();
            if (item.equals() == "Coffee") {
                ++Coffee;
            }

            if (item.equals() == "Potato") {
                ++Potatoes;
            }

            if (item.equals() == "IceCream") {
                ++IceCream;
            }

        }

        System.out.println("Consumed:");
        System.out.println("Coffee - " + Coffee + "\nPotato - " + Potatoes + "\nIceCream - " + IceCream);
        System.out.println("Bon appetite!");
    }
}
