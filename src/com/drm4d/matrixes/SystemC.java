package com.drm4d.matrixes;

import java.util.Scanner;

public class SystemC
{
    byte distMethV, step;
    String timeValue;
    String[] listLineMeth = {"line", "line by line", "lbl", "l"};
    String[] listColumnMeth = {"column", "col", "c"};

    void intro()
    {
        step = 0;
        System.out.println("Welcome to 'Matrixes!'.");
        System.out.println("To download the latest version, please visit http://github.com/DrM4D/J2_mat");
        System.out.println("To start the programm, enter '/start'. For help enter the '/help'.");
    }

    void err(byte err)
    {
        switch (err)
        {
            case 0: System.out.println("Error #100: Uncorrect answer at the step."); break;
            case 1: System.out.println("Error #200: Uncorrect symbols in the line."); break;
            case 2: System.out.println("Error #301: Non-positive number at the answer."); break;
        }
    }
    void inputDistributionMethod()
    {
        step = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Matrix elements are entered in one line via a space.");
        System.out.println("Do you want to enter line by line or column?");
        System.out.println("By default, the line method is selected.");
        System.out.print("Enter 'line' or 'column': ");
    }

    void inputMatrix()
    {
        step = 2;
        Scanner in = new Scanner(System.in);

        System.out.println("Start input the matrix. Enter ");
    }

    void input(byte step)
    {
        Scanner in = new Scanner(System.in);

        timeValue = in.nextLine();

        switch (step)
        {
            case 0:

                break;
            case 1:
                String distMeth = in.nextLine();

                if (distMeth.equalsIgnoreCase(listLineMeth[1]) || distMeth.equalsIgnoreCase("")) distMethV = 1;
                else if (distMeth.equalsIgnoreCase(listColumnMeth[1])) distMethV = 2;
                else
                {
                    System.out.print("");
                }
                break;

        }
    }
}