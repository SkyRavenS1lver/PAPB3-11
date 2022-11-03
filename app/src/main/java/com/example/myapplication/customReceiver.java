package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class customReceiver extends BroadcastReceiver {
    private final static String ACTION_CUSTOM_BROADCAST = "action-custom-broadcast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String intentAction = intent.getAction();
        if (intentAction != null)
        {String toastMessage = "unkwon";
        switch (intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                toastMessage = "power connected";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                toastMessage = "power disconnected";
                break;
            case ACTION_CUSTOM_BROADCAST:
                toastMessage = "HALO";
                break;
        }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }

//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
