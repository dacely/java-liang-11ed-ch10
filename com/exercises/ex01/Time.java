package com.exercises.ex01;

public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time()
    {
        this(System.currentTimeMillis());
    }

    public Time(long milliseconds)
    {
        setTime(milliseconds);
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long milliseconds)
    {
        int totalSecondsToday = (int) ((milliseconds / 1000) % 86400);
        hour = totalSecondsToday / 3600;
        minute = (totalSecondsToday % 3600) / 60;
        second = (totalSecondsToday % 3600) % 60;
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    private int getTotalSeconds()
    {
        return hour * 3600 + minute * 60 + second;
    }

    public void addHours(int hours)
    {
        setTime((getTotalSeconds() + (hours * 3600)) * 1000);
    }

    public void addMinutes(int minutes)
    {
        setTime((getTotalSeconds() + minutes * 60) * 1000);
    }

    public void addSeconds(int seconds)
    {
        setTime((getTotalSeconds() + seconds) * 1000);
    }

    public String getTimeString_12HourFormat()
    {
        String strHour;
        String strMinute = minute + "";
        String strSecond = second + "";
        String amPm;

        if (hour == 0)
        {
            strHour = "12";
            amPm = "midnight";
        }
        else if (hour < 12)
        {
            strHour = String.format("%02d", hour);
            amPm = "am";
        }
        else if (hour == 12)
        {
            strHour = "12";
            amPm = "noon";
        }
        else
        {
            strHour = String.format("%02d", hour - 12);
            amPm = "pm";
        }

        return strHour + ":" + strMinute + ":" + strSecond + " " + amPm;
    }

    public String getTimeString_24HourFormat()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public String toString()
    {
        return getTimeString_12HourFormat();
    }
}
