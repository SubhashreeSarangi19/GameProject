import java.util.*;

public class AdventureGame {
    static Scanner sc = new Scanner(System.in);
    static Player player = new Player();
    static RoomManager roomManager = new RoomManager(player);

    public static void main(String[] args) {
        System.out.println("Welcome to the Adventure Game!");
        while(player.getHealth()>0){
            Room currentRoom = roomManager.getCurrentRoom();
            System.out.println("\n"+currentRoom.getDescription());
            handleInput(currentRoom);
        }
        if(player.getHealth()<=0){
            System.out.println("Game Over! You have died.");
        }
    }
    static void handleInput(Room currentRoom) {
        System.out.print("Enter command: ");
        String command = sc.nextLine().toLowerCase();

        switch(command){
            case "go north":
            case "go south":
            case "go east":
            case "go west":
                roomManager.move(command);
                break;
            case "check inventory":
                player.displayInventory();
                break;
            case "use potion":
                player.usePotion();
                break;
            case "talk":
                currentRoom.interact();
                break;
            case "attack":
                currentRoom.fight();
                break;
            case "run":
                currentRoom.run();
                break;
            case "take treasure":
                if(currentRoom.hasTreasure()){
                    player.addItem("Treasure");
                    System.out.println("Congratulations! You found the treasure. You win!");
                    System.exit(0);
                }
                else{
                    System.out.println("There's no treasure here!");
                }
                break;
            default:
                System.out.println("Unknown command.");
        }
    }
}
