package inducesmile.com.androidrecyclerviewgridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
/**DONE*/
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.depLat.setText(Double.toString(itemList.get(position).getDepartureLatitude()));
        holder.depLong.setText(Double.toString(itemList.get(position).getDepartureLongitude()));
        holder.depLoc.setText(itemList.get(position).getDepartureLocation());
        holder.sDate.setText(itemList.get(position).getSearchDate());
        holder.arrLoc.setText(itemList.get(position).getArrivalLocation());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
