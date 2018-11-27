/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import java.util.Scanner;
public class Transportation {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int van=7;
        int bus=50;
        int PassengerNum=0;
        System.out.print("how many passenger:");
        PassengerNum=input.nextInt();
        int busesRequired=PassengerNum/bus;
        //num of buses
        System.out.println("num of buses needed="+busesRequired);
        int peopleRemainingAfterBus =PassengerNum-(busesRequired*50);
        //num of passengers remain
        int vansRequired=peopleRemainingAfterBus/van;
        //num of vans
        int vanForExtraPeople=vansRequired+1;
        int peopleRemainingAfterVans=peopleRemainingAfterBus-(vansRequired*7);
        if(peopleRemainingAfterVans>0&&peopleRemainingAfterVans<7){
            System.out.println("num of vans needed="+vanForExtraPeople);
        }
        else{
            System.out.println("num of vans needed="+vansRequired);
        }
       
            
            }
            
        }
        
        
        
        
   


