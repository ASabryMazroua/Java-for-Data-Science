import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner sc = new Scanner(new File("C:\\Users\\Ahmed\\Desktop\\ITI\\Java and UML\\Java and UML _Amr Elshafey\\IO Assignment\\pyramids.csv"));
        sc.useDelimiter(",");

        try{
            while (sc.hasNext())
            {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception ex)
        {
            System.out.println("We have an exception "+ex);
        }
    }
}
