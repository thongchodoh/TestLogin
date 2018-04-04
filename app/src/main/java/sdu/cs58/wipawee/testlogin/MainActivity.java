package sdu.cs58.wipawee.testlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปล
    TextView userTextView;
    String userString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userTextView = findViewById(R.id.txvUser);

        userString = getIntent().getStringExtra("userString");

        userTextView.setText("ยินดีต้อนรับ"+ userString);
    }
    public void clickLink(View view) {
        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse("https://www.facebook.com/Jakyueunhae"));
        startActivity(linkIntent);
    }
}
