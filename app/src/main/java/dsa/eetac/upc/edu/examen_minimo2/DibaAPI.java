package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mmica on 20/12/2018.
 */

public interface DibaAPI {
    //We specify the url
    String BASE_URL = "https://do.diba.cat/api/dataset/municipis/format/json/pag-ini/1/pag-fi/11";

    //We add the GET method to obtain the profile of the given user
    @GET("/")
    Call<Cities> cities( );

    //We add the GET method to obtain the followers of the user

    static DibaAPI createAPIRest() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(DibaAPI.class);
    }
}

