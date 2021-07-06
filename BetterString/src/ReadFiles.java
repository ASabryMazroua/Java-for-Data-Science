import java.io.File;
import java.nio.file.Files;
import java.util.*;

class MyComparator implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        return o1.getPopulation().compareTo(o2.getPopulation());
    }
}

public class ReadFiles {

    public static List<City> sort(List<City> cityList){
        cityList.sort(new MyComparator());
        return cityList;
    }

    public static void main(String[] args) {
        File Countries = new File("C:\\Users\\Ahmed\\Desktop\\ITI\\Java and UML\\Java and UML _Amr Elshafey\\Assignment 2\\Exercise 2\\src\\countries.csv");
        File Cities = new File("C:\\Users\\Ahmed\\Desktop\\ITI\\Java and UML\\Java and UML _Amr Elshafey\\Assignment 2\\Exercise 2\\src\\cities.csv");

        List<String> CountryLines = new ArrayList<>();
        List<String> CityLines = new ArrayList<>();

        List<Country> CountriesList = new ArrayList<>();
        List<City> CitiesList = new ArrayList<>();

        Map<String,List<City>> map=new HashMap<>();

        try {
            CountryLines = Files.readAllLines(Countries.toPath());
            CityLines = Files.readAllLines(Cities.toPath());
        } catch (Exception e) {
            System.out.println("Encountered a problem in reading CSV files!");
            return;
        }

        for(int i=0; i<CountryLines.size(); i++){
            String line = CountryLines.get(i);
            String[] cells = line.split(",");
            CountriesList.add(new Country(cells[0], cells[1]));

            map.put(cells[0], new ArrayList<>());
        }

        for(int i=0; i<CityLines.size(); i++){
            String line = CityLines.get(i);
            String[] cells = line.split(",");
            City myCity = new City(cells[0], cells[1], cells[2], Integer.parseInt(cells[3]),Integer.parseInt(cells[4]));
            CitiesList.add(myCity);

            List<City> lst = map.get(cells[0]);
            lst.add(myCity);
            map.put(cells[0], lst);

            //Let's try sorting on JPN cities:
            List<City> SortedCities = sort(map.get("JPN"));
            for(int x=0; x<map.get("JPN").size(); x++){
                System.out.println(map.get("JPN").get(x).getPopulation());
            }

        }

    }
}
