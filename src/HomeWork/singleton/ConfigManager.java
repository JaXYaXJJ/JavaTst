package HomeWork.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private volatile static ConfigManager INSTANCE;

    public ConfigManager() {}

    private Map<String, String> configMap = new HashMap<>() {{

        put("host", "myServer.db");
        put("port", "8089");
        put("user", "admin");
        put("pass", "pa$$w0rd");
    }};

    public String update(String key, String value) {
        return configMap.put(key, value);
    }

    private String get(String key) {
        return configMap.get(key);
    }

    public static ConfigManager getInstance() {

        //Double Checked Loking

        if(INSTANCE == null) {

            synchronized (ConfigManager.class) {

                if(INSTANCE == null) {

                    INSTANCE = new ConfigManager();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {

        ConfigManager configManager = ConfigManager.getInstance();

        System.out.println(configManager.get("host"));

        configManager.update("pass", "newPassword");
        System.out.println(configManager.get("pass"));
    }
}
