public class City {

    String Code;
    String Name;
    String Continent;
    int Population;
    int Area;

    public City(String code, String name, String continent, Integer area, Integer population) {
        Code = code;
        Name = name;
        Continent = continent;
        Area = area;
        Population = population;
    }


    public String getCode () {
        return Code;
    }

    public String getName () {
        return Name;
    }

    public String getContinent () {
        return Continent;
    }

    public Integer getArea () {
        return Area;
    }

    public Integer getPopulation () {
        return Population;
    }

    public void setCode (String c){
        Code = c;
    }

    public void setName (String n){
        Name = n;
    }

    public void setContinent (String c){
        Continent = c;
    }

    public void setArea (Integer a){
        Area = a;
    }

    public void setPopulation (Integer p){
        Population = p;
    }
    }
