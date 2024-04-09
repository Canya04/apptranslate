package campalans.m8.apptranslate

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @GET("/0.2/languages")
    suspend fun getLanguages(): Response<List<Language>>

    @Headers("Authorization: Bearer 84763d4d3fd60cc010f64d7cd6b01ec1")
    @FormUrlEncoded
    @POST("/0.2/detect")
    suspend fun getTextLanguage(@Field("q")text:String):Response<DetectionResponse>

}