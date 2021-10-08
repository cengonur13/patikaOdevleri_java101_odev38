public class Odev38 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        Figther onur = new Figther("Onur",15,100,90,10);
        Figther taylan = new Figther("Taylan",10,120,100,10);
        Ring ring = new Ring(onur,taylan,90,110);
        ring.run();
    }
}
