public class Country{
    String Name;
    String Code;

    public Country(String code,String name){
        Name = name;
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public void setName(String n) {
        Name = n;
    }

    public void setCode(String c) {
        Code = c;
    }

}
