package com.comp2411.project.view;

import java.util.Scanner;

public class KeyBoardListener {

    public static String msg;
    static Scanner scanner = new Scanner(System.in);

    public static void updateMsg(){
        msg = scanner.nextLine();
    }


}

