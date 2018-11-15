package com.ismailhakkiaydin.vibration;

import android.content.Context;
import android.os.Vibrator;

public class Vibration {

    private Context c;

    public Vibration(Context context) {
        this.c = context;
    }

    public void Vibrate(){
        Vibrator v=(Vibrator) c.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(2000);
    }

    public void Vibrate2(){
        Vibrator v=(Vibrator) c.getSystemService(Context.VIBRATOR_SERVICE);
        long patern [] = {1000,3000,2000,1000};
        v.vibrate(patern,3);
    }

}
