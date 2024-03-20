package com.comp2411.project.controller;

import com.comp2411.project.view.*;

public class Controller {

    public static void main(String[] args) {
        Interface.showOrigen();
        KeyBoardListener.updateMsg();
        originSwitch(KeyBoardListener.msg);
    }

    private static void originSwitch(String enter){
        switch (enter) {
            case "1":
                searchBooks();
        }
    }

    private static void searchBooks(){
        String[] ar = Interface.showSearch();
        String bookName = ar[0];
        String authorName = ar[1];
        String categoryName = ar[2];
    }
}


