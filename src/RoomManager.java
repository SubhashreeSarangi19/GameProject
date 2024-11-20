import java.util.*;

public class RoomManager {
    private Map<String,Room> rooms = new HashMap<>();
    private static String currentRoom = "Entrance";
    private Player player;

    public RoomManager(Player player){
        this.player =player;
        initializeRooms();
    }

    public Room getCurrentRoom(){
        return rooms.get(currentRoom);
    }
    public static void setCurrentRoom(String roomName){
        currentRoom =roomName;
    }
    private void initializeRooms(){
        rooms.put("Entrance",new Room("Entrance","You are at the Entrance. Exits: north (Forest), east (Dungeon).",null,null,null,false));
        rooms.put("Forest",new Room("Forest","You are in a dense Forest. Exits: south (Entrance).",null,null,"Potion",false));
        rooms.put("Dungeon",new Room("Dungeon","You are in a dark Dungeon. Exits: west (Entrance), north (Treasure Room).",null,new Enemy("Goblin",50, player),null,false));
        rooms.put("Treasure Room",new Room("Treasure Room","You found the treasure! Exits: south (Dungeon).",null,null,"Treasure",true));
    }

    public void move(String direction){
        switch(currentRoom){
            case "Entrance":
                if(direction.equals("go north")) currentRoom="Forest";
                else if(direction.equals("go east")) currentRoom="Dungeon";
                else System.out.println("You can't go that way.");
                break;
            case "Forest":
                if(direction.equals("go south")) currentRoom ="Entrance";
                else System.out.println("You can't go that way.");
                break;
            case "Dungeon":
                if(direction.equals("go west")) currentRoom ="Entrance";
                else if(direction.equals("go north")) currentRoom ="Treasure Room";
                else System.out.println("You can't go that way.");
                break;
            case "Treasure Room":
                if(direction.equals("go south")) currentRoom ="Dungeon";
                else System.out.println("You can't go that way.");
                break;
        }
    }

}
