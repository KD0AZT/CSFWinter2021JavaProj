package com.sudoku.models;
import java.util.Scanner;

public class User {
    
    String userName;
    int userScore;
    
    private setName() {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Username: ");
        userName = keyboard.next();
        keyboard.close();
        
    }
    
    public String getName() {
        
        return userName;
        
    }
    
    private setScore() {
        
        userScore++;
        
    }
    
    public int getScore() {
    
        return userScore;
    
    }
    
    public movesLeft() {
    
    }
    
}
