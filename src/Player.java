import java.util.*;

public class Player {
    private int health = 100;
    private List<String> inventory = new ArrayList<>();

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = Math.max(0,health);
    }
    public void addItem(String item){
        inventory.add(item);
        System.out.println("You collected: "+item);
    }
    public void displayInventory(){
        System.out.println("Inventory: "+(inventory.isEmpty()?"Empty":inventory));
    }
    public void usePotion(){
        if(inventory.contains("Potion")){
            System.out.println("You used a Potion and restored 20 health!");
            health = Math.min(100,health+20);
            inventory.remove("Potion");
        }
        else{
            System.out.println("You don't have any potions!");
        }
    }
}
