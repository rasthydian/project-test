
package game;

import java.util.Scanner;
public class Game {

   
    
    public static void main(String[] args) {
        Player hero = new Player();
        
        Scanner myObj = new Scanner (System.in);
        
        System.out.print(" Masukkan Kecepatan Hero : ");
        int gerak = myObj.nextInt();
        System.out.print(" Masukkan Damage Hero  : ");
        int damage = myObj.nextInt();
        System.out.print(" Masukkan Sisa Nyawa Hero  : ");
        int hp = myObj.nextInt();
        
        System.out.println("================================");

        
        hero.name = "jae";
        hero.speed = 60;
        hero.healthpoin = 0;
        hero.damage = 30;
        hero.armor = 90;
     
        hero.run();
        hero.attack();
        hero.defend();
        
        if(hero.isDead()){
            System.out.println("Game Over!!"); 
        }
        else{
            System.out.println("Winner!");
        }
    }
    
}
