package test;

import domain.Exercise;
/** Содержит реализацию метода*/
public class TestResult {
    /** Вывод на экран подсчёта Числа Судьбы*/
    public static void main(String[] args) {
        byte d = 24;
        byte m = 5;
        short y = 1990;
        if(Exercise.Calculate(d, m, y) != -1)
            System.out.println("Date: "+d+'.'+m+'.'+y+" Your Fate Day: "+Exercise.Calculate(d, m, y));
        else
            System.out.println("Wrong date input");
    }
}
