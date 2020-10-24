package com.jjli.day05;


/**
 * @ClassName TestGraph
 * @Description TODO
 * @Author Jason
 * @Date 2020/10/24
 **/
public class TestGraph {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getCircumference());
        System.out.println("****************");
        Rectangle rect = new Rectangle(2, 3);
        System.out.println(rect.getCircumference());
        System.out.println("****************");
        BaseGraph graph = new Circle(2);
        System.out.println(graph.getCircumference());
        graph = new Rectangle(2, 3);
        System.out.println(graph.getCircumference());
    }
}
