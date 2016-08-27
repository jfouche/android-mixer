package grmi.org.androidmixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        Intent intent = getIntent();
        MixTable mixTable = (MixTable) intent.getSerializableExtra(MainActivity.EXTRA_MIXTABLE);
        int position = intent.getIntExtra(MainActivity.EXTRA_TRACK, 0);

        Track track = mixTable.getTracks().get(position);

        TextView tvFileName = (TextView) findViewById(R.id.txtFileName);
        tvFileName.setText(track.getFile().getAbsolutePath());
    }
}
