package ProjectLogIn.Model;

import java.util.ArrayList;

public class TableStudent {
    private ArrayList<Student> students=new ArrayList<>();  ;

    public TableStudent() {

        students.add(new Student("Panut Siamrat","5910450514","panut","panut"));
        students.add(new Student("Putthipong Poonbua","5910450590","putthipong","putthipong"));
    }

    public boolean checkLogin(String user,String pass){
        for(int i = 0;i < students.size();i++){
            if (students.get(i).getUsername().equals(user) && students.get(i).getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }

    public String getName(int i){
        return students.get(i).getName();
    }
}
