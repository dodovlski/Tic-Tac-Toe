# Tic-Tac-Toe Game

This is a simple command-line Tic-Tac-Toe game implemented in Java. The game allows two players to take turns entering their moves, and it checks for a winner after each move.

## Requirements

- Java Development Kit (JDK) 8 or higher

## How It Works

The game initializes an empty 3x3 Tic-Tac-Toe board and then enters a loop where players take turns making their moves. After each move, the board is printed, and the game checks if the current player has won.

### Main Components

1. **Board Initialization**
    - The board is represented as a 2D character array of size 3x3, initialized with spaces.

2. **Player Input**
    - Players enter the row and column numbers for their moves.
    - The row and column numbers are adjusted to zero-based indexing for the array.

3. **Board Printing**
    - The current state of the board is printed after each move, showing row and column numbers for easy reference.

4. **Win Check**
    - After each move, the game checks if the current player has won by checking rows, columns, and diagonals.

5. **Game Loop**
    - The game continues until a player wins. If a player wins, a message is displayed, and the game ends.

## Running the Application

1. Save the code in a Java file, e.g., `Main.java`.
2. Compile the file using the Java compiler:
    ```sh
    javac Main.java
    ```
3. Run the compiled class file:
    ```sh
    java Main
    ```
4. Follow the prompts to enter moves for Player 1 and Player 2.


## Customization

- **Board Size**: The current implementation is for a 3x3 board. To create a larger board, adjust the size of the `board` array and the related logic.
- **Winning Conditions**: The current win check is for standard Tic-Tac-Toe. Modify the `checkWin` method to support different winning conditions.

## Additional Features

- **Input Validation**: Add input validation to handle cases where players enter invalid row or column numbers or try to place a move on an already occupied cell.
- **Draw Condition**: Add logic to check for a draw when the board is full and no player has won.

This README provides a comprehensive guide to understanding and running the Tic-Tac-Toe game. Enjoy playing!
