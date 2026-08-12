// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?isFullScreen=true
// Problem     Sorting: Comparator
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 09:37 a.m.
// ──────────────────────────────────────────────────


class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
        if (a.score!=b.score){
            return b.score-a.score;
        }
        return a.name.compareTo(b.name);
    
    }
}

