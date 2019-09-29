package kersh.wael.waelkersh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityscreen1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.wael,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.itrmynet)
        {
            Intent intent= new Intent (this,screen1.class);
            startActivity(intent);
        }
        if ((item.getItemId()==R.id.itrmynet)){
            Toast.makeText(this ,"ynet",Toast.LENGTH_SHORT ).show();;

            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ynet.co.il"));     }


    return true;
    }
}
