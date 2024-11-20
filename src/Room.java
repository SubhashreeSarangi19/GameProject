public class Room {
    private String name;
    private String description;
    private String npc;
    private Enemy enemy;
    private String item;
    private boolean hasTreasure;

    public Room(String name,String description,String npc,Enemy enemy,String item,boolean hasTreasure){
        this.name = name;
        this.description = description;
        this.npc = npc;
        this.enemy = enemy;
        this.item = item;
        this.hasTreasure = hasTreasure;
    }
    public String getDescription(){
        StringBuilder desc = new StringBuilder(description);
        if(npc!= null) desc.append("\nNPC: ").append(npc);
        if(enemy!= null) desc.append("\nEnemy: ").append(enemy.getName());
        if(item!= null) desc.append("\nItem available: ").append(item);
        return desc.toString();
    }
    public void interact(){
        if(npc!=null){
            System.out.println(npc+": \"Good luck on your journey!\"");
        }
        else{
            System.out.println("There's no one to talk to here.");
        }
    }
    public void fight(){
        if(enemy != null){
            enemy.combat();
        }
        else{
            System.out.println("There's nothing to fight here.");
        }
    }
    public void run(){
        System.out.println("You fled back to the Entrance.");
        RoomManager.setCurrentRoom("Entrance");
    }
    public String getItem(){
        return item;
    }
    public boolean hasTreasure(){
        return hasTreasure;
    }
}
