package com.company.javarush.uroven19;

/*
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class AdapterFewInterface {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData id;

        public IncomeDataAdapter(IncomeData id) {
            this.id = id;
        }

        @Override
        public String getCompanyName() {
            return id.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(id.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s", id.getContactLastName(), id.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String pn = String.format("%010d", id.getPhoneNumber());
            return String.format("%+d(%s)%s-%s-%s", id.getCountryPhoneCode(), pn.substring(0, 3), pn.substring(3, 6),
                    pn.substring(6, 8), pn.substring(8, 10));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}