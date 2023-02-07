public class Main {
    public static void main(String[] args) {
        Kopm kopm = new Kopm( "15.6 IPS 1920x1080","lenovo","bleak","lokalnyi", 1050,"Intel UHD Graphics","USB 3.0","черное");
        Display display = new Display(16.9, "Lenovo Group Limited", 350);
        HDD hdd = new HDD("1tr", 2);
        MemoryOperator memoryOperator = new MemoryOperator(1050, "Lenovo Group Limited");
        USB usb = new USB(3.0, 509195);
        Keyboard keyboard = new Keyboard("белая", "есть");
        System.out.println("display:"+kopm.getDisplay()+"\nmarka:"+kopm.getMarka()+"\nsvet:"+kopm.getSvet()+"\njostkiydisk:"+kopm.getJostkiydisk()+"\noperativka:"+kopm.getOperativka());
        System.out.println("videokarta:"+kopm.getVideokarta()+"\nUSD:"+kopm.getUSD()+"\nklava:"+kopm.getKlava());
        System.out.println("-----------------------------------");
        System.out.println("dioganal:"+display.getDiogonal()+"\nproizvoditel:"+display.getProizvoditel()+"\nmatrisa:"+display.getMatrisa());
        System.out.println("-----------------------------------");
        System.out.println("memory:"+hdd.getMemory()+"\ndisc:"+hdd.getDisc());
        System.out.println("-----------------------------------");
        System.out.println("volume:"+memoryOperator.getVolume()+"\nmanufacture:"+memoryOperator.getManufacture());
        System.out.println("-----------------------------------");
        System.out.println("port:"+usb.getPort()+"\nid:"+usb.getId());
        System.out.println("-----------------------------------");
        System.out.println("podveska:"+keyboard.getPodveska()+"\nдополнительная цифра:"+keyboard.getSifra());





    }
}
class Kopm{
     private String display;
     private String marka;
     private String svet;
     private String Jostkiydisk;
     private int operativka;
     private String videokarta;
     private String USD;
     private String klava;

     public Kopm(){
         
     }





    public void setDisplay(String display) {
        this.display = display;
    }
    public String getDisplay(){
         return  this.display;
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getSvet() {
        return this.svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    public String getJostkiydisk() {
        return this.Jostkiydisk;
    }

    public void setJostkiydisk(String jostkiydisk) {
        Jostkiydisk = jostkiydisk;
    }

    public int getOperativka() {
        return this.operativka;
    }

    public void setOperativka(int operativka) {
        this.operativka = operativka;
    }

    public String getVideokarta() {
        return this.videokarta;
    }

    public void setVideokarta(String videokarta) {
        this.videokarta = videokarta;
    }

    public String getUSD() {
        return this.USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    public String getKlava() {
        return this.klava;
    }

    public void setKlava(String klava) {
        this.klava = klava;
    }

    public Kopm(String display, String marka, String svet, String jostkiydisk, int operativka, String videokarta, String USD, String klava) {
        this.display = display;
        this.marka = marka;
        this.svet = svet;
        this.Jostkiydisk = jostkiydisk;
        this.operativka = operativka;
        this.videokarta = videokarta;
        this.USD = USD;
        this.klava = klava;


    }
}




class Display {


    private double diogonal;
    private String proizvoditel;
    private int matrisa;

    public double getDiogonal() {
        return diogonal;
    }

    public void setDiogonal(double diogonal) {
        this.diogonal = diogonal;
    }

    public String getProizvoditel() {
        return this.proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public int getMatrisa() {
        return this.matrisa;
    }

    public void setMatrisa(int matrisa) {
        this.matrisa = matrisa;
    }

    public Display(double diogonal, String proizvoditel, int matrisa) {
        this.diogonal = diogonal;
        this.proizvoditel = proizvoditel;
        this.matrisa = matrisa;



    }
}

class HDD {

    private String memory;
    private int disc;

    public String getMemory() {
        return this.memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getDisc() {
        return this.disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public HDD(String memory, int disc) {
        this.memory = memory;
        this.disc = disc;


    }
}

class MemoryOperator {


    private int volume;
    private String manufacture;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getManufacture() {
        return this.manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public MemoryOperator(int volume, String manufacture) {
        this.volume = volume;
        this.manufacture = manufacture;

    }
}

class USB {
    private double port;
    private long id;

    public double getPort() {
        return port;
    }

    public void setPort(double port) {
        this.port = port;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public USB(double port, long id) {
        this.port = port;
        this.id = id;


    }
}

class Keyboard {

    private String podveska;
    private String sifra;

    public String getPodveska() {
        return this.podveska;
    }

    public void setPodveska(String podveska) {
        this.podveska = podveska;
    }

    public String getSifra() {
        return this.sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public Keyboard(String podveska, String sifra) {
        this.podveska = podveska;
        this.sifra = sifra;


    }

}





