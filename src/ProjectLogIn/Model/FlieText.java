package ProjectLogIn.Model;

import java.io.*;
import java.util.ArrayList;

public class FlieText {
    String Path="src\\ProjectLogIn\\Data\\";



    public ArrayList<Subject> readFlieSubjects(String name){
        String path = Path+name+".txt";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        ArrayList<Subject> subjects= new ArrayList<>();
        try {

            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] arrLine= line.split(splitBy);

                subjects.add(new Subject(arrLine[0],arrLine[1],Integer.parseInt(arrLine[2]),arrLine[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return subjects;
    }

    public void  write(){
        FileWriter fw=null;
        BufferedWriter bw=null;
        TableSubject tableSubject=new TableSubject();
        String name="Table31";
        try {

            File file = new File(Path+name+".txt");
            file.createNewFile();
            fw = new FileWriter(Path+name+".txt",true);
            bw = new BufferedWriter(fw);
            for (Subject i:tableSubject.getYear31()){
                bw.write(i.toString());
                System.out.println(i);
                bw.newLine();
            }
            System.out.println("done");
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }
}
