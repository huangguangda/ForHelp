package cn.edu.gdmec.android.forhelp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        /*throw new UnsupportedOperationException ( "Not yet implemented" );*/

        Log.i ( "MyBroadcastReceiver","自定义的广播接收者，收到了求救广播事件" );
        Log.i ( "MyBroadcastReceiver", intent.getAction () );

    }
}
