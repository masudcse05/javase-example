package lambdasinaction.chap1;

/**
 * Created by Masud on 5/4/14.
 */
public interface Carriage {
    public default String rock() {
        return "... from side to side";
    }
}
