package uz.gita.infoapp_ks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Data extends AppCompatActivity {

    public static final String NUMBER = "number";
    private YouTubePlayerView youtube;

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        youtube = findViewById(R.id.youTube_player);
        getLifecycle().addObserver(youtube);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            int number = extra.getInt(NUMBER,0);
            loadData(number);
        }
        findViewById(R.id.btn_back).setOnClickListener(v -> {
            finish();
        });
    }

    private void loadData(int number) {
        ImageView image = findViewById(R.id.cityImage);
        TextView cityName = findViewById(R.id.cityName);
        TextView description = findViewById(R.id.description);
        switch (number){
            case 1: {
                image.setBackgroundResource(R.drawable.tashkent);
                cityName.setText("tashkent");
                description.setText(R.string.tashkent);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "2V-2ABkUREE";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 2: {
                image.setBackgroundResource(R.drawable.paris);
                cityName.setText("paris");
                description.setText(R.string.paris);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "GljTvdEDqJM";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 3: {
                image.setBackgroundResource(R.drawable.rome);
                cityName.setText("rome");
                description.setText(R.string.rome);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "5DcA4BePBdA";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 4: {
                image.setBackgroundResource(R.drawable.moscow);
                cityName.setText("moscow");
                description.setText(R.string.moscow);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "rpvGROOPo8c";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 5: {
                image.setBackgroundResource(R.drawable.washington);
                cityName.setText("washington");
                description.setText(R.string.washington);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "ta1Z9TRPxbI";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 6: {
                image.setBackgroundResource(R.drawable.singapore);
                cityName.setText("singapore");
                description.setText(R.string.singapore);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Yr84hTa-YMo";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 7: {
                image.setBackgroundResource(R.drawable.berlin);
                cityName.setText("berlin");
                description.setText(R.string.berlin);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "l7l8C9SzvqE";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 8: {
                image.setBackgroundResource(R.drawable.london);
                cityName.setText("london");
                description.setText(R.string.london);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "VxMHHqSOSTk";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 9: {
                image.setBackgroundResource(R.drawable.seoul);
                cityName.setText("seoul");
                description.setText(R.string.seoul);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "eVFMDMpY36o";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
            case 10: {
                image.setBackgroundResource(R.drawable.oslo);
                cityName.setText("oslo");
                description.setText(R.string.oslo);
                youtube.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "BKRSu2q3YyU";
                        youTubePlayer.cueVideo(videoId, 0);
                    }
                });
                break;
            }
        }
    }
}