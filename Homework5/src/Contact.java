public class Contact {
    private String fullName;
    private String tel;

    public Contact(String name, String tel){
        this.fullName = name;
        this.tel = tel;
    }

    public String getTel(){
        return this.tel;
    }
    public void setFullName(String name){
        this.fullName = name;
    }
    public void setTel (String tel){
        this.tel = tel;
    }
    public String toString(){
        return this.fullName + " " + this.tel;
    }
}
