package pizza;

import java.util.Scanner;

public class pizza {
    private int pizza;
    private int price;
    Scanner scan = new Scanner(System.in);

    public pizza() {
        whatPizza();
    }

    public void whatPizza() {
        System.out.println("Which type: \n1- Base Pizza\n2- Delux Pizza");
        this.pizza = scan.nextInt();
        compilation();
    }

    private void compilation() {
        if (this.pizza == 1) {
            System.out.println("Enter your preferance: \n1- VEG\n2- NON-VEG");
            int choise = scan.nextInt();
            if (choise == 1) {
                this.price = 30000;
            } else if (choise == 2) {
                this.price = 40000;
            }
            System.out.println("Add some extra topping?");
            System.out.println("Toppings available: \n1- Cheese\n2- Combo extra\n3- Both topping\n4- none");
            int top = scan.nextInt();
            if (top == 1) {
                addTopping("cheese");
                System.out.println("Your pizza costs: ugx" + this.price);
            } else if (top == 2) {
                addTopping("extra");
                System.out.println("Your pizza costs: ugx" + this.price);
            } else if (top == 3) {
                addTopping("cheese");
                addTopping("extra");
                System.out.println("Your pizza costs: ugx" + this.price);
            } else if (top == 4) {
                System.out.println("Your pizza costs: ugx" + this.price);
            }
            scan.nextLine();
            System.out.println("For Take away?\ny- YES \nn- NO");
            String yn = scan.nextLine();
            switch (yn) {
                case "y":
                    takeAway();
                    System.out.println("Your final pricing is: ugx" + price);
                    break;
                case "n":
                    System.out.println("Your final pricing is: ugx" + price);
                    break;
                default:
                    break;
            }
        } else if (this.pizza == 2) {
            System.out.println("Enter your preferance: \n1- VEG\n2- NON-VEG");
            int choise = scan.nextInt();
            if (choise == 1) {
                this.price = 40000;
            } else if (choise == 2) {
                this.price = 50000;
            }
            addTopping("cheese");
            addTopping("extra");
            scan.nextLine();
            System.out.println("For Take away?\ny- YES \nn- NO");
            String yn = scan.nextLine();
            switch (yn) {
                case "y":
                    takeAway();
                    System.out.println("Your final pricing is: ugx" + price);
                    break;
                case "n":
                    System.out.println("Your final pricing is: ugx" + price);
                    break;
                default:
                    break;
            }
        }
    }

    public void addTopping(String word) {
        String top1 = "cheese";
        String top2 = "extra";
        if (word == top1) {
            price += 10000;
        }
        if (word == top2) {
            price += 10000;
        }
    }

    public void takeAway() {
        price += 2000;
    }
}
