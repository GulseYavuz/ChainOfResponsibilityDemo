public class Main {
    public static void main(String[] args) {

        AGoruntuKaynagi vga = new VGA();
        AGoruntuKaynagi dvi = new DVI();
      //  vga.nextGoruntuKaynagi = dvi.nextGoruntuKaynagi;
        vga.goster(".vga");



     //   dvi = new DVI();
        dvi.goster(".dvi");



    }
}