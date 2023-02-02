public class Cat extends Animal {
    public String breed;
    public boolean wool;
    public String color;

    public Cat(String name, String breed, String color, int age, boolean wool){
        setAnimalName(name);
        this.breed = breed;
        this.color = color;
        setAnimaAge(age);
        this.wool = wool;
        this.type = "Cat";
    }

    public void voice(){
        System.out.println("Мяу-мяу");
    }
}
