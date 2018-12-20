package dsa.eetac.upc.edu.examen_minimo2;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private DibaAPI myapirest;
    private City city;
    private RecyclerView recyclerView;

    public String message;
    ImageView ivImageFromUrl;
    private String token;

    TextView textViewFollowing;
    TextView textViewRepos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerView );
        city = new City( this );
        recyclerView.setAdapter( city );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        getCities();
    }

    private void getCities() {
        //showProgress(true);
        Call<Cities> callCitiesList = myapirest.cities();
        callCitiesList.enqueue( new Callback<Cities>() {
            @Override
            public void onResponse(Call<Cities> call, Response<Cities> response) {
                int statusCode = response.code();
                if (response.isSuccessful()) {
                    Cities cities = response.body();
                    List<Element> element = cities.getElements();
                    city.AddCity( element );
                    //showProgress(false);
                }
            }

            @Override
            public void onFailure(Call<Cities> call, Throwable t) {
                Log.e( "No api connection: ", t.getMessage() );

                //Show the alert dialog
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( MainActivity.this );

                alertDialogBuilder
                        .setTitle( "Error" )
                        .setMessage( t.getMessage() )
                        .setCancelable( false )
                        .setPositiveButton( "OK", (dialog, which) -> finish() );

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        } );
    }
}
