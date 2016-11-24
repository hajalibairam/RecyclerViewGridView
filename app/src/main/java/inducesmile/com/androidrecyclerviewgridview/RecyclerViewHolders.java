package inducesmile.com.androidrecyclerviewgridview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
/**DONE*/
    public TextView depLat;
    public TextView depLong;
    public TextView depLoc;
    public TextView sDate;
    public TextView arrLoc;



    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        depLat = (TextView)itemView.findViewById(R.id.lat_text_view);
        depLong = (TextView)itemView.findViewById(R.id.long_text_view);
        depLoc = (TextView)itemView.findViewById(R.id.dep_loc_text_view);
        sDate = (TextView)itemView.findViewById(R.id.search_date_text_view);
        arrLoc = (TextView)itemView.findViewById(R.id.arr_loc_text_view);

        depLat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),  v.getContext().getText(getPosition()),Toast.LENGTH_SHORT).show();
            }
        });
    }
/***/


    @Override
    public void onClick(View view) {
//        Toast.makeText(view.getContext(), "Clicked Country Position = " + view.getContext().getText(getPosition()), Toast.LENGTH_SHORT).show();
    }
}


//
//"departureLocationLatitude": 30.7333148,
//        "departureLocationLongitude": 76.7794179,
//        "departureLocation": "Chandigarh, India",
//        "searchDate": 1479190891000,
//        "arrivalLocation": "LAX Terminal "