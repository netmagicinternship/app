package INTERNSHIP;

import java.util.ArrayList;

class teachers {
    private ArrayList<String> list_of_teachers;
    private ArrayList<String> UserNames_of_Teachers;

    teachers() {
        list_of_teachers = null;
        UserNames_of_Teachers = null;

    }

    public ArrayList<String> getList_of_teachers() {
        return list_of_teachers;
    }

    public void setList_of_teachers(ArrayList<String> list_of_teachers) {
        this.list_of_teachers = list_of_teachers;
    }

    public void add(String name) {
        if (!list_of_teachers.contains(name)) {
            list_of_teachers.add(name);
        }
    }
    private void allUserNamesofTeachers(String userName){
        UserNames_of_Teachers.add(userName);
    }

    private boolean checkWhetherUserNameIsPossible(String userName){
        return UserNames_of_Teachers.contains(userName);
    }

}
