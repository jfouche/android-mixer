package grmi.org.androidmixer;

import android.media.MediaRecorder;
import android.util.Log;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class MicRecorder {

    private static final String LOG_TAG = MicRecorder.class.toString();

    private MediaRecorder recorder = null;

    public MicRecorder()
    {
    }

    public void start(File file)
    {
        this.recorder = new MediaRecorder();
        this.recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        this.recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        this.recorder.setOutputFile(file.getAbsolutePath());
        this.recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        try {
            this.recorder.prepare();
        } catch (IOException e) {
            Log.e(LOG_TAG, "prepare() failed");
        }
        this.recorder.start();
    }

    public void stop()
    {
        this.recorder.stop();
        this.recorder.release();
    }
}
