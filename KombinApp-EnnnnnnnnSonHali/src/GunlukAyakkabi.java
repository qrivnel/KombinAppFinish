public class GunlukAyakkabi extends Ayakkabi {
    @Override
    public String altlikGetir(String renk){
        String alt = okuRenkGetir(renk)+ " Pantolon";
        return alt;
    }
}
