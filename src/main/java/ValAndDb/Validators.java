package ValAndDb;
import Tables.User;
import Tables.UserCRUD;

public class Validators
{
    private String error="";

    public void ValidatorCreate(String name, String username, String password, String password1)
    {

            User user=UserCRUD.getUser(name);
            if(user.getUsername()!=null || name.equals("") || username.equals("") || password.equals("") || password1.equals("")
            || name.length()>30 || username.length()>30 || password.length()>30 || password1.length()>30 || !password.equals(password1)) { error="Empty field, length bigger than 30 symbols, username taken or incorrect password field!"; }
    }

    public void ValidatorLogin(String name, String password)
    {
            User user=UserCRUD.getUser(name);
            if(user.getUsername()==null || name.equals("") || password.equals("") || name.length()>30 || password.length()>30 || !user.getPassword().equals(password)) { error="Empty field, no such user, wrong password or length bigger than 30 symbols!"; }
    }

    public String getError() { return error; }
    public void setError(String error) { this.error=error; }
}