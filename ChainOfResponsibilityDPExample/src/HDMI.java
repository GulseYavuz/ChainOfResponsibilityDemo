public class HDMI extends AGoruntuKaynagi{
    public void goster(String filePath){
        if(filePath.endsWith(".hdmi")){
            System.out.println("HDMI görüntü veriliyor.");
        }else {
            nextGoruntuKaynagi.endsWith(filePath);
        }

    }
}
