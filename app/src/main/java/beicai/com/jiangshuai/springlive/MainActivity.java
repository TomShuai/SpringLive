package beicai.com.jiangshuai.springlive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"22222",Toast.LENGTH_LONG).show();

        Toast.makeText(MainActivity.this,"33333",Toast.LENGTH_LONG).show();

    }
}
