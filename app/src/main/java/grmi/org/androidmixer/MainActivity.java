package grmi.org.androidmixer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_TRACK = "grmi.org.androidmixer.TRACK";
    public final static String EXTRA_MIXTABLE = "grmi.org.androidmixer.MIXTABLE";

    private MixerController mixerController;
    private TracksListAdapter tlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mixerController = new MixerController();

        tlAdapter = new TracksListAdapter(this, mixerController);
        final ListView listView = (ListView) findViewById(R.id.lv_tracks);
        listView.setAdapter(tlAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showTrack(position);
            }
        });
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

    private void showTrack(int position)
    {
        Intent intent = new Intent(this, TrackActivity.class);
        intent.putExtra(EXTRA_TRACK, position);
        intent.putExtra(EXTRA_MIXTABLE, this.mixerController.getMixTable());
        startActivity(intent);
    }
}
