public class  Users {
    public static final String TABLE_NAME = "users";

    public static final String COLUMN_ID = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_EMAIL = "email";

    private String username;
    private String password;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_PASSWORD + " TEXT,"
                    + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String setPassword(String password) {
        return password;
    }

}
