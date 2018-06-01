package INTERNSHIP;

import java.util.HashMap;

class passwords {

    private static HashMap<teacher, String> encryption;
    passwords(teacher t ,String PW){
        if ((PW.length() >= 8) && (PW.length() <= 15))
            encryption.put(t, PW);
    }

    public void rechange(teacher t, String PW){
        teacher teach = t;
        encryption.remove(t);
        encryption.put(teach, PW);
    }




}

