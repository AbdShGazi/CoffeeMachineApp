///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package coffeemachineapp2;
//
//import coffeemachineapp2.Exceptions.BeansNotEnoughException;
//import coffeemachineapp2.Exceptions.BeansOverCapacityException;
//import coffeemachineapp2.Exceptions.GrinderLevelException;
//import coffeemachineapp2.Exceptions.TrayFullException;
//import coffeemachineapp2.Exceptions.WaterNotEnoughException;
//import coffeemachineapp2.Exceptions.WaterOverflowException;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author abdsh
// */
//public class CoffeeMachineApp2 {
////static CoffeeMachine  coffeemahine=new CoffeeMachine();
//    /**
//     * @param args the command line arguments
//     * 
//     */
//    public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Welcome to the Coffee Machine Simulation!  ");
//
//    while(true) {
//            System.out.println("\nPlease select an option:");
//
//            System.out.println("1. Start");
//
//            System.out.println("2. Add Beans");
//            System.out.println("3. Add Water");
//            System.out.println("4. Select Coffee");
//            System.out.println("5. Clean Machine");
//            System.out.println("6. Exit");
//
//            System.out.print("\nYour choice: ");
//
//            int choice = scanner.nextInt();
//
//            switch(choice) {
//                case 1:
//                    start();
//                    break;
//
//                case 2:
//                    addBeans();
//                    break;
//                case 3:
//                    addWater();
//                    break;
//                case 4:
//                    selectCoffee();
//                    break;
//                case 5:
//                    clean();
//                    break;
//                case 6:
//                    System.out.println("Machine off!" + "\n goodBye ");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice, please select again ");
//            }
//        }
//    }  
//    public static void selectGrindLevel() {
//        System.out.println("\nPlease select a grind level:");
//        System.out.println("1. Coarse");
//        System.out.println("2. Medium");
//        System.out.println("3. Above Meduim");
//        System.out.println("4. fine");
//        System.out.println("5. Very fine");
//        System.out.print("\nYour choice: ");
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        
//        switch(choice) {
//            case 1:
//                coffeemahine.selectGrindLevel(1);
//                System.out.println("Grind level set to  1 (Coarse).");
//                break;
//            case 2:
//                coffeemahine.selectGrindLevel(2);
//                System.out.println("Grind level set to 2 (Medium).");
//                break;
//            case 3:
//                coffeemahine.selectGrindLevel(3);
//                System.out.println("Grind level set to 3 (Above Meduim.");
//                break;
//            case 4:
//                coffeemahine.selectGrindLevel(4);
//                System.out.println("Grind level set to 4 (fine) ");
//            case 5:
//                coffeemahine.selectGrindLevel(5);
//                System.out.println("Grind level set to 5 (Very fine)");
//            default:
//                System.out.println("Invalid choice, please select again ⁉️");
//        }
//    }
//public static void  addBeans(){
//            System.out.println("\nPlease select a choice :");
//               System.out.println("1. Arabica Beans");
//               System.out.println("2. Robusta Beans");
//         Scanner scanner = new Scanner(System.in);
//         
//        int choice = scanner.nextInt();
//        switch(choice) {
//            case 1:
//                addArabicaBeans();
//                break;
//            case 2: 
//                addRobustaBeans();
//                break;
//                default:
//                System.out.println("Invalid choice, please select again ⁉️");
//        }
//
//}
//    
//   public static void addArabicaBeans() {
//    System.out.print("Please enter the amount of Arabica beans to add (in grams): ");
//    Scanner scanner = new Scanner(System.in);
//    int beansToAdd = scanner.nextInt();
//    try {
//        coffeemahine.getBeansContainer().addArabicaBeans(beansToAdd);
//        System.out.println(beansToAdd + " grams of Arabica beans added.");
//    } catch (BeansOverCapacityException e) {
//        System.out.println("Error Message ❗ : " + e.getMessage());
//    }
//}
//    public static void addRobustaBeans() {
//    System.out.print("Please enter the amount of Robusta beans to add (in grams): ");
//    Scanner scanner = new Scanner(System.in);
//    int beansToAdd = scanner.nextInt();
//    try {
//        coffeemahine.getBeansContainer().addRobustaBeanS(beansToAdd);
//        System.out.println(beansToAdd + " grams of Robusta beans added.");
//    } catch (BeansOverCapacityException e) {
//        System.out.println("Error Message ❗ : " + e.getMessage());
//    }
//}
//    
//    public static void addWater() {
//    System.out.print("Please enter the amount of water to add (in ml): ");
//    Scanner scanner = new Scanner(System.in);
//    int waterToAdd = scanner.nextInt();
//    try {
//        coffeemahine.addWater(waterToAdd);
//        System.out.println(waterToAdd + " ml of water added.");
//    } catch (WaterOverflowException e1) {
//        System.out.println("Error Message ❗ : " + e1.getMessage());
//    } catch (InputMismatchException e2) {
//        System.out.println("Error Message ❗ : " + e2.getMessage());
//    }
//}
//    
////    public static void selectCoffee() {
////    System.out.println("\nPlease select a coffee type:");
////    System.out.println("1. Espresso (Single Shot)");
////    System.out.println("2. Espresso (Double Shot)");
////    System.out.println("3. Americano (Single Shot)");
////    System.out.println("4. Americano (Double Shot)");
////    System.out.print("\nYour choice: ");
////Scanner scanner = new Scanner(System.in);
////    int choice = scanner.nextInt();
////try {
////    switch (choice) {
////        case 1:
////             Espresso s1 = new Espresso(1);
////              coffeemahine.selectCoffee(s1, 1);
////         
////            System.out.println("Espresso (Single Shot) selected.");
////            
////            break;
////        case 2: 
////            
////            Espresso s2 = new Espresso(2);
////            
////                 coffeemahine.selectCoffee(s2, 2);
////           
////            System.out.println("Espresso (Double Shot) selected.");
////            break;
////        case 3: 
////            
////            Americano  c2=new Americano(1);   
////            
////            coffeemahine.selectCoffee(c2, 1);
////                 System.out.println("Americano (Single Shot) selected.");
////            break;
////        case 4:
////               Americano c1=new Americano(2);
////            coffeemahine.selectCoffee(c1,2);
////            System.out.println("Americano (Double Shot) selected.");
////               break;
////        default:
////            System.out.println("Invalid choice, please select again ⁉️");
////    }
////    
////    }
////catch (WaterNotEnoughException   | BeansNotEnoughException | GrinderLevelException|TrayFullException e) {
////          System.out.println("Error Message ❗ : " + e.getMessage());
////}
////}
//    public static void selectCoffee() {
//    System.out.println("\nPlease select a coffee type:");
//    System.out.println("1. Espresso (Single Shot)");
//    System.out.println("2. Espresso (Double Shot)");
//    System.out.println("3. Americano (Single Shot)");
//    System.out.println("4. Americano (Double Shot)");
//    System.out.print("\nYour choice: ");
//Scanner scanner = new Scanner(System.in);
//    int choice = scanner.nextInt();
//try {
//    switch (choice) {
//        case 1:
//             Espresso s1 = new Espresso(1);
//             selectGrindLevel();
//              coffeemahine.selectCoffee(s1, 1);
//
//            System.out.println("Espresso (Single Shot) selected.");
//
//            break;
//        case 2: 
//
//            Espresso s2 = new Espresso(2);
//            selectGrindLevel();
//                 coffeemahine.selectCoffee(s2, 2);
//
//            System.out.println("Espresso (Double Shot) selected.");
//            break;
//        case 3: 
//
//            Americano  c2=new Americano(1);
//            selectGrindLevel();
//            coffeemahine.selectCoffee(c2, 1);
//                 System.out.println("Americano (Single Shot) selected.");
//            break;
//        case 4:
//               Americano c1=new Americano(2);
//               selectGrindLevel();
//            coffeemahine.selectCoffee(c1,2);
//            System.out.println("Americano (Double Shot) selected.");
//               break;
//        default:
//            System.out.println("Invalid choice, please select again ");
//    }
//
//    }
//catch (WaterNotEnoughException   | BeansNotEnoughException | GrinderLevelException|TrayFullException e) {
//          System.out.println("Error Message  : " + e.getMessage());
//}
//
//}
//public static void clean(){
//    coffeemahine.clean();
//    System.out.println("cleaned");
//}
//public static void start() {
//    try {
//        coffeemahine.start();
//        System.out.println("Machine started.?");
//        
//        // Check the status of the coffee machine
//        System.out.println("\nCoffee machine status:");
//        System.out.println("BeansLevel: " + coffeemahine.getBeansLevel() + " grams");
//        System.out.println("WaterLevel: " + coffeemahine.getWaterLevel() + " ml");
//        System.out.println("GrindLevel: " + coffeemahine.getGrindLevel());
//        System.out.println("Machine is " + (coffeemahine.getWasteTray().isClean() ? "clean" : "not clean"));
//        
//    } catch ( WaterNotEnoughException | BeansNotEnoughException | GrinderLevelException|TrayFullException e) {
//        System.out.println("Error Message ❗ : " + e.getMessage());
//    }
//}
//
//   
//}
//
//
//
