package inc.akap.ctracker_cli.utils;


import inc.akap.ctracker_cli.remote.ApiService;
import inc.akap.ctracker_cli.remote.RetrofitClient;

public class ApiUtils {
    public static final String BASE_URL = "http://ctracker.akap.online/";

    private ApiUtils() {
    }

    public static ApiService getApiService() {
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }

    public static ApiService getApiService(String token) {
        return RetrofitClient.getAuthenticatedClient(BASE_URL, token).create(ApiService.class);
    }
}
