package udck.rendom.orderbreakfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mainUsername;
    TextView homTitle;
    TextView homTitle1;
    TextView homTitle2;
    TextView homTitle3;
    TextView homTitle4;
    TextView homTitle5;
    ImageView mainProfileImg;
    TextView txtDanhSach;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainProfileImg = findViewById(R.id.mainProfileUsername);
        mainUsername = findViewById(R.id.mainUsername);
        homTitle = findViewById(R.id.homTitle);
        homTitle1 = findViewById(R.id.homTitle1);
        homTitle2 = findViewById(R.id.homTitle2);
        homTitle3 = findViewById(R.id.homTitle3);
        homTitle4 = findViewById(R.id.homTitle4);
        homTitle5 = findViewById(R.id.homTitle5);
        txtDanhSach = findViewById(R.id.txtDanhSach);

        txtDanhSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.ListViewMonAn.class));
                startActivity(intent);
            }
        });
        homTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity1.class));
                startActivity(intent);
            }
        });
        homTitle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity2.class));
                startActivity(intent);
            }
        });
        homTitle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity3.class));
                startActivity(intent);
            }
        });
        homTitle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity4.class));
                startActivity(intent);
            }
        });
        homTitle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity5.class));
                startActivity(intent);
            }
        });
        homTitle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, udck.rendom.orderbreakfast.DetailActivity6.class));
                startActivity(intent);
            }
        });


        mainProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this,  udck.rendom.orderbreakfast.LogoutProfile.class));
                startActivity(intent);
            }
        });



        //  showUserData();

        showProfileData();

    }

    private void showProfileData() {

        Intent intent = getIntent();
        String mMainUsername = intent.getStringExtra("username");
        mainUsername.setText(mMainUsername);
    }
}
