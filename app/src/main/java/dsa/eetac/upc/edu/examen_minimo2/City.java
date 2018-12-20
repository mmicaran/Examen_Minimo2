package dsa.eetac.upc.edu.examen_minimo2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmica on 20/12/2018.
 */

public class City extends RecyclerView.Adapter<City.ViewHolder> {
    private List<Element> data;
    private Context context;

    public void AddCity (List<Element> cityList) {
        data.addAll(cityList);
        notifyDataSetChanged();
    }

    //Asign the text TextView to the text1 in the layout
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cityName;
        private TextView cityIne;
        private ImageView photoCity;

        public ViewHolder(View v) {
            super(v);
            cityName = v.findViewById(R.id.cityName);
            cityIne = v.findViewById(R.id.cityIne);
            photoCity = v.findViewById(R.id.photoCity);
        }
    }

    //Constructor
    public City(Context context) {
        this.context = context;
        this.data = new ArrayList<>();
    }

    @Override
    public City.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(City.ViewHolder holder, int position) {
        Element element = data.get(position);
        holder.cityName.setText(element.getMunicipiNom());
        holder.cityIne.setText( element.getIne());

        Picasso.with(context).load(element.getMunicipiEscut()).into(holder.photoCity);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
