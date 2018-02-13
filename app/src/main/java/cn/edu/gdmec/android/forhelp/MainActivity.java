package cn.edu.gdmec.android.forhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    public void send(View view){
        Intent intent = new Intent (  );
        //定义广播的事件类型
        intent.setAction ( "Help_stitch" );
        //发送广播
        sendBroadcast ( intent );
    }
}
