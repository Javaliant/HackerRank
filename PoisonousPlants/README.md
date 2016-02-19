There are NN plants in a garden. Each of these plants has been added with some amount of pesticide. After each day, if any plant has more pesticide than the plant at its left, being weaker than the left one, it dies. You are given the initial values of the pesticide in each plant. Print the number of days after which no plant dies, i.e. the time after which there are no plants with more pesticide content than the plant to their left.

Input Format

The input consists of an integer NN. The next line consists of NN integers describing the array PP where P[i]P[i] denotes the amount of pesticide in plant ii.

Constraints 
1≤N≤1000001≤N≤100000 
0≤P[i]≤1090≤P[i]≤109
Output Format

Output a single value equal to the number of days after which no plants die.