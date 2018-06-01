package INTERNSHIP;

public class lecture {
    private String name;
    private String time;
    private String code;
    private String place;

    lecture(String name, String time, String code, String place){
        this.name = name;
        this.time = time;
        this.code= code;
        this.place = place;
    }
    public String getPlace(){
        return place;
    }
    public void setTime(String time){
        this.time = time;
    }
    public void setPlace(String place){
        this.place = place;
    }
}
