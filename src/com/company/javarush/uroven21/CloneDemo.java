package com.company.javarush.uroven21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/*
Глубокое клонирование карты
*/

public class CloneDemo implements Cloneable {

    public static void main(String[] args) {
        CloneDemo solution = new CloneDemo();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        CloneDemo clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    protected CloneDemo clone() throws CloneNotSupportedException {
        CloneDemo cloneDemo = new CloneDemo();
        for(Map.Entry<String, User> pair : users.entrySet()) {
            User user = pair.getValue().clone();
            cloneDemo.users.put(pair.getKey(), user);
        }
        return cloneDemo;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            User user = new User(this.age, this.name);
            return user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
