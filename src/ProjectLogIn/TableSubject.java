package ProjectLogIn;

import java.util.ArrayList;

public class TableSubject {
    private ArrayList<Subject> ts=new ArrayList<Subject>();  ;

    public TableSubject() {
        //bus
        ts.add(new Subject("01132101","Modern Entrepreneur",3,"no"));

        //P.E
        ts.add(new Subject("01175114","Table Tennis for Health",1,"no"));
        ts.add(new Subject("01175121","Basketball for Health",1,"no"));

        //soc
        ts.add(new Subject("01301201","Resources and Environment Conservation",3,"no"));

        //eng
        ts.add(new Subject("01355111","English I",3,"no"));
        ts.add(new Subject("01355112","English II",3,"01355111"));
        ts.add(new Subject("01355113","English III",3,"01355112"));
        ts.add(new Subject("01355201","Fundamental English Reading",3,"01355113"));
        ts.add(new Subject("01355202","Fundamental English Writing",3,"01355113"));

        //thai
        ts.add(new Subject("01355209","Communicative English for Careers",3,"01355113"));
        ts.add(new Subject("01361101","Introductory Thai Usage",3,"no"));
        ts.add(new Subject("01361102","Thai Practical Writing",3,"no"));

        //free
        ts.add(new Subject("01387101","The Art of Living with Others",3,"no"));
        ts.add(new Subject("01387103","Philosophy of Sufficiency Economics and Buddhism",3,"no"));
        ts.add(new Subject("01386121","Music Appreciation",3,"no"));

        //Chemistry
        ts.add(new Subject("01403111","General Chemistry",4,"no"));
        //com
        ts.add(new Subject("01418114","Introduction to Computer Science",4,"no"));
        ts.add(new Subject("01418116","Computer Programming",3,"01418116"));
        ts.add(new Subject("01418131","Digital Computer Logic",3,"no"));
        ts.add(new Subject("01418132","Fundamentals of Computing",4,"no"));
        ts.add(new Subject("01418211","Visual Programming",3,"01418114"));
        ts.add(new Subject("01418212","FORTRAN Programming",3,"01418114"));
        ts.add(new Subject("01418213","COBOL Programming",3,"01418114"));
        ts.add(new Subject("01418214","C Programming",3,"01418114"));
        ts.add(new Subject("01418215","Object Oriented Programming",3,"01418114"));
        ts.add(new Subject("01418216","Principles of Programming Languages",3,"01418116"));
        ts.add(new Subject("01418217","Software Construction",3,"01418116"));
        ts.add(new Subject("01418221","Fundamentals of Database Systems",3,"01418116"));
        ts.add(new Subject("01418231","Data Structure",3,"01418116"));
        ts.add(new Subject("01418232","Algorithm Design and Analysis",3,"01418231"));
        ts.add(new Subject("01418233","Unix Operating System and Shell Programming",3,"01418114"));
        ts.add(new Subject("01418321","System Analysis and Design",3,"01418221"));
        ts.add(new Subject("01418322","Principles of Information System",3,"01418114"));
        ts.add(new Subject("01418331","Assembly Language and Computer Architecture",4,"01418116,01418131"));
        ts.add(new Subject("01418332","Operating Systems",4,"01418331"));
        ts.add(new Subject("01418333","Formal Language and Automata Theory",3,"01418132"));
        ts.add(new Subject("01418334","Compiler Techniques",3,"01418216"));
        ts.add(new Subject("01418343","Intellectual Property for Software and Digital Contents",3,"no"));
        ts.add(new Subject("01418344","Enterprise Resource Planning System Design and Development",3,"01418221"));
        ts.add(new Subject("01418345","Computer Programming in Business",3,"01418116"));
        ts.add(new Subject("01418346","Mobile Application Design and Development",3,"01418221"));
        ts.add(new Subject("01418351","Computer Communications and Protocols",3," 01418116"));
        ts.add(new Subject("01418353","Computer System and Communication Network Security",3,"01418351"));
        ts.add(new Subject("01418382","Computer Graphics Working Environment",3,"01418116"));
        ts.add(new Subject("01418385","Digital Image Processing",3,"01418116"));
        ts.add(new Subject("01418390","Co-operative Education Preparation",3,"01418321"));
        ts.add(new Subject("01418399","Computer Science Project Preparation",1,"01418321"));
        ts.add(new Subject("01418421","Human Computer Interaction",3,"01418116,01418322"));
        ts.add(new Subject("01418442","Business Data Dimension and Report Management",3,"014183454,01418345"));
        ts.add(new Subject("01418443","Web Technology and Web Services",3,"01418351"));
        ts.add(new Subject("01418451","Network Design and Administration",3,"01418351"));
        ts.add(new Subject("01418462","Theory of Artificial Intelligence",3,"01418232"));
        ts.add(new Subject("01418471","Introduction to Software Engineering",3,"01418221"));
        ts.add(new Subject("01418472","Project Management and Control",3,"01418221"));
        ts.add(new Subject("01418473","Computer Control and Audi",3,"01418321"));
        ts.add(new Subject("01418476","Software Testing and Verification",3,"01418217"));
        ts.add(new Subject("01418496","Selected Topic in Computer Science",3,"no"));
        ts.add(new Subject("01418490","Co-operative Education",6,"01418390"));
        ts.add(new Subject("01418497","Seminar",1,"01418221,01418216,01418232"));
        ts.add(new Subject("01418499","Computer Science Project",3,"01418399"));
        ts.add(new Subject("01417111","Calculus I",3,"no"));
        ts.add(new Subject("01417112","Calculus II",3,"01417111"));
        ts.add(new Subject("01417322","Introductory Linear Algebra",3,"01417112"));

        //Physic
        ts.add(new Subject("01420115","Laboratory in Abridged Physic",1,"no"));
        ts.add(new Subject("01420119","Abridged Physics",3,"no"));

        //Radiation
        ts.add(new Subject("01421211","Radiation, Life and Environment",3,"no"));

        //Statistics
        ts.add(new Subject("01422111","Principles of Statistics",3,"no"));

        //Biology
        ts.add(new Subject("01424111","Principles of Biology",3,"no"));
        ts.add(new Subject("01424112","Laboratory in Biology",1,"no"));

        //soc
        ts.add(new Subject("01453102","Law in Everyday Life",3,"no"));
        ts.add(new Subject("01455101","World Politics in Daily Life",3,"no"));
        ts.add(new Subject("01459101","Psychology for Modern Life",3,"no"));

        //free
        ts.add(new Subject("01999021","Thai Language for Communication",3,"no"));
        ts.add(new Subject("01999212","Concepts in Sciences and Philosophy",3,"no"));
    }
    @Override
    public String toString() {
        String str="";
        for (Subject temp:ts){
            str+=temp+"\n";
        }

        return str;
    }
    public String getAllPreID(){
        String str="";
        for (Subject temp:ts){
            str+=temp.getPre()+",";
        }
        return str;
    }
    public String getAllID(){
        String str="";
        for (Subject temp:ts){
            str+=temp.getID()+",";
        }
        return str;
    }
    public String getAllName(){
        String str="";
        for (Subject temp:ts){
            str+=temp.getName()+",";
        }
        return str;
    }
    public ArrayList<Subject> getTs(){
        return ts;
    }
    public Subject getSubject(String ID) {
        boolean staus=true;
        Subject subject = new Subject();
        for (Subject temp : ts) {
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
    public ArrayList<Subject>getYear11(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01418114"));
        term.add(tableSubjects.getSubject("01418131"));
        term.add(tableSubjects.getSubject("01420115"));
        term.add(tableSubjects.getSubject("01420119"));
        term.add(tableSubjects.getSubject("01355111"));
        term.add(tableSubjects.getSubject("01386121"));
        return term;
    }
    public ArrayList<Subject>getYear12(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear21(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear22(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear31(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear32(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear41(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
    public ArrayList<Subject>getYear42(){
        TableSubject tableSubjects=new TableSubject();
        ArrayList<Subject>term=new ArrayList<>();
        term.add(tableSubjects.getSubject("01417111"));
        term.add(tableSubjects.getSubject("01418116"));
        term.add(tableSubjects.getSubject("01403111"));
        term.add(tableSubjects.getSubject("01175114"));
        term.add(tableSubjects.getSubject("01459101"));
        term.add(tableSubjects.getSubject("01301201"));
        return term;
    }
}
