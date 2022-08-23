package com.example.contains;

import java.util.*;

public class Containset {
    public static void main(String[] args) {
// A 집합
        List<String> set1 = Arrays.asList("1", "2", "3", "4", "5");
        TreeSet<String> A = new TreeSet<>(set1);


// B 집합
        List<String> set2 = Arrays.asList("3", "4", "5", "6", "7");
        TreeSet<String> B = new TreeSet<>(set2);

// C 집합
        List<String> set3 = Arrays.asList("3", "4");
        TreeSet<String> C = new TreeSet<>(set3);

        System.out.println("A ? "+A);
        System.out.println("B ? "+B);
        System.out.println("C ? "+C+"\n");
        //부분집합
        boolean isContainAll = B.containsAll(C);
        System.out.println("C ⊂ B ? "+isContainAll);
        //포함여부
        boolean isContain = B.contains("7");
        System.out.println("7 ⊂ B ? "+ isContain);
        //교집합
        TreeSet<String> cloneA = new TreeSet<>(set1);
        boolean isModifiedI = cloneA.retainAll(B);
        System.out.println("A ∩ B ? "+cloneA);
        //합집합
        TreeSet<String> cloneAA = new TreeSet<>(set1);
        boolean isModifiedII = cloneAA.addAll(B);
        System.out.println("A ∪ B ? "+cloneAA);
        //차집합
        TreeSet<String> cloneAAA = new TreeSet<>(set1);
        boolean isModifiedIII = cloneA.removeAll(B);
        System.out.println("A - B ? "+cloneAAA);

    }
}
