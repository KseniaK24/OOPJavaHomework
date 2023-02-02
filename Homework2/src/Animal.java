public abstract class Animal {
    public String type;
    private String animalName;
    private int animalAge;

    public void setAnimalName (String name){
        this.animalName = name;
    }
    public void setAnimaAge (int age){
        this.animalAge = age;
    }

    public String getAnimalName(){
        return animalName;
    }
    public int getAnimalAge(){
        return animalAge;
    }
    public void voice(){}
}
