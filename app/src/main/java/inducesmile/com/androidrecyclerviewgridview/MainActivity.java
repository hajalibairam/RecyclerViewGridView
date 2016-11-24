package inducesmile.com.androidrecyclerviewgridview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends ActionBarActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);

//        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(topToolBar);
//        topToolBar.setLogo(R.drawable.logo);
//        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(MainActivity.this, 2);


        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_refresh){
            Toast.makeText(MainActivity.this, "Refresh App", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

//        Map<String,String> mMap = new HashMap<>();
//        mMap.put("departureLocationLatitude","30.7333148");
//        mMap.put("departureLocationLongitude","76.7794179");
//        mMap.put("departureLocation","Chandigarh, India");
//        mMap.put("searchDate","1479190891000");
//        mMap.put("arrivalLocation","LAX Terminal ");
//
//
//        JSONArray jsArray = new JSONArray("")

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject(30.7333148,76.7794179,"Chandigarh, India","1479190891000","LAX Terminal "));
        allItems.add(new ItemObject(23.23434534,6.2345279,"Baku, Azerbaijan","1479190891000","LAX Terminal "));
        allItems.add(new ItemObject(33.44444,45.45677,"Tehran, Iran","1479190891000","LAX Terminal "));
        allItems.add(new ItemObject(35.41627,46.615774,"Paris, French","1479190891000","LAX Terminal "));
        allItems.add(new ItemObject(11.166316,96.644648,"Rome, Italy","1479190891000","LAX Terminal "));
        return allItems;
    }
}

//
//"departureLocationLatitude": 30.7333148,
//        "departureLocationLongitude": 76.7794179,
//        "departureLocation": "Chandigarh, India",
//        "searchDate": 1479190891000,
//        "arrivalLocation": "LAX Terminal "