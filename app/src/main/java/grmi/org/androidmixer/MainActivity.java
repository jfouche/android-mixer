package grmi.org.androidmixer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private MixerController mixerController;
    private TracksListAdapter tlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mixerController = new MixerController();

        tlAdapter = new TracksListAdapter(this, mixerController);
        ListView listView = (ListView) findViewById(R.id.lv_tracks);
        listView.setAdapter(tlAdapter);
    }

    public void onRecord(View view)
    {
        mixerController.record();
        tlAdapter.notifyDataSetChanged();
    }

    public void onStopRecord(View view)
    {
        mixerController.stop();
    }
}
