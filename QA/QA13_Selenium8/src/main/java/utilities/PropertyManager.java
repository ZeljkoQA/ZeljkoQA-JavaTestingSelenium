package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String login_email;
    private static String login_password;


    public static PropertyManager getInstance(){
        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        login_email = properties.getProperty("login_email");
        login_password = properties.getProperty("login_password");

        return instance;
    }
    public static void changeProperty(String key, String value) {
        Properties editProp = new Properties();
        try {
            FileInputStream editFi = new
                    FileInputStream("src/main/resources/configuration.properties");
            editProp.load(editFi);
            editProp.setProperty(key, value);
            editProp.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getUrl(){
        return url;
    }
    public String getLogin_email(){
        return login_email;
    }
    public String getLogin_password() {
        return login_password;
    }
}
