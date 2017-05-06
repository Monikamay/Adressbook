package aitc.monika;

import java.io.*;

import javax.lang.model.element.Name;
import java.io.FileOutputStream;

/**
 * Created by studenta on 06.05.2017.
 */
public class MyAddressBook {


    private int recordsnumber;
    private MyRecord[] records;

    public MyAddressBook(){

    }

    public  MyAddressBook(MyRecord[] rcd){
        this.recordsnumber = rcd.length;
        this.records = new MyRecord[rcd.length];
        this.records = rcd;

        /*
        for (MyRecord myRecord : this.records =rcd){
        };*/
    }


    public void setRecords(MyRecord[] records) {
        this.records = records;
    }


    public MyRecord[] createRecords(){
        MyRecord [] mrc = null;

        return mrc;
    }

    public String [] getLinesFromFile (String filename) throws IOException {
        //make private after
        String[] str = null;

        int i;

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(filename);


            do {
                i = fis.read();
                if (i != -1) ;
                System.out.println("." + (char) i + ".");
                System.out.println("." + i + ".");

            }
            while (i != -1);

        } catch (FileNotFoundException ex) {
            System.out.println("file is not found");
        } catch (IOException ex1) {
            System.out.println("i/o error");
        } catch (NullPointerException ex2) {
            System.out.println(ex2.toString());
        }
        finally {
            if (fis !=null)
                fis.close();
        }


        return str;
    }









    public MyRecord[] getRecords() {
        return records;
    }

    public void setRecordsnumber(int recordsnumber) {
        this.recordsnumber = recordsnumber;
    }

    public int getRecordsnumber() {
        return recordsnumber;
    }






    public void addRecord(MyRecord myrecord, String filestorage) throws IOException {
        int i;
        FileOutputStream fos1 = null;
        String str1;
        str1 = "*Name:" + myrecord.getName() + "*Surname:" + myrecord.getSurname() + "*Phone:" + myrecord.getPhone() + "*PostalAddress:" + myrecord.getPostalAddress() + "*E_mail:" + myrecord.getE_mail() + "*Website:" + myrecord.getWww() + "\n";
        byte[] by = str1.getBytes();
        this.records = new MyRecord[1];

        this.records [0] = myrecord;

        try {
            fos1 = new FileOutputStream(filestorage, true);

            fos1.write(by);

        }catch (FileNotFoundException ex){
            System.out.println("file is not found");
        }catch (IOException ex1){
            System.out.println("i/o error");
        }catch (NullPointerException ex2){
            System.out.println(ex2.toString());
        }finally{

            if(fos1 != null)
                fos1.close();

        }

    }




       /* int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileOutputStream fos1 = null;


        String filename = "C:\\Users\\studenta.AITC\\IdeaProjects\\FileInOut\\src\\aitc\\monika\\testfile.txt";
        String myfilename= "C:\\Users\\studenta.AITC\\IdeaProjects\\FileInOut\\src\\aitc\\monika\\myfile1.txt";
        String newmyfilename= "C:\\Users\\studenta.AITC\\IdeaProjects\\FileInOut\\src\\aitc\\monika\\newmyfile.txt";

        String str;
        str = "ABCDEFG\n";
        byte[]bstr = str.getBytes();



        try {
            fis = new FileInputStream(filename);
            fos = new FileOutputStream(myfilename);
            fos1 = new FileOutputStream(newmyfilename, true);

            fos1.write(bstr);

            do{
                i = fis.read();
                if (i !=-1);
                System.out.println("." +(char) i + ".");
                System.out.println("." + i + ".");
                fos.write(i);
            }
            while (i != -1);

        }catch (FileNotFoundException ex){
            System.out.println("file is not found");
        }catch (IOException ex1){
            System.out.println("i/o error");
        }catch (NullPointerException ex2){
            System.out.println(ex2.toString());
        }

    }*/


        public void deleteRecord ( int recordID){

        }
}
