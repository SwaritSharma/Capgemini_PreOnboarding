package CollectionFramework;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>(); 
    private Map<String, Integer> insertionOrderVotes = new LinkedHashMap<>(); 

    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        insertionOrderVotes.put(candidate, votes.get(candidate));
    }

    public void displayResults() {
        System.out.println("Voting Results (Alphabetical)");
        TreeMap<String, Integer> sortedResults = new TreeMap<>(votes);
        sortedResults.forEach((k, v) -> System.out.println(k + ": " + v + " votes"));
    }

    public void displayInsertionOrder() {
        System.out.println("\nVotes in Insertion Order");
        insertionOrderVotes.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Charlie");
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");

        vs.displayResults();
        vs.displayInsertionOrder();
    }
}
