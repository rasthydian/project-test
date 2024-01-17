
package game;


public class Player {
    String name;
    int speed, healthpoin, damage, armor;
    
    void run(){
        System.out.println(name+" is running ");
        System.out.println("Speed: "+ speed);
    }
    void attack(){
        damage=100;
        healthpoin-=damage;
        System.out.println("is armor ");
        System.out.println(name+"Damage: "+ healthpoin);
    }
    void defend(){
        damage=100;
        armor-=damage;
        System.out.println("is attacking ");
        System.out.println(name+"Damage: "+ armor);
    }
    
    
    boolean isDead(){
       if (healthpoin<=0) return true;
            return false;
    }
      

    
}
