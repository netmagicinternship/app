package INTERNSHIP;

import java.util.ArrayList;

public class courses {
    ArrayList<String> codes;
    courses(){
        codes.add("CSC");
        codes.add("MAT");
    }
    public ArrayList<String> getC() {
        return codes;
    }
    public void add_course(String code){
        codes.add(code);
    }
    public boolean possible(String n){
        return codes.contains(n);
    }
}
