package INTERNSHIP;

import java.util.ArrayList;

public class students {


        private ArrayList<String> list_of_students;
        private ArrayList<String> UserNames_of_students;

        students() {
            list_of_students = null;
            UserNames_of_students = null;
        }

        public ArrayList<String> getList_of_teachers() {
            return list_of_students;
        }

        public void setList_of_teachers(ArrayList<String> list_of_teachers) {
            this.list_of_students = list_of_teachers;
        }

        public void add(String name) {
            if (!list_of_students.contains(name)) {
                list_of_students.add(name);
            }
        }
        private void allUserNamesofTeachers(String userName){
            UserNames_of_students.add(userName);
        }

        private boolean checkWhetherUserNameIsPossible(String userName){
            return UserNames_of_students.contains(userName);
        }

    }


