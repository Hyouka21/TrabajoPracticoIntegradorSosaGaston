package com.sosa.trabajopracticointegradorsosagaston;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class UsbConectado extends BroadcastReceiver {


    public UsbConectado() {
        ;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getExtras().getBoolean("connected")) {
            Toast.makeText(context, "Entro usb", Toast.LENGTH_SHORT).show();
            Intent llamada = new Intent(Intent.ACTION_CALL);
            llamada.setData(Uri.parse("tel:911"));
            context.startActivity(llamada);
        }
    }
}
