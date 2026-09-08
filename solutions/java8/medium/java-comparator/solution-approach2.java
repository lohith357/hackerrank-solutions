// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
// Problem     Java Comparator
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-08, 06:45 p.m.
// ──────────────────────────────────────────────────



// Write your Checker class here
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;
        }
        return a.name.compareTo(b.name);
    }
}

