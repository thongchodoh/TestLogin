package sdu.cs58.wipawee.testlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //ประกาศตัวแปล
    EditText usernameEditText, passwoedEditText;
    Button loginButton;
    String userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ผูกตัวแปล
        usernameEditText = findViewById(R.id.txtUser);
        passwoedEditText = findViewById(R.id.txtpass);
        loginButton = findViewById(R.id.bntLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userString = usernameEditText.getText().toString().trim();
                passString = passwoedEditText.getText().toString().trim();

                if ((userString.length() == 0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลทุกช่อง", Toast.LENGTH_SHORT).show();
                }
                if (passString.equals("1234")) {

                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    mainIntent.putExtra("userString", userString);
                    startActivity(mainIntent);
                }else {
                    Toast.makeText(getApplicationContext(), "Password ไม่ถูกต้องกรุณาใส่ข้อมูลใหม่", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
