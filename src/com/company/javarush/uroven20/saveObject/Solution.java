package com.company.javarush.uroven20.saveObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("C:\\Users\\homit\\IdeaProjects\\Example\\fest.txt", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\homit\\IdeaProjects\\Example\\fest.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\homit\\IdeaProjects\\Example\\fest.txt");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(somePerson.name);
            for(Asset a : somePerson.assets) {
                System.out.println(a.getName() + " " + a.getPrice());
            }
            System.out.println(ivanov.equals(somePerson));

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            osw.write(name + "\r\n");
            String isAssets = assets.isEmpty() ? "no" : "yes";
            osw.write(isAssets + "\r\n");

            if(!assets.isEmpty()) {
                for(int i = 0; i < assets.size(); i++) {
                    osw.write(assets.get(i).getName() + "\r\n");
                    String price = "" + assets.get(i).getPrice() + "\r\n";
                    osw.write(price);
                }
            }
            osw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            String isAssets = reader.readLine();

            if(isAssets.equals("yes")) {

                while (reader.ready()) {
                    assets.add(new Asset(reader.readLine(), Double.parseDouble(reader.readLine())));
                }
            }
        }
    }
}