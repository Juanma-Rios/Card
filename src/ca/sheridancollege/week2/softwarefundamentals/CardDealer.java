/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Student Number: 991641559
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 *
 * @author dancye, 2019
 */
public class CardDealer
{
   public static void main (String[] args)
   {
      Card nineClubs = new Card("Clbs", 9);
      nineClubs.setSuit("diamonds");

      Card juanRiosCard = new Card("Spds", 1);
      juanRiosCard.setSuit("spades");
      
      System.out.println("This card's suit is " + juanRiosCard.getSuit() + " and the value is " + juanRiosCard.getValue());
   }
}
