package ProjectLogIn.Model;

import java.util.ArrayList;

public class TableSubject {
    private  ArrayList<Subject> tsall =new ArrayList<>();
    private  ArrayList<Subject> ts11 =new ArrayList<>();
    private  ArrayList<Subject> ts12 =new ArrayList<>();
    private  ArrayList<Subject> ts21 =new ArrayList<>();
    private  ArrayList<Subject> ts22 =new ArrayList<>();
    private  ArrayList<Subject> ts3l =new ArrayList<>();
    private  ArrayList<Subject> ts32 =new ArrayList<>();
    private  ArrayList<Subject> ts4l =new ArrayList<>();
    private  ArrayList<Subject> ts42 =new ArrayList<>();



    public TableSubject() {
        FlieText f=new FlieText();
        tsall = f.readFlieSubjects("TableAll");
        ts11 = f.readFlieSubjects("Table11");
        ts12 = f.readFlieSubjects("Table12");
        ts21 = f.readFlieSubjects("Table21");
        ts22 = f.readFlieSubjects("Table22");
        ts3l = f.readFlieSubjects("Table31");
        ts32 = f.readFlieSubjects("Table32");
        ts4l = f.readFlieSubjects("Table41");
        ts42 = f.readFlieSubjects("Table42");

    }
    @Override
    public String toString() {
        String str="";
        for (Subject temp: tsall){
            str+=temp+"\n";
        }

        return str;
    }
    public String getAllPreID(){
        String str="";
        for (Subject temp: tsall){
            str+=temp.getPre()+",";
        }
        return str;
    }
    public String getAllID(){
        String str="";
        for (Subject temp: tsall){
            str+=temp.getID()+",";
        }
        return str;
    }
    public String getAllName(){
        String str="";
        for (Subject temp: tsall){
            str+=temp.getName()+",";
        }
        return str;
    }
    public ArrayList<Subject> getTsall(){
        return tsall;
    }
    public Subject getSubject(String ID) {
        boolean staus=true;
        Subject subject = new Subject();
        for (Subject temp : tsall) {
            if (temp.getID().equals(ID)) {
                subject = temp;
                staus=false;
                break;
            }
        }
        if(staus){
            return new Subject("No","No",0,"no");
        }
        return subject;
    }

    public ArrayList<Subject> getYear11() {
        return ts11;
    }

    public ArrayList<Subject> getYear12() {
        return ts12;
    }

    public ArrayList<Subject> getYear21() {
        return ts21;
    }

    public ArrayList<Subject> getYear22() {
        return ts22;
    }

    public ArrayList<Subject>getYear31() {
        return ts3l;
    }

    public ArrayList<Subject> getYear32() {
        return ts32;
    }

    public ArrayList<Subject> getYear41() {
        return ts4l;
    }

    public ArrayList<Subject> getYear42() {
        return ts42;
    }
}
