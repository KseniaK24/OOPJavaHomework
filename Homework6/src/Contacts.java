public abstract class Contacts {
    private String fullName;
    private String tel;

    public String getTel(){
        return this.tel;
    }
    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String name){
        this.fullName = name;
    }
    public void setTel (String tel){
        this.tel = tel;
    }
}
