package Homework7;

public class Main {
    public static void main(String[] args) {

        // Треугольник

        Triangle triangle1 = new Triangle(3, 4, 5, true);
        triangle1.setHeight(3);
        System.out.println("Периметр треугльника равен " +
                triangle1.perimeter(triangle1.getSideA(),triangle1.getSideB(),triangle1.getSideC()) +
                " ед.");
        System.out.println("Площадь треугольника равна " +
                triangle1.area(triangle1.getSideB(),triangle1.getHeight()) +
                " кв.ед.\n");

        // Квадрат

        Square square1 = new Square(4);
        square1.setDefinition("четырехугольник, у которого все стороны равны, а все углы прямые.");
        System.out.println("Квадрат - это " + square1.getDefinition());
        System.out.println("Периметр квадрата равен " +
                square1.perimeter(square1.getSide()) +
                " ед.");
        System.out.println("Площадь квадрата равна " +
                square1.area(square1.getSide()) +
                " кв. ед.\n");

        // Прямоугольник

        Rectangle rectangle1 = new Rectangle("четырехугольник, у которого все углы прямые.");
        rectangle1.setSideA(3);
        rectangle1.setSideB(6);
        System.out.println("Прямоугольник - это " + rectangle1.getDefinition());
        System.out.println("Периметр прямоугольника равен " +
                rectangle1.perimeter(rectangle1.getSideA(), rectangle1.getSideB()) +
                " ед.");
        System.out.println("Площадь прямоугольника равна " +
                rectangle1.area(rectangle1.getSideA(), rectangle1.getSideB()) +
                " кв. ед.\n");

        // Овал

        Ellipse ellipse1 = new Ellipse(2, 6);
        System.out.println("Периметр элипса равен " +
                ellipse1.perimeter(ellipse1.getAxisA(), ellipse1.getAxisB()) +
                " ед.");
        System.out.println("Площадь элипса равна " +
                ellipse1.area(ellipse1.getAxisA(), ellipse1.getAxisB()) +
                " кв. ед.");



    }
}