package first.sample.biztrip.biztrip1st;

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
}
