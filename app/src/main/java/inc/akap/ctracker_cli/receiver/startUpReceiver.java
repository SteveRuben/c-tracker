package inc.akap.ctracker_cli.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import inc.akap.ctracker_cli.service.tracker;

public class startUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            intent = new Intent(context, tracker.class);
            context.startService(intent);
        }
    }
}
