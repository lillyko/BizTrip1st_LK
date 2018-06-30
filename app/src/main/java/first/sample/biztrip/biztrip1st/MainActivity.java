package first.sample.biztrip.biztrip1st;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonOnClick(android.view.View v){

        Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show();

    }

    public void ButtonOnClick2(android.view.View v){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }
}

