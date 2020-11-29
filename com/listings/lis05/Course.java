package com.listings.lis05;

public class Course
{
    private final String courseName;
    private final String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        students[numberOfStudents++] = student;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Course %s has %d students: \n", courseName, numberOfStudents));
        for (int i = 0; i < numberOfStudents; i++)
        {
            builder.append("\t* ");
            builder.append(students[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
