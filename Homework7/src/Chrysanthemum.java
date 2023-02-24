public class Chrysanthemum extends Flowers{
    public int quantity;
    public Chrysanthemum(String color,int q){
        super.name = "Хризантема";
        super.color = color;
        this.quantity = q;
    }
    public String toString(){
        return this.name + " " + this.color + " " + this.quantity;
    }
}
