package com.company.javarush.uroven1_7;

class Cat {
    int age;
    int weight;
    int strength;

    Cat(int a, int b, int c) {
        age = a;
        weight = b;
        strength = c;
    }

    boolean fight1(Cat anotherCat) {
        int n = Integer.compare(this.age, anotherCat.age);
        int m = Integer.compare(this.weight, anotherCat.weight);
        int v = Integer.compare(this.strength, anotherCat.strength);

        int s = n + m + v;
        return s > 0;
    }

    boolean fight(Cat anotherCat) {
        if(this.age > anotherCat.age) {
            if (this.weight >= anotherCat.weight)
                return true;
            else if (this.strength >= anotherCat.strength)
                return true;
            else return false;
        }
        else if(this.weight > anotherCat.weight) {
            if(this.age == anotherCat.age)
                return true;
            else if(this.strength >= anotherCat.strength)
                return true;
            else return false;
        }
        else if(this.strength > anotherCat.strength) {
            if(this.age == anotherCat.age)
                return true;
            else if(this.weight == anotherCat.weight)
                return true;
            else return false;
        }
        else if(this.age == anotherCat.age & this.weight == anotherCat.weight &
                this.strength == anotherCat.strength)
            return true;
        else return false;
    }
}

class CatFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, 1, 2);
        Cat cat2 = new Cat(2, 2, 2);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

        System.out.println(cat1.fight1(cat2));
        System.out.println(cat2.fight1(cat1));
    }
}