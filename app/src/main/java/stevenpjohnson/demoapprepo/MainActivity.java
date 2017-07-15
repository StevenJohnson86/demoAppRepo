package stevenpjohnson.demoapprepo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFn(View view){

        TextView helloVCS = (TextView) findViewById(R.id.helloView);

        Toast.makeText(this, "VCS = Git \nTODO: how are tests written for apps?", Toast.LENGTH_LONG).show();

        Log.i("Info", "****TextView helloView clicked!****");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
