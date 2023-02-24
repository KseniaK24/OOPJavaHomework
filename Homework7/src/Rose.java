public class Rose extends Flowers{
    public int quantity;
    public Rose(String color, int q){
        super.name = "Роза";
        super.color = color;
        this.quantity = q;
    }
    public String toString(){
        return this.name + " " + this.color + " " + this.quantity;
    }
}
