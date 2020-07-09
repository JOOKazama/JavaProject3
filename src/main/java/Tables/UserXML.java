package Tables;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(namespace="de.vogella.xml.jaxb.model")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserXML
{
    @XmlElementWrapper(name="list")
    @XmlElement(name="user")
    private ArrayList<User>users=new ArrayList<>();

    public UserXML() {}
    public void add(User user) { this.users.add(user); }
    public ArrayList<User>getUsers() { return users; }
    public void setUsers(ArrayList<User>users) { this.users=users; }
}