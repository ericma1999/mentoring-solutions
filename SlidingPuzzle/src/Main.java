

/*
* Combination of solutions found on Sliding Puzzle using A*
* A* is a heuristic algorithm so it won't always return the correct results for all of the solutions
* However, we can make it near perfect by looking at the possible heuristics to implement more below
*
*
* 
* For more accurate improvement to the solution look at: http://www.cs.rpi.edu/academics/courses/fall00/ai/assignments/assign3heuristics.html
* Personally I think that the intended solution that they wanted you to do for this is brute force
* since this is just an exercise.
*
* Acknowledgements: Majority of the code are snippets from various solutions, I just combined them to quickly concoct up
* a solution
*
* */

public class Main {
    static char [][] targetState = {{'1','2','3'},{'4','5','6'},{'7','8','0'}};


//    {'1','2','3'},
//    {'5','4','0'},
//    {'7','6','8'}


//    {'1','2','3'},
//    {'0','5','6'},
//    {'7','8','4'}

//    {'1','2','3'},
//    {'4','0','5'},
//    {'7','8','6'}



    public static void main(String[] args) {
//        Using manhattan heuristic only
        char[][] puzzle = {
                {'1','2','3'},
                {'4','0','5'},
                {'7','8','6'}
        };

        // Check to see if the problem is solvable in the first place
        // https://www.geeksforgeeks.org/check-instance-8-puzzle-solvable/

        Node solution = Solver.AStar(puzzle);
        if (solution == null) {
            System.out.println("\nPuzzle has no result");
        } else {
            Utils.printSolPath(solution);
        }
    }
}
