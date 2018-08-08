/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author anhquan17
 */
public class MainThread {
    
    public static void main(String[] args) {
        generateMenu();
    }

    public static void generateMenu() {
        int choice = 0;
        while (true) {
            System.out.println("=================== Menu ==================");
            System.out.println("1. Enter information officer, worker , manager");
            System.out.println("2. Display employee in list");
            System.out.println("3. Search employee by salary max: ");
            System.out.println("4. Exit !");
            System.out.println("Try again !: ");
            System.out.println("===========================================");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println(" Display :");
                    break;
                case 3:
                    menu2();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error , Try again ! ");
                    break;
            }
        }
    }

    public static void menu2() {
        int choiceMenu2 = 0;
        while (true) {
            System.out.println("===========================================");
            System.out.println("1. Search by regency");
            System.out.println("2. Back to main menu");
            System.out.println("Try again ! ");
            System.out.println("===========================================");
            choiceMenu2 = new Scanner(System.in).nextInt();
            switch (choiceMenu2) {
                case 1:
        
                    break;
                case 2:
                    generateMenu();
                    break;
                default:
                    System.err.println("Error ! Try again.");
                    break;
            }
        }
    }
}
