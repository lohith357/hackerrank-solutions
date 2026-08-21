// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
// Problem     Java Lambda Expressions
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-21, 09:48 a.m.
// ──────────────────────────────────────────────────


 PerformOperation isOdd() {
        return (int x) -> x % 2 != 0;
    }

    PerformOperation isPrime() {
        return (int x) -> {
            if (x < 2) return false;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return (int x) -> {
            int n = x, rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            return rev == x;
        };
    }
}
