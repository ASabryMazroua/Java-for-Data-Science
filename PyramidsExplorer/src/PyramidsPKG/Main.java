import java.io.File;

package PyramidsPKG;

public class Main {

    public static void main(String[] args) {
	class Pyramid {
        private String Pharaoh;
        private String Ancient_name;
        private String Modern_name;
        private int Dynasty;
        private String Site;
        private Double Base1;
        private Double Base2;
        private Double Height;
        private Double Slope;
        private Double Volume;
        private Double Latitude;
        private Double Longitude;
        private String Type;
        private String Lepsius;
        private String Material;

        public Pyramid (String Pharaoh, String Ancient_name, String Modern_name, String Dynasty, String Site, String Base1, String Base2, String Height, String Slope, String Volume, String Latitude, String Longitude, String Type, String Lepsius, String Material){
            super();
            this.Pharaoh = Pharaoh;
            this.Ancient_name = Ancient_name;
            this.Modern_name = Modern_name;
            try {
                this.Dynasty = Integer.valueOf(Dynasty.replaceAll("s","");
            } catch (Exception e) {
                this.Dynasty = 3;
            }
            this.Site = Site;
            try{
                this.Base1 = Double.valueOf(Base1.replaceAll("s","");
            } catch (Exception e){
                this.Base1 = null;
            }
            try{
                this.Base2 = Double.valueOf(Base2.replaceAll("s","");
            } catch (Exception e){
                this.Base2 = null;
            }
            try{
                this.Height = Double.valueOf(Height.replaceAll("s","");
            } catch (Exception e){
                this.Height = null;
            }
            try{
                this.Slope = Double.valueOf(Slope.replaceAll("s","");
            } catch (Exception e){
                this.Slope = null;
            }
            try{
                this.Volume = Double.valueOf(Volume.replaceAll("s","");
            } catch (Exception e){
                this.Volume = null;
            }
            try {
                this.Latitude = Double.valueOf(Latitude.replaceAll("s","");
            } catch (Exception e){
                this.Latitude = null;
            }
            try{
                this.Longitude = Double.valueOf(Longitude.replaceAll("s","");
            } catch (Exception e){
                this.Longitude = null;
            }
            this.Type = Type;
            this.Lepsius = Lepsius;
            this.Material = Material;
        }

    public String getName() {
            return Ancient_name;
    }

    }

    class PyramidDAO{
    list<Pyramid> Pyramid;

    public PyramidDAO(String rawFileName){
        this.Pyramid = new ArrayList<Pyramid>();
        File PyramidsFile = new File(rawFileName);

        list<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(PyramidsFile.toPath());
        } catch (Exception e) {
            System.out.println("We had an issue while reading the Pyramids file "+e);
        }

    for (int lineIndex=1; lineIndex<lines.size(); lineIndex++){
        String line = lines.get(lineIndex);

        String[] fields = line.split(",");

        for (int fieldIndex = 0; fieldsIndex < fields.length(); fieldIndex++){
            fields[fieldIndex] = fields[fieldIndex].trim();
        }
        Pyramid Pyramid = new Pyramid(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], fields[9], fields[10], fields[11], fields[12], fields[13], fields[14]);
        Pyramid.add(Pyramid);
    }
    System.out.println("Total number of Pyramids is "+Pyramid.size());
    }
    }
    class RawDataDeserlialization{
	    public static void test(){
            PyramidDAO dao = new PyramidDAO("pyramids.csv");

            double avgDynasty
        }
    }
    }

}
