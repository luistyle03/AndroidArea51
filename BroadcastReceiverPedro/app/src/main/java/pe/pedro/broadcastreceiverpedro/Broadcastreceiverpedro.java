package pe.pedro.broadcastreceiverpedro;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.BoolRes;
import android.widget.Toast;

/**
 * Created by alumno on 9/09/16.
 */
public class Broadcastreceiverpedro extends BroadcastReceiver{

    public final static String ACTION_BUTTON_CLICKED="pe.pedro.Broadcastreceiverpedro.BUTTON_CLICKED";
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction()!=null) {
            final String mensaje;
            switch (intent.getAction()){
                case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                    //state es un valor constante, cheuear la documentacion de android developer
                    final boolean cambioAmodoAVION= intent.getBooleanExtra("state",false);
                    if(cambioAmodoAVION){
                        mensaje=context.getString(R.string.airplane_mode_on);
                    }else{
                        mensaje=context.getString(R.string.airplane_mode_off);
                    }
                    break;
                case ACTION_BUTTON_CLICKED:
                    mensaje=context.getString(R.string.button_clicked);
                    break;
                default:
                    mensaje="";
            }
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
        }





    }
}
