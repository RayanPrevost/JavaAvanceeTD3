package eu.dauphine.rayanPrevost.td3JavaAvancee;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Point, Circle> m = new HashMap<>();

        Point point = new Point(100, 150);
        Circle circle = new Circle(point, 100);

        m.put(point, circle);
        System.out.println(m.containsKey(point));
        System.out.println(m.containsKey(new Point(1, 2)));
    }

}