public class DVI extends AGoruntuKaynagi{
    public void goster(String filePath){
        if(filePath.endsWith(".dvi")) {
            System.out.println("DVI goruntu kayangi aktariliyor.");
        }else{
            nextGoruntuKaynagi.endsWith(filePath);
        }
    }
}
