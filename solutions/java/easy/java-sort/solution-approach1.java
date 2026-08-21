// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true
// Problem     Java Sort
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 09:21 a.m.
// ──────────────────────────────────────────────────

import java.util.*;
class Student{
    int id;
    String name;
    double cgpa;
    Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
}
public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();    
        ArrayList<Student>list = new ArrayList<Student>();
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            String name=sc.next();
            double cgpa=sc.nextDouble();
            list.add(new Student(id,name,cgpa));
        }
        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student a,Student b){
                if(a.cgpa>b.cgpa){
                    return -1;
                }
                if(a.cgpa<b.cgpa){
                    return 1;
                }
                if(!a.name.equals(b.name)){
                    return a.name.compareTo(b.name);
                }
                return a.id-b.id;
            }
        });
        for(Student s:list){
            System.out.println(s.name);
        }
    }
}
