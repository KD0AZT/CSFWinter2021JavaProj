# Sudoku Design Document
A GUI Sudoku puzzle that generates a random playable puzzle and if user solves puzzle award points, if failed to solve deduct points. 
Puzzle will be self solving, if user enters SOLVE, puzzle will solve with correct solutions.

## Graphical User Interface
A GUI for user to solve puzzle, should be able to fill in each tile with a number or delete. With a submit button
for the user to submit their own solution to the puzzle, and a solve button which activates the solve functions. 
Display score, user name and puzzle number.

## Board Class
The board class will generate a random board on every turn and the user will be able to solve. Keep Score.

## User Class
Will keep the user's information and get the score from the board class.

## Solve Class
Will solve the puzzle when activated by push of a button. Solves Sudoku problem modelled on a Constraint Satisfaction Problem
Will utilize a more intelligent search than typical DFS solutions. Will utilize find empty method, valid method 
to satisfy the contraint problem and a solve function that is called recursively.

### Any corner cases
All corner cases can be submitted to the github issues section.