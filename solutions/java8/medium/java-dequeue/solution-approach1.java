// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
// Problem     Java Dequeue
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-22, 10:20 a.m.
// ──────────────────────────────────────────────────

    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max=0;
            HashMap<Integer,Integer>map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
                map.put(num,map.getOrDefault(num,0)+1);
                if(deque.size()>m){
                    int removed=(int)deque.removeFirst();
                    map.put(removed,map.get(removed)-1);
                    if(map.get(removed)==0){
                        map.remove(removed);
                    }
                }
                if(deque.size()==m){
                    max=Math.max(max,map.size());
                } 
            }
            System.out.println(max);
        }
    }



