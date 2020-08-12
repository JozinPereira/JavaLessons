package Homework7;

public class Triangle {
    private String definition;
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;
    private boolean isRectangular;

    // Конструкторы

    public Triangle(){

    }

    public Triangle(String definition, int height) {
        this.definition = definition;
        this.height = height;
    }

    public Triangle(String definition, boolean isRectangular) {
        this.definition = definition;
        this.isRectangular = isRectangular;
    }

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public Triangle(int sideA, int sideB, int sideC, boolean isRectangular) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.isRectangular = isRectangular;
    }

    public Triangle(String definition, int sideA, int sideB, int sideC, int height, boolean isRectangular) {
        this.definition = definition;
        this. sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.isRectangular = isRectangular;
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

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIsRectangular(boolean isRectangular) {
        this.isRectangular = isRectangular;
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

    public int getSideC() {
        return this.sideC;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getIsRectangular() {
        return this.isRectangular;
    }

    // Методы

    public int area(int sideB, int height) {
        return sideB * height / 2; // 1/2 основания * высоту
    }

    public int perimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC; // сумма всех сторон
    }
}
