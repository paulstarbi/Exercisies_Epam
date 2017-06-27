package exercise;

/**
 * Created by paul on 27.06.17.
 */
public class Main {

    public static void main(String[] args) {
        Kidney kidny = new Kidney();
        Heart heart = new Heart();

        FridgeGen<InternalOrgan> genFridge = new FridgeGen<InternalOrgan>();

        genFridge.acceptItem(kidny);
        genFridge.acceptItem(heart);
        System.out.println(genFridge);

        genFridge.returnItem();
        genFridge.acceptItem(heart);
        System.out.println(genFridge);
        }
}
