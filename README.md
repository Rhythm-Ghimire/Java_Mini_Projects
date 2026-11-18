# Java Mini Projects

A collection of small console programs I wrote while learning Java. They practise core language features, object-oriented programming, user input, and basic problem solving.

**Tech stack:** Java (IntelliJ IDEA project)

## Projects

| Program | What it does | Concepts practised |
|---|---|---|
| `ExamPercentageCalc.java` | Takes a student's marks in five subjects and prints the total percentage | `Scanner` input, arithmetic, formatted output |
| `Rock_Paper_Scissors.java` | Play rock, paper, scissors against the computer | `Random`, `switch`, conditionals |
| `guess_the_number.java` | Guess a random number between 0 and 500 and see how many tries it took | Classes, encapsulation (private fields), loops |
| `online_library.java` | Console library: add books, issue books, and return books | Classes and objects, arrays, menu-driven programs |

## Project structure

```
src/com/company/
├── ExamPercentageCalc.java
├── Rock_Paper_Scissors.java
├── guess_the_number.java
├── online_library.java
└── Main.java
```

## Running a program

**In IntelliJ IDEA:** open the folder as a project, then run the `main` method of the program you want.

**From the command line** (JDK 8 or newer):

```bash
git clone https://github.com/Rhythm-Ghimire/Java_Mini_Projects.git
cd Java_Mini_Projects
javac -d out src/com/company/*.java
java -cp out com.company.Rock_Paper_Scissors
```

Replace `Rock_Paper_Scissors` with any other class name from the table above.

## Author

**Rhythm Kashyap Ghimire**
[GitHub](https://github.com/Rhythm-Ghimire)
