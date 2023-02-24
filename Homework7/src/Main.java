public class Main {
    public static void main(String[] args) {
       FlowerShop fs = new FlowerShop("Цветочный мир", "Москва");
       fs.addRose(new Rose("белая", 15));
       fs.addRose(new Rose("розовая", 21));
       fs.addRose(new Rose("желтая", 9));
       fs.addChrysanthemum(new Chrysanthemum("желтая",9));
       fs.addChrysanthemum(new Chrysanthemum("белая",21));
       fs.showАllFlowers();
    }
}