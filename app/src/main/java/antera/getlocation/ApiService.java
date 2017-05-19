package antera.getlocation;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Fajar on 5/19/2017.
 */

public interface ApiService {
    @Multipart
    @POST("postlokasi.php")
    Call<ResponseBody> postlokasi(@Part("id_driver") RequestBody id_driver,
                                @Part("lat") RequestBody lat,
                                @Part("long") RequestBody lng);
}
