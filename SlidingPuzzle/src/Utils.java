import java.util.Stack;

public class Utils {


    // make a new array not dependent/reference the original array.
    public static char[][] arrayDeepClone(char[][] arrB) {
        char[][] arrA = new char [arrB.length][arrB.length];
        for(int i=0; i<arrB.length; i++) {
            System.arraycopy(arrB[i], 0, arrA[i], 0, arrB.length);
        }
        return arrA;
    }

    public static void renderPuzzle(char[][] puzzle) {
        for (char[] chars : puzzle) {
            System.out.println();
            for (int j = 0; j < puzzle.length; j++) {
                System.out.print(" " + chars[j] + " ");
            }
        }
        System.out.println();
    }

    private static String selectAction(String emptyTileMove) {
        String action = "";
        switch (emptyTileMove) {
            case "RIGHT" -> action = "LEFT";
            case "LEFT" -> action = "RIGHT";
            case "UP" -> action = "DOWN";
            case "DOWN" -> action = "UP";
            default -> System.out.println("No Match");
        }

        return action;
    }

    public static void printSolPath(Node node) {
        Stack<Node> solStack = new Stack<>();
        solStack.add(node);
        while (node.getParent() != null) {
            node = node.getParent();
            solStack.add(node);
        }

        solStack.pop();

        while (!solStack.isEmpty()) {
            Node a = solStack.pop();
            System.out.println("\n ==> Slide a tile " + selectAction(a.getAction()) + " to 0 <==");
            renderPuzzle(a.getCurState());
        }

        System.out.println("\n Done");
    }


}