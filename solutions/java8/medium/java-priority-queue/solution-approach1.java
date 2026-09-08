// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
// Problem     Java Priority Queue
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-08, 06:32 p.m.
// ──────────────────────────────────────────────────


class Student {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
}
class Priorities {
    public List<Student> getStudents(List<String> events) {
        java.util.PriorityQueue<Student> pq =
            new java.util.PriorityQueue<>((a, b) -> {
                if (a.getCGPA() != b.getCGPA()) {
                    return Double.compare(b.getCGPA(), a.getCGPA());
                }
                if (!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());
                }
                return Integer.compare(a.getID(), b.getID());
            });
        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else {
                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }
        List<Student> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}
