package uz.gita.infoapp_ks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tashkent).setOnClickListener(view -> onClick(1));
        findViewById(R.id.paris).setOnClickListener(view -> onClick(2));
        findViewById(R.id.rome).setOnClickListener(view -> onClick(3));
        findViewById(R.id.moscow).setOnClickListener(view -> onClick(4));
        findViewById(R.id.washington).setOnClickListener(view -> onClick(5));
        findViewById(R.id.singapore).setOnClickListener(view -> onClick(6));
        findViewById(R.id.berlin).setOnClickListener(view -> onClick(7));
        findViewById(R.id.london).setOnClickListener(view -> onClick(8));
        findViewById(R.id.seoul).setOnClickListener(view -> onClick(9));
        findViewById(R.id.oslo).setOnClickListener(view -> onClick(10));
        findViewById(R.id.info).setOnClickListener(view -> startActivity(new Intent(this, PPActivity.class)));

    }

    private void onClick(int number){
        Intent intent = new Intent(this, Data.class);
        intent.putExtra(Data.NUMBER,number);
        startActivity(intent);
    }
}