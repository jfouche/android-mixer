package grmi.org.androidmixer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAdd(View view)
    {
        Log.d(TAG, "onAdd()");
    }

    public void onRecord(View view)
    {
        Log.d(TAG, "onRecord()");

    }

    public void onPlay(View view)
    {
        Log.d(TAG, "onPlay()");

    }
}
