package interno.play.video.josedlujan.ejemplo.com.ejemplovideointerno;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Uri uri = Uri.parse(); //Declare your url here.

        VideoView view = (VideoView)findViewById(R.id.video);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.small;
        view.setVideoURI(Uri.parse(path));
        view.start();
       /* Uri uri = Uri.parse(
                Environment.getExternalStorageDirectory().getAbsolutePath()+"small");
        VideoView mVideoView  = (VideoView)findViewById(R.id.video);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();*/
    }
}
