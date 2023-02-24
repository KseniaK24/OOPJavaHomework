import java.util.ArrayList;

public class FlowerShop extends Shop{
    public String address;
    public ArrayList<Flowers> allFlowers = new ArrayList<>();
    public ArrayList<Rose> roses = new ArrayList<>();
    public ArrayList<Chrysanthemum> chrysanthemums = new ArrayList<>();
    public FlowerShop(String name, String address){
        setNameShop(name);
        this.address = address;
    }
    public void addRose(Rose r){
        this.allFlowers.add(r);
        this.roses.add(r);
    }
    public void addChrysanthemum(Chrysanthemum ch){
        this.allFlowers.add(ch);
        this.chrysanthemums.add(ch);
    }

    public void showАllFlowers(){
     for (Flowers f: allFlowers){
         System.out.println(f);
     }
    }

}
