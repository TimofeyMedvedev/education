package com.company.javarush.uroven21;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Equals and HashCode
*/
public class Solution4 {
    private final String first, last;

    public Solution4(String first, String last) {
        this.first = first;
        this.last = last;
    }
//  Начальный вариант в задаче
//  public boolean equals(Solution4 n) {
//      return n.first.equals(first) && n.last.equals(last);
//  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || !(o instanceof Solution4)) return false;
        Solution4 solution4 = (Solution4) o;
        return Objects.equals(first, solution4.first) &&
                Objects.equals(last, solution4.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }
//  Начальный вариант в задаче
//  public int hashCode() {
//     return 31 * first.hashCode() + last.hashCode();
//  }

    public static void main(String[] args) {
        Set<Solution4> s = new HashSet<>();
        s.add(new Solution4("Donald", "Duck"));
        System.out.println(s.contains(new Solution4("Donald", "Duck")));
    }
}