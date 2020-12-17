package burger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Burger chicken = new Burger("Chicken Burger", "kanaliha", "burgerikukkel", 4.20);
        Burger old = new Burger("Old Fashioned Cheesburger", "veiseliha", "burgerikukkel", 3.70);
        Burger newYork = new Burger("New York Burger", "sealiha", 5.50);

        ArrayList<Lisandid> chickenLisand = new ArrayList<>();
        chickenLisand.add(new ChickenLisandid("juust", "salat", "tomat", "majonees"));
        ArrayList<Lisandid> oldLisand = new ArrayList<>();
        oldLisand.add(new OldLisandid("peekon", "hapukurk", "sibul", "kaste"));
        ArrayList<Lisandid> newYorkLisand = new ArrayList<>();
        newYorkLisand.add(new NewYorkLisandid("sinihallitusjuust", "tomat", "hapukurk", "sibul"));

        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        double kokku = 0;

        while(true) {
            System.out.println("Vali burger: 1 - Chicken Burger, 2 - Old Fashioned Cheeseburger, 3 - New York Burger");
            int valik = scanner.nextInt();
            if(valik == 1) {
                for(Lisandid lisand : chickenLisand) {
                    System.out.println(lisand);
                }
                chicken.lisaLisandid();
                kokku += chicken.koostaBurger();
                System.out.println("Burgeri hind: " + chicken.koostaBurger());
                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }

            }
            else if(valik == 2) {
                for(Lisandid lisand : oldLisand) {
                    System.out.println(lisand);
                }
                old.lisaLisandid();
                kokku += old.koostaBurger();
                System.out.println("Burgeri hind: " + old.koostaBurger());
                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else if(valik == 3) {
                for(Lisandid lisand : newYorkLisand) {
                    System.out.println(lisand);
                }
                newYork.lisaLisandid();
                kokku += newYork.koostaBurger();
                System.out.println("Burgeri hind: " + newYork.koostaBurger());
                System.out.println("Kas soovid veel burgereid?  (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else break;
        }
        System.out.println("Hind kokku on " + kokku + " €.");

    }
}

