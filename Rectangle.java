package Homework7;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private String definition;
    private int sideA;
    private int sideB;

    // Конструкторы

    public Rectangle() {

    }

    public Rectangle(String definition) {
        this.definition = definition;
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String definition, int sideA, int sideB) {
        this.definition = definition;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Сеттеры

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    // Геттеры

    public String getDefinition() {
        return this.definition;
    }

    public int getSideA() {
        return this.sideA;
    }

    public int getSideB() {
        return this.sideB;
    }

    // Методы

    public int area(int sideA, int sideB) {
        return sideA * sideB; // основание * высоту
    }

    public int perimeter(int sideA, int sideB) {
        return sideA * 2 + sideB * 2; // сумма 4 сторон, стороны A и B попарно параллельны
    }
}
