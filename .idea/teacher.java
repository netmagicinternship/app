package INTERNSHIP;

import java.util.HashMap;

public class teacher {
    private static String title;
    private static String name;
    private static UserName username;
    private static String work_area;
    private static String email_id;
    private static String id_no;
    private static String contact_no;
    private boolean acceptance = false;
    private static HashMap<String, lecture> work_classes;
    private static passwords password;
    teacher() {}
    teacher(String name, String work_area, String email, String no, String contact){
        this.name = name;
        this.work_area = work_area;
        email_id = email;
        id_no = no;
        contact_no = contact;
    }
    public void addLecture(String nam, String time, String place, String code){
        //add if code is there in the INTERNSHIP.courses...
        lecture obj = new lecture (nam, time, code, place);
        work_classes.put(name, obj);
    }
    protected void removeLecture(lecture l){
        if (!work_classes.isEmpty())
            work_classes.remove(name, l);
    }
    protected void modifyLecture(lecture l, String place, String time){
        if (place.equals(l.getPlace()))
            l.setTime(time);
        l.setPlace(place);
    }
    protected void setPassword(String ENCRYPTED){
        password = new passwords(this, ENCRYPTED);

    }
    protected void setUsername(String checkString){
        username = new UserName(checkString);
    }

    public boolean accessGiven(String accessUserName, String accessString){
        if (accessUserName.equals(username.getClass()) && accessString.equals(password.getClass()))
            return true;
        return false;
    }
}
