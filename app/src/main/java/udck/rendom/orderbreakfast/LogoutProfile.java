package udck.rendom.orderbreakfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogoutProfile extends AppCompatActivity {
    TextView mainUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainUsername = findViewById(R.id.mainUsername);
        setContentView(R.layout.activity_logout_profile);


        Button logoutBack= findViewById(R.id.logoutBack);
        Button logoutLogout = findViewById(R.id.logoutLogout);


        logoutBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(LogoutProfile.this, MainActivity.class));
                startActivity(intent);
            }
        });

        logoutLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(LogoutProfile.this, SignupActivity.class));
                startActivity(intent);
            }
        });


    }
    private void showProfileData() {

        Intent intent = getIntent();
        String mMainUsername = intent.getStringExtra("username");
        mainUsername.setText(mMainUsername);
    }
}