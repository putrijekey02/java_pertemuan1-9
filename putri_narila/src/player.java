/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACENKCOM
 */
public class player {
    String name;
    int speed;
    int healthpoin;
    
    void run (){
        System.out.println(name +" is running...");
        System.out.println("speed: " + speed);
    }
    boolean isDead(){
        if(healthpoin <= 0) return true;
        return false;
    }
   

    public static void main(String[] args) {
        player player1 = new player();
        player1.name = "budi";
        player1.speed = 78;
        player1.healthpoin = 80;
        
        player1.run();
        if (player1.isDead()){
            System.out.println("game over!");
        }
    }
}