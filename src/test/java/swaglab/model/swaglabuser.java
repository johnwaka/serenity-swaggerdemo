package swaglab.model;

public enum swaglabuser {
    STANDARDUSER("standard_user","secret_sauce"), LOCKEDUSER("locked_out_user","secret_sauce" );
    public final String username;
    public final String password;
      swaglabuser(String username, String password){
          this.username = username;
          this.password = password;
      }
}
