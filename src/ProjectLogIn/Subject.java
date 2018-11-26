package ProjectLogIn;

public class Subject implements Comparable {
    private String ID;
    private String name;
    private int credit;
    private String pre;

    public Subject(String ID, String name, int credit, String pre) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
        this.pre = pre;
    }

    public Subject() {
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getPre() {
        return pre;
    }
    @Override
    public String toString() {
        return "SubjectID : " + ID +
                " , Subjectname : " + name  +
                " , Credit : " + credit +
                " , PreSubject :" + pre ;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

