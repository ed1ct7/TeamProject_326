package allclasses.paegle;

public class Chocolate
    {
        private String name;
        private String type;
        private int cocoaPercent;
        private double price;
        public Chocolate()
        {
            name = "Шоколад";
            type = "Молочный";
            cocoaPercent = 30;
            price = 99;
        }
        public Chocolate(String name, String type, int cocoaPercent, double price){
            this.name = name;
            this.type = type;
            this.price = price;
            this.cocoaPercent = cocoaPercent;
        }
        public String ToPrint(){
            return name + " тип: " + type + ", процент какао: " + cocoaPercent + "%, цена: " + price + " руб.";
        }
    }

