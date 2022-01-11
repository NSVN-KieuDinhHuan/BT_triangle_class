package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean istriangle=false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhập vào độ dài 3 cạnh");
            System.out.println("cạnh 1:");
            double size1 = input.nextDouble();
            System.out.println("cạnh 2:");
            double size2 = input.nextDouble();
            System.out.println("cạnh 3:");
            double size3 = input.nextDouble();
            istriangle=size1+size2>size3&&size1+size3>size2&&size2+size3>size1;
            if (istriangle){
                System.out.println("màu sắc của tam giác:");
                input.nextLine();
                String color = input.nextLine();
                System.out.println("filled(true or false):");
                boolean filled = input.nextBoolean();
                Triangle triangle01 = new Triangle(color, filled, size1, size2, size3);
                System.out.println(triangle01);
            }else {
                System.out.println("Not triangle,please fill again");
            }
        }while(istriangle==false);

    }
}
