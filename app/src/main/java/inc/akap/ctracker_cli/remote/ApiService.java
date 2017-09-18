package inc.akap.ctracker_cli.remote;

import inc.akap.ctracker_cli.model.Action;
import inc.akap.ctracker_cli.model.LoginResponse;
import inc.akap.ctracker_cli.model.Person;
import inc.akap.ctracker_cli.model.RecordedPoint;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiService {
    @GET("/me/point")
    Call<RecordedPoint> getPoints();

    @POST("/login")
    Call<LoginResponse> login(@Body Person person);

    @PUT
    Call<String> updateProfil(@Body Person person);

    @POST
    Call<String> actionComplete(@Body Action action);
}
