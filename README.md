# RockPaperScissorGame
A simple console-based Rock, Paper, Scissors game written in Java. The user plays against the computer, which makes a random choice.

🎮 How to Play
Run the program.

You'll be prompted to enter your choice:

0 for Rock

1 for Paper

2 for Scissors

The computer makes a random choice.

The winner is determined based on classic Rock, Paper, Scissors rules.

🧠 Game Logic
Rock beats Scissors

Paper beats Rock

Scissors beats Paper

If both player and computer choose the same, it's a tie.

🧾 Sample Output
yaml
Copy
Edit
Welcome to the Rock, Paper, Scissors Game!
Enter your choice:
0: Rock, 1: Paper, 2: Scissors
You chose: Rock
Computer chose: Scissors
You win!
🛠️ Requirements
Java Development Kit (JDK) 8 or higher

▶️ How to Run
Save the file as RockPaperScissorsGame.java inside a folder named Day5.

Open a terminal and navigate to the parent directory of Day5.

Compile the program:

nginx
Copy
Edit
javac Day5/RockPaperScissorsGame.java
Run the program:

nginx
Copy
Edit
java Day5.RockPaperScissorsGame
📌 Notes
Input validation is included: the user must enter a number between 0 and 2.

The program uses Math.random() to generate the computer's choice.

