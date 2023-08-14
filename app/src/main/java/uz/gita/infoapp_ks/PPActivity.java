package uz.gita.infoapp_ks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppactivity);
        findViewById(R.id.imageButton).setOnClickListener(v -> finish());

        TextView textView = findViewById(R.id.link);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}