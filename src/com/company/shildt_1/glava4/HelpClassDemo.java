package com.company.glava4;

public class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        Help4 hlpobj = new Help4();

        for(;;) {
            do {
                hlpobj.showmenu();
                ch = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                }   while(ignore != '\n');
            } while(!hlpobj.isvalid(ch));

            if(ch == 'q') break;

            System.out.print("\n");

            hlpobj.helpon(ch);
        }
    }
}
