package com.company.javarush.uroven20.saveObject2;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("fest.txt");
            InputStream inputStream = new FileInputStream("fest.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Ivan");
            user.setBirthDate(new Date(1990 - 1900, 8, 12));
            user.setCountry(User.Country.RUSSIA);
            user.setMale(true);

            User user1 = new User();
            user1.setFirstName("Petr");
            user1.setLastName("Sidorov");
            user1.setBirthDate(new Date(1987 - 1900, 3, 9));
            user1.setCountry(User.Country.OTHER);
            user1.setMale(true);

            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            for(User u : javaRush.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " +
                        u.getBirthDate() + " " + u.isMale() + " " + u.getCountry());
            }

            for(User u : loadedObject.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " +
                        u.getBirthDate() + " " + u.isMale() + " " + u.getCountry());
            }

            System.out.println(javaRush.equals(loadedObject));
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            if(!users.isEmpty()) {
                OutputStreamWriter osw = new OutputStreamWriter(outputStream);
                for(int i = 0; i < users.size(); i++) {
                    osw.write(users.get(i).getFirstName() + "\r\n" +
                            users.get(i).getLastName() + "\r\n" +
                            users.get(i).getBirthDate().getTime() + "\r\n" +
                            users.get(i).isMale() + "\r\n" +
                            users.get(i).getCountry() + "\r\n");
                }
                osw.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                User user = new User();
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                String date = "";
                if((date = reader.readLine()).equals("null"))
                    user.setBirthDate(null);
                else user.setBirthDate(new Date(Long.parseLong(date)));
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                user.setCountry(User.Country.valueOf(reader.readLine().toUpperCase()));
                users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}