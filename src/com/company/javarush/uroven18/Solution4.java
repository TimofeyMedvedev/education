package com.company.javarush.uroven18;

import java.util.List;

/*
Таблица
*/

public class Solution4 {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface ti;
        private String headerText = "";

        public TableInterfaceWrapper(TableInterface ti) {
            this.ti = ti;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            ti.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return ti.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ti.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}