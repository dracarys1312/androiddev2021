package vn.edu.usth.weather;

import vn.edu.usth.weather.model.DayForecast;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public RecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView forecast;
        private TextView date;
        private TextView temperature;
        private ImageView icon;
        public ItemViewHolder( View itemView) {
            super(itemView);
            date = (TextView) itemView.findViewById(R.id.date);
            forecast = (TextView) itemView.findViewById(R.id.forecast);
            temperature = (TextView) itemView.findViewById(R.id.temperature);
            icon = (ImageView) itemView.findViewById(R.id.icon);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:

            default:

                View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.row_layout, viewGroup, false);

                return new ItemViewHolder((layoutView));
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int viewType = getItemViewType(i);
        switch (viewType) {
            case TYPE:
            default:

                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;

                DayForecast dayForecast = (DayForecast) listRecyclerItem.get(i);
                int drawableResourceId = context.getResources().getIdentifier(dayForecast.getIcon(), "drawable", context.getPackageName());

                itemViewHolder.date.setText(dayForecast.getDate());
                itemViewHolder.forecast.setText(dayForecast.getForecast());
                itemViewHolder.temperature.setText(dayForecast.getTemperature());
                itemViewHolder.icon.setImageResource(drawableResourceId);

        }

    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}