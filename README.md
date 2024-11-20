
# Adventure Game

## Project Overview
This is a simplified text-based adventure game built using Java. The game allows players to navigate through interconnected rooms, collect items, interact with NPCs, fight enemies, and achieve the ultimate goal of finding the treasure. The game ends when the player either collects the treasure or loses all health.

---

## Features

### 1. Game Navigation
- Explore rooms such as the **Entrance**, **Forest**, **Dungeon**, and **Treasure Room**.
- Navigate using directional commands (`go north`, `go south`, etc.).
- Each room displays a description and available exits.

### 2. Inventory System
- Players can collect items (e.g., Potion, Treasure).
- View collected items using the `check inventory` command.
- Use items like potions to restore health (`use potion`).

### 3. NPC Interaction
- NPCs provide hints or give items.
- Interact with NPCs using the `talk` command.

### 4. Combat System
- Players can fight enemies using the `attack` command or flee using `run`.
- Enemies deal damage to the player, and their health is displayed during combat.
- Randomized damage adds unpredictability to battles.

### 5. Win/Lose Conditions
- **Win**: Collect the treasure from the Treasure Room.
- **Lose**: If health reaches zero, the game ends with a "Game Over" message.

---

## Commands

| Command         | Description                                    |
|------------------|------------------------------------------------|
| `go north`       | Move to the room in the north direction.       |
| `go south`       | Move to the room in the south direction.       |
| `go east`        | Move to the room in the east direction.        |
| `go west`        | Move to the room in the west direction.        |
| `check inventory`| Displays the player's collected items.         |
| `use potion`     | Restores the player's health.                  |
| `talk`           | Interact with NPCs in the current room.        |
| `attack`         | Attack an enemy in the room.                   |
| `run`            | Escape from combat to a safer room.            |
| `take treasure`  | Collect the treasure in the Treasure Room.     |

---

## How to Run

1. **Set Up Environment**:
   - Install the latest version of Java (JDK 8 or higher).
   - Use an IDE like IntelliJ IDEA, Eclipse, or a text editor and compile manually using `javac`.

2. **Compile the Code**:
   - Compile all `.java` files:
     ```bash
     javac AdventureGame.java Player.java Room.java Enemy.java RoomManager.java
     ```

3. **Run the Game**:
   - Execute the main class:
     ```bash
     java AdventureGame
     ```

4. **Follow the Prompts**:
   - Enter commands as displayed to navigate, collect items, and interact with the game.

---

## Classes Breakdown

| Class Name       | Purpose                                            |
|-------------------|----------------------------------------------------|
| `AdventureGame`   | Main class; initializes the game loop and processes player input. |
| `Player`          | Represents the player; manages health and inventory.|
| `Room`            | Represents rooms; handles descriptions, items, NPCs, and enemies. |
| `Enemy`           | Manages enemy combat logic.                        |
| `RoomManager`     | Handles room setup and player navigation.          |

---

## Game Map
### Rooms and Directions:
```
  Forest
    ↑
 Entrance → Dungeon → Treasure Room
```

---

## Example Walkthrough

1. Start the game:
   ```
   Welcome to the Adventure Game!
   You are at the Entrance. Exits: north (Forest), east (Dungeon).
   Enter command:
   ```

2. Move to the Forest and collect a potion:
   ```
   Enter command: go north
   You are in a dense Forest. Exits: south (Entrance).
   You found a potion!
   Enter command: check inventory
   Inventory: [Potion]
   ```

3. Fight an enemy in the Dungeon:
   ```
   Enter command: go east
   You are in a dark Dungeon. Exits: west (Entrance), north (Treasure Room).
   An enemy attacks you!

   Goblin Health: 50 | Your Health: 100
   Choose action (attack/run): attack
   You hit the Goblin for 20 damage.
   The Goblin hit you for 15 damage.
   ```

4. Reach the Treasure Room and win:
   ```
   Enter command: go north
   You found the treasure! Congratulations!
   You Win!
   ```

---
