package lambdasinaction.chap1;

/**
 * Created by Masud on 5/4/14.
 */
public class ParentTest implements Jukebox, Carriage{
    public static void main(String[] args) {
        Jukebox parent = new ParentTest();
        System.out.println(parent.rock());
    }

    @Override
    public String rock() {
        return Carriage.super.rock();
    }
}
