public class Principal {
    public static void main(String [] args) {
        proceso1 hilo1 = new proceso1();
        proceso2 hilo2 = new proceso2();
        sonido audio = new sonido();
        
        
       hilo1.start();
       hilo2.start();
       audio.start();
    }
}