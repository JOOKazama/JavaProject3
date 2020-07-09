package Tables;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity @Table(name="\"User\"")
public class User implements java.io.Serializable
{
    @Column(name="username", unique=true, nullable=false) @Id private String username;
    @Column(name="name") private String name;
    @Column(name="password") private String password;
    @Column(name="city") private String city;
    @Column(name="com") private int com;
    @Column(name="cre") private int cre;
    @Column(name="css") private int css;
    @Column(name="description") private String description;
    @Column(name="email") private String email;
    @Column(name="html") private int html;
    @Column(name="java") private int java;
    @Column(name="job") private String job;
    @Column(name="street") private String street;
    @Column(name="team") private int team;
    @Column(name="tel") private String tel;
    @Column(name="js") private int js;

    public String getCity() { return city; }
    public void setCity(String city) { this.city=city; }
    public int getCom() { return com; }
    public void setCom(int com) { this.com=com; }
    public int getCre() { return cre; }
    public int getJs() { return js; }
    public void setJs(int js) { this.js=js; }
    public void setCre(int cre) { this.cre=cre; }
    public int getCss() { return css; }
    public void setCss(int css) { this.css=css; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description=description; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email=email; }
    public int getHtml() { return html; }
    public void setHtml(int html) { this.html=html; }
    public int getJava() { return java; }
    public void setJava(int java) { this.java=java; }
    public String getJob() { return job; }
    public void setJob(String job) { this.job=job; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street=street; }
    public int getTeam() { return team; }
    public void setTeam(int team) { this.team=team; }
    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel=tel; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username=username; }
    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password=password; }
}