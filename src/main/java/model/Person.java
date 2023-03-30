package model;


import model.enums.Color;

import java.util.Objects;

public class Person {
    private final String name; //Поле не может быть null, Строка не может быть пустой
    private final String birthday; //Поле не может быть null
    private double height; //Значение поля должно быть больше 0
    private final Color eyeColor; //Поле не может быть null

    public Person(String name, Color eyeColor, double height, String birthday) {
        this.birthday = Objects.requireNonNull(birthday);
        this.name = Objects.requireNonNull(name);
        this.height = checkHeight(height);
        this.eyeColor = Objects.requireNonNull(eyeColor);
    }

    private double checkHeight(double height){
        if (height < 0) {height = Math.abs(height)+1;}
        return height;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
