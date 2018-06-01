package INTERNSHIP;

class UserName {
    private static String UN;
    UserName( String username) {
        if ((username.length() >= 8) && (username.length() <= 21)) {
            UN = username;
        }
    }

    public String getUserName(){
            return UN;
        }
}

