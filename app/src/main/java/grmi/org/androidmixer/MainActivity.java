package grmi.org.androidmixer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TracksListAdapter tlAdapter = new TracksListAdapter(this);
        ListView listView = (ListView) findViewById(R.id.lv_tracks);
        listView.setAdapter(tlAdapter);
    }
}
