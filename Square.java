package Homework7;

public class Square {
    private String definition;
    private int side;

    // Конструкторы

    public Square(){

    }

    public Square(String definition) {
        this.definition = definition;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String definition, int side) {
        this.definition = definition;
        this.side = side;
    }

    // Сеттеры

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Геттеры

    public String getDefinition() {
        return this.definition;
    }

    public int getSide() {
        return this.side;
    }

    // Методы

    public int area(int side) {
        return side * side; // основание * высоту = сторона^2
    }

    public int perimeter(int side) {
        return side * 4; // сумма четырех сторон = сторона * 4
    }

}
