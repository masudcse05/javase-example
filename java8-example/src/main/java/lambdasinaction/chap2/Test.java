package lambdasinaction.chap2;

import lambdasinaction.chap5.Dish;

import java.util.stream.Collectors;

import static lambdasinaction.chap5.Dish.menu;
/**
 * Created by Masud on 5/4/14.
 */
public class Test {
    public static void main(String[] args) {
        String result=menu.stream().map(Dish::getName).collect(Collectors.joining(", ", "[", "}"));
        System.out.println(result);
    }
}
