package project;

public class AppGlobalState {

    private static AppGlobalState instanse;

    private String cityKey;

    public String getCityKey() {
        return cityKey;
    }

    public void setCityKey(String cityKey) {
        this.cityKey = cityKey;
    }

    public String getApiKey() {
        //return System.getenv("ACCUWEATHER_API_KEY");
        return "GFrf3yO3in39db33JQOWBSFMon4EDdg8";
    }

    private AppGlobalState(){}

    public static AppGlobalState getInstance() {
        if (instanse == null) {
            instanse = new AppGlobalState();
        }
        return instanse;
    }
}
