package com.company.javarush.uroven1_7;

public class Artifact {
    String culture;
    int vek, number;

    public Artifact(String culture, int number, int vek) {
        this.culture = culture;
        this.number = number;
        this.vek = vek;
    }

    public Artifact(String culture, int number) {
        this.culture = culture;
        this.number = number;
    }

    public Artifact(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact("Azteki", 456734, 13);
        Artifact artifact2 = new Artifact("Maya", 866103);
        Artifact artifact3 = new Artifact(792743);

        System.out.println(artifact1.culture);
        System.out.println(artifact1.number);
        System.out.println(artifact1.vek + "\n");

        System.out.println(artifact2.culture);
        System.out.println(artifact2.number + "\n");

        System.out.println(artifact3.number);
    }
}

