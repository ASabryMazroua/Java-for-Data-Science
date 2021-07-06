import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *  
 * @author georg
 */
public class PyramidDef {
    private String Pharaoh;
    private String Ancient_name;
    private String Modern_name;
    private int Dynasty;
    private String Site;
    private double Base1;
    private double Base2;
    private double Height;
    private double Slope;
    private double Volume;
    private double Latitude;
    private double Longitude;
    private String Type;
    private String Lepsius;
    private String Material;
    
    
    public PyramidDef (String Pharaoh, String Ancient_name, String Modern_name, String Dynasty, String Site, String Base1, String Base2, String Height, String Slope, String Volume, String Latitude, String Longitude, String Type, String Lepsius, String Material){
        super();
        this.Pharaoh=Pharaoh;
        this.Ancient_name = Ancient_name;
        this.Modern_name = Modern_name;
        try{
            this.Dynasty=Integer.valueOf(Dynasty.replaceAll("s",""));
        }catch(Exception e){
            this.Dynasty=-1;
        }
        this.Site= Site;
        try{
            this.Base1=Double.valueOf(Base1.replaceAll("s",""));
        }catch(Exception e){
            this.Base1=-1;
        }
        try{
            this.Base2=Double.valueOf(Base2.replaceAll("s",""));
        }catch(Exception e){
            this.Base2=-1;
        }
        try{
            this.Height=Double.valueOf(Height.replaceAll("s",""));
        }catch(Exception e){
            this.Height= -1;
        }
        try{
            this.Slope = Double.valueOf(Slope.replaceAll("s",""));
        } catch (Exception e){
            this.Slope = -1;
        }
        try{
            this.Volume = Double.valueOf(Volume.replaceAll("s",""));
        } catch (Exception e){
            this.Volume = -1;
        }
        try {
            this.Latitude = Double.valueOf(Latitude.replaceAll("s",""));
        } catch (Exception e){
            this.Latitude = -1;
        }
        try{
            this.Longitude = Double.valueOf(Longitude.replaceAll("s",""));
        } catch (Exception e){
            this.Longitude = -1;
        }
            this.Type = Type;
            this.Lepsius = Lepsius;
            this.Material = Material;
    }
    /**
     * @param args the command line arguments
     */
    public String getName() {
        // TODO code application logic here
        return Pharaoh;
    }
}
