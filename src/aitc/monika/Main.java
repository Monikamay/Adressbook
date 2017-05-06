package aitc.monika;
import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {


    public static void main(String[] args) throws IOException {
        // write your code here



        MyRecord rc1 = new MyRecord("Ashot", "Grigoryan", "094222211", "1 Lepsius str., 0025 Yerevan, Armenia","ashot@gmail.com", "ashot.bk");
        MyRecord rc2 = new MyRecord("Hovhannes", "Gasparyan", "094111111", "1 Jugha str., 0058 Yerevan","hg@gmail.com", "hg@gmail.com");

        MyRecord[] myrecarray = {rc1, rc2};
        System.out.println("test:" + myrecarray[1].getPhone());

        MyAddressBook mab = new MyAddressBook(myrecarray);
       // System.out.println( "test:" + mab.getRecords() [0].getE_mail());

        String newmyfilename= "C:\\Users\\studenta.AITC\\IdeaProjects\\Adressbook\\newmyfile.txt";
        MyAddressBook mab1 = new MyAddressBook();
        mab1.addRecord(rc1, newmyfilename);
        mab1.getRecords()[0].getName();
        System.out.println( "test:" + mab.getRecords() [0].getE_mail());


        //System.out.println("test:" + mab1.getRecords()[0].getName()  +  mab1.getRecords()[0].getSurname());


    }
}
