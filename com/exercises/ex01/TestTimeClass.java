package com.exercises.ex01;

public class TestTimeClass
{
    public static void main(String[] args)
    {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5, 23, 55);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();

        t1.addHours(-5);
        t2.setTime((55 * 60 + 55) * 1000);
        t3.addMinutes(7 * 60);

        System.out.println("Hora en Colombia: " + t1.toString());
        System.out.println("Media Noche: " + t2.toString());
        System.out.println("Medio Día: " + t3.toString());
    }
}
