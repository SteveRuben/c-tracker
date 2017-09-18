package inc.akap.ctracker_cli.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import inc.akap.ctracker_cli.Application;
import inc.akap.ctracker_cli.remote.ApiService;
import inc.akap.ctracker_cli.utils.ApiUtils;

public class tracker extends Service {
    // retrofit example
    private ApiService apiService;
    private String token;
    public tracker() {
        token = getApplication().getSharedPreferences(Application.PREFS_NAME,0).getString(Application.TOKEN,null);
        if (token.isEmpty()) apiService = ApiUtils.getApiService();
        else apiService = ApiUtils.getApiService(token);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
