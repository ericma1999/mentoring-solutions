import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solver {
    public static Node AStar(char[][] initial) {
        Node root = new Node(initial);
        PriorityQueue<Node> node = new PriorityQueue<>();  // ordered by Manhattan heuristic function
        node.add(root);

        HashMap<String, Node> exploredSet = new HashMap<>();  // to store expanded nodes

        Node solution = null;

        while (!node.isEmpty()) {
            Node currentNode = node.remove();
            currentNode.calHCost();

            if (currentNode.isGoal()) {
                solution = currentNode;
                break;
            } else {
                // make sure current node isn't in our explored node set
                if (!exploredSet.containsKey(Arrays.deepToString(currentNode.getCurState()))) {
                    exploredSet.put(Arrays.deepToString(currentNode.getCurState()), currentNode);
                    node.addAll(genSuccessors(currentNode));
                }
            }
        }
        return solution;
    }

    // Apply moves and generate successors to the current State
    public static ArrayList<Node> genSuccessors(Node node) {
        node.searchEmptyTile(node.getCurState());
        int rowPos = node.getEmptyTileRowPos();
        int colPos = node.getEmptyTileColPos();
        ArrayList<Node> successors = new ArrayList<>();

        if ((rowPos * Node.EIGHT_PUZZLE_DIMENSION + colPos) % Node.EIGHT_PUZZLE_DIMENSION != (Node.EIGHT_PUZZLE_DIMENSION-1)) {
            // move empty right
            char[][] successorState = Utils.arrayDeepClone(node.getCurState());
            char tile = successorState[rowPos][colPos];
            successorState [rowPos][colPos] = successorState [rowPos][colPos + 1];
            successorState [rowPos][colPos + 1] = tile;

            Node aSuccessor = new Node(node,successorState,"RIGHT");
            aSuccessor.calHCost();
            successors.add(aSuccessor);
        }

        if ((rowPos * Node.EIGHT_PUZZLE_DIMENSION + colPos) / Node.EIGHT_PUZZLE_DIMENSION != (Node.EIGHT_PUZZLE_DIMENSION-1)) {
            // move empty down
            char[][] successorState = Utils.arrayDeepClone(node.getCurState());
            char tile = successorState[rowPos][colPos];
            successorState [rowPos][colPos] = successorState[rowPos+1][colPos];
            successorState [rowPos+1][colPos] = tile;

            Node child = new Node(node, successorState, "DOWN");
            child.calHCost();
            successors.add(child);
        }

        if ((rowPos * Node.EIGHT_PUZZLE_DIMENSION + colPos) % Node.EIGHT_PUZZLE_DIMENSION != 0) {
            // move empty left
            char[][] successorState = Utils.arrayDeepClone(node.getCurState());
            char tile = successorState[rowPos][colPos];
            successorState [rowPos][colPos] = successorState [rowPos][colPos-1];
            successorState [rowPos][colPos-1] = tile;

            Node child = new Node(node, successorState,"LEFT");
            child.calHCost();
            successors.add(child);
        }

        if ((rowPos * Node.EIGHT_PUZZLE_DIMENSION + colPos) / Node.EIGHT_PUZZLE_DIMENSION != 0) {
            // move empty up
            char[][] successorState = Utils.arrayDeepClone(node.getCurState());
            char tile = successorState[rowPos][colPos];
            successorState[rowPos][colPos] = successorState [rowPos-1][colPos];
            successorState [rowPos-1][colPos] = tile;

            Node child = new Node(node, successorState, "UP");
            child.calHCost();
            successors.add(child);
        }
        return successors;
    }
}
