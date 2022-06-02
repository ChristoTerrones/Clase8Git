package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gato gato= new Gato();
        Perro perro= new Perro();
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.menuReportes();
    }
}
