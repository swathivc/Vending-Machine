package vendingmachine;
import java.util.*;
import coin.Coin;
import inventory.Inventory;
public class Vendingmachine {
    private Vendingmachinestate vendingmachinestate ;
    private Inventory inventory;
    private List<Coin> coinList;

    public Vendingmachine() {
         vendingmachinestate = new Vendingmachinestate();
        inventory = new Inventory(10);
        coinList = new ArrayList<>(); 

    }
    public Vendingmachinestate getVendingmachinestate() {
        return this.vendingmachinestate;
    }
    public void setVendingMachineState(Vendingmachinestate Vendingmachine) {
        this.vendingmachinestate = vendingmachinestate;
    }
    public Inventory getInventory() {
        return this.inventory;
    }
    public void setInventory() {
        this.inventory = inventory;
    }
    public List<Coin> getCoinlList() {
        return this.coinList;
    }
    public void setcoinlist(List<Coin> coinlList) {
        this.coinList = coinlList;
    }



}
