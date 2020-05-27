package sg.edu.rp.c346.id18011651.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvAnswer;
    String output="";
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvAnswer=findViewById(R.id.textView);
        btnBack=findViewById(R.id.buttonBack);
        Intent intentReceived=getIntent();
        String code= intentReceived.getStringExtra("Code");
        String name= intentReceived.getStringExtra("Name");
        Integer year= intentReceived.getIntExtra("Year",0);
        Integer sem= intentReceived.getIntExtra("Semester",0);
        Integer credit= intentReceived.getIntExtra("Credit",0);
        String venue= intentReceived.getStringExtra("Venue");
        output=String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s",code,name,year,sem,credit,venue);
        tvAnswer.setText(output);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
