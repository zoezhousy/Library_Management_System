package com.comp2411.project.view;

public class Interface {
    public static void showOrigen(){
        System.out.println("Welcome to LMS System");
        System.out.println("Number\t\tOperations\t\tEnter");
        System.out.println("1\t\t\tSearch Books\t1");
    }

    public static String[] showSearch(){
        String[] ar1 = new String[3];
        System.out.println("We support searching by book names, " +
                "author names, and Categories.");
        System.out.println("Please enter the accurate name (complete or partial) of the book.");
        System.out.println("If you don't know or not sure, please enter nothing");
        KeyBoardListener.updateMsg();
        ar1[0] = KeyBoardListener.msg;
        System.out.println("Please enter the accurate name (complete or partial) of one or more authors," +
                " separated by commas.");
        System.out.println("If you don't know or not sure, please enter nothing");
        KeyBoardListener.updateMsg();
        ar1[1] = KeyBoardListener.msg;
        System.out.println("Please enter the accurate and complete name of one or more Categories," +
                " separated by commas.");
        System.out.println("If you don't know or not sure, please enter nothing");
        KeyBoardListener.updateMsg();
        ar1[2] = KeyBoardListener.msg;
        return ar1;
    }
}
