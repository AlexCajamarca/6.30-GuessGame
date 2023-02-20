/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

import java.util.Scanner;

/**
 *
 * @author alexc
 */
public class GuessGameTest {
    public static void GuesserNum(){
     int secretNumber = 273;
     
     Scanner input= new Scanner(System.in);
    
      int setGuess;
    System.out.println("Enter a number from 1 to 1000: ");
    setGuess = input.nextInt();
 while ( secretNumber !=setGuess){
        
    if(secretNumber < setGuess){
        System.out.println("too high try again");
          System.out.println("Enter a number from 1 to 1000: ");
    setGuess = input.nextInt();
    } 
    else 
    {
        System.out.println("too low try again"); 
          System.out.println("Enter a number from 1 to 1000: ");
    setGuess = input.nextInt();
    }
    
 }
  System.out.println("Congrat your guess was correct");
 }
    }

