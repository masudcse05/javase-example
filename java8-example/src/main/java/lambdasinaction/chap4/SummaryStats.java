package lambdasinaction.chap4;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import static lambdasinaction.chap4.Dish.menu;

/**
 * Created by Masud on 5/4/14.
 */
public class SummaryStats {
    public static void main(String[] args) {
        DoubleSummaryStatistics statistics= menu.stream().mapToDouble(Dish::getCalories).summaryStatistics();
        System.out.println("Minimum "+statistics.getMin());
        System.out.println("Maximum "+statistics.getMax());
        System.out.println("Average "+statistics.getAverage());
        System.out.println("Count "+statistics.getCount());
        System.out.println("Sum "+statistics.getSum());
    }
}
