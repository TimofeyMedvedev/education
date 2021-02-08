package com.company.javarush.uroven17;

/*
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) throws Exception {
        Beach b1 = new Beach("One", 14, 10);
        Beach b2 = new Beach("Two", 12, 9);
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int t = 0;
        if(distance > o.distance)
            t--;
        else if(distance < o.distance)
            t++;
        else t += 0;
        if(quality > o.quality)
            t++;
        else if(quality < o.quality)
            t--;
        else t += 0;
        return t;
    }
}