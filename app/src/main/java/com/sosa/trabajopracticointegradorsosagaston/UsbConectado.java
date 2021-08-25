package com.sosa.trabajopracticointegradorsosagaston;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class UsbConectado extends BroadcastReceiver {
    MainActivity mn ;

    public UsbConectado(MainActivity mn) {
        this.mn = mn;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getExtras().getBoolean("connected")) {
            Toast.makeText(context, "Entro usb", Toast.LENGTH_SHORT).show();
            mn.llamar();
        }
    }
}
