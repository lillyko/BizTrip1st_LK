package first.sample.biztrip.biztrip1st;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButtonClick(android.view.View v){
        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();
    }

}
