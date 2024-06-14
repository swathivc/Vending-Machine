package vendingmachine;
import coin.Coin;
import item.Item;

import java.util.ArrayList;
import java.util.*;

public class Vendingmachinestate  {
    public Vendingmachinestate() {
        System.out.println("Currently machine is in Idle state");
    }
    public void clickonstartproductselectionbutton() {
        System.out.println("Vending machine is in HasMoneystate");
    }
    public void insertcoin(Vendingmachine vendingmachine ,Coin coin) { 
        System.out.println("Vending machine is in Hasmoneystate");
        System.out.println("Accepted the coin");
        vendingmachine.getCoinlList().add(coin);
    }
    public void chooseproduct(Vendingmachine vendingmachine , int itemcodenumber)  {
         //1.get item for itemcodenumber
         //2.Total amount paid by user
         //3.Compare the product and amount paid by the user
         //4.dispense the product
         Item item = vendingmachine.getInventory().getItem(itemcodenumber);
         int paidbyuser = 0;
         for(Coin coin : vendingmachine.getCoinlList()) {
            paidbyuser += coin.getValue();
         }
         if(item.getprice() > paidbyuser) {
            refundfullmoney(vendingmachine);
            return;
         }
         else{
            getchange(item.getprice(),paidbyuser);
           dispenseproduct(vendingmachine, itemcodenumber);
            return;
         }




        

    }
    public List<Coin> refundfullmoney(Vendingmachine vendingmachine) {
        System.out.println("returned the full amount.");
        vendingmachine.setVendingMachineState(new Vendingmachinestate());
        return vendingmachine.getCoinlList() ;
    
    }

    public void updateInventory(Vendingmachine vendingmachine , Item item ,int itemcodenumber) {
          vendingmachine.getInventory().addItem(item, itemcodenumber);
    }
    public void dispenseproduct(Vendingmachine vendingmachine, int  itemcodenumber) {
      System.out.println("Currently vending machine is in dispense state");
      System.out.println("Product has been dispense");
      vendingmachine.getInventory().updatesoldoutitem(itemcodenumber);
      vendingmachine.setVendingMachineState(new Vendingmachinestate());
    }
    public void getchange(int itemPrice , int paidbyuser) {
        System.out.println("Returned the change in the coin dispense tray:" + (paidbyuser - itemPrice)); 
         
    }

}
