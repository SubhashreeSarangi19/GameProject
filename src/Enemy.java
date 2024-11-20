import java.util.Random;

public class Enemy {
    private String name;
    private int health;
    private Player player;

    public Enemy(String name,int health,Player player){
        this.name = name;
        this.health = health;
        this.player = player;
    }
    public String getName(){
        return name;
    }
    public void combat(){
        while (health>0 && player.getHealth()>0){
            System.out.println(name+" Health: "+ health+" | Your Health: "+player.getHealth());
            System.out.print("Choose action (attack/run): ");
            String action = AdventureGame.sc.nextLine().toLowerCase();
            if(action.equals("attack")){
                int damage = new Random().nextInt(20)+10;
                System.out.println("You hit the "+name+" for "+damage+" damage.");
                health-=damage;
                if(health<=0){
                    System.out.println("You defeated the "+name+"!");
                    return;
                }
                int enemyDamage=new Random().nextInt(15)+5;
                System.out.println("The "+name+" hit you for "+enemyDamage+" damage.");
                player.setHealth(player.getHealth()-enemyDamage);
            }
            else if(action.equals("run")){
                System.out.println("You fled back to the Entrance.");
                RoomManager.setCurrentRoom("Entrance");
                return;
            }
            else{
                System.out.println("Invalid action.");
            }
        }
    }
}
