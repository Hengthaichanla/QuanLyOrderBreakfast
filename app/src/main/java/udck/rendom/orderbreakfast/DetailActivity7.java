package udck.rendom.orderbreakfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail7);
        Button btnSua = findViewById(R.id.btnSua);
        Button btnXoa = findViewById(R.id.btnxoa);
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(DetailActivity7.this, SuaActivity.class));
                startActivity(intent);
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(DetailActivity7.this, XoaActivity.class));
                startActivity(intent);
            }
        });
    }
}