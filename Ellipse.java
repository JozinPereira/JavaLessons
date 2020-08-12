package Homework7;

public class Ellipse {
    private String definition;
    private int axisA;
    private int axisB;

    // Конструкторы

    public Ellipse() {

    }

    public Ellipse(String definition) {
        this.definition = definition;
    }

    public Ellipse(int axisA, int axisB) {
        this.axisA = axisA;
        this.axisB = axisB;
    }

    public Ellipse(String definition, int axisA, int axisB) {
        this.definition = definition;
        this.axisA = axisA;
        this.axisB = axisB;
    }

    // Сеттеры

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setAxisA(int axisA) {
        this.axisA = axisA;
    }

    public void setAxisB(int axisB) {
        this.axisB = axisB;
    }

    // Геттеры

    public String getDefinition() {
        return this.definition;
    }

    public int getAxisA() {
        return this.axisA;
    }

    public int getAxisB() {
        return this.axisB;
    }

    // Методы

    public double area(int axisA, int axisB) {
        return Math.PI * axisA * axisB / 4; // произведение числа Пи и двух полуосей
    }

    public double perimeter(int axisA, int axisB) {
        return Math.PI * 2 * Math.sqrt((axisA ^ 2 + axisB ^ 2) / 8); // P= 2π√(A^2+B^2)/8
    }
}
