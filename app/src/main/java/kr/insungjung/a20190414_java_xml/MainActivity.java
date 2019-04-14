package kr.insungjung.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("메인-onCreate테스트","정말 실행되나?"); // d - debug
        Log.e("메인-e로그","어떻게 나오나?"); // e - error
    }
}
