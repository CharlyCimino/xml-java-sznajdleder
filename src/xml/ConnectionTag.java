package xml;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class ConnectionTag {

    private String name;
    private String usr;
    private String pwd;
    private String url;
    private String driver;

    public String toString() {
        return name + ", " + usr + ", " + pwd + ", " + url + ", " + driver;
    }

    public String getName() {
        return name;
    }

    public String getUsr() {
        return usr;
    }

    public String getPwd() {
        return pwd;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
}
