public class Dog extends Animal {
    public String breed;
    public String color;


    public Dog (String name, String breed, String color, int age){
        setAnimalName(name);
        this.breed = breed;
        this.color = color;
        setAnimaAge(age);
        this.type = "Dog";
    }
    public void voice(){
        System.out.println("Гав-гав");
    }



}
