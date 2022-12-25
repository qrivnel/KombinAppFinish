import java.util.Random;

public class Giyim {
    public String okuRenkGetir(String renk){
        String[] Beyaz = {"Siyah","Kahverengi","Gri","Haki","Lacivert"};
        String[] Siyah = {"Beyaz","Gri","Hardal","Siyah","Krem"};
        String[] Lacivert = {"Bordo","Hardal","Siyah","Beyaz","Gri"};
        String[] Kahverengi = {"Turkuaz","Krem","Haki","Lacivert","Siyah"};
        String[] Gri = {"Siyah","Haki","Lacivert","Kahverengi","Beyaz"};
        String[] Haki = {"Kahverengi","Gri","Beyaz","Siyah","Krem"};
        String[] Bordo = {"Lacivert","Beyaz","Siyah","Krem","Kahverengi"};
        String[] Krem = {"Siyah","Lacivert","Kahverengi","Haki","Bordo"};
        String[] Hardal = {"Siyah","Lacivert","Gri","Haki","Beyaz"};
        Random random = new Random();
        int rastsay = random.nextInt(5);

        if (renk == "Beyaz")
            return Beyaz[rastsay];
        else if (renk == "Siyah")
            return Siyah[rastsay];
        else if (renk == "Lacivert")
            return Lacivert[rastsay];
        else if(renk == "Kahverengi")
            return Kahverengi[rastsay];
        else if(renk == "Gri")
            return Gri[rastsay];
        else if(renk == "Haki")
            return Haki[rastsay];
        else if( renk == "Bordo")
            return Bordo[rastsay];
        else if( renk == "Krem")
            return Krem[rastsay];
        else if(renk == "Hardal")
            return Hardal[rastsay];
        else
            return "Siyah";
    }
    public String aksesuarGetir(){
        String[] aksesuarlar = {"Kolye", "Saat", "Bileklik", "Gözlük"};
        int randomSayi = (int)(Math.random()*4);
        String aksesuar = aksesuarlar[randomSayi];
        return aksesuar;
    }
}
