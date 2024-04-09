import retrofit2.Retrofit

object API {
    private const val BASE_URL = "https://ws.detectlanguage.com"

    private fun getRetrofit(): Retrofit{
        return Retrofit.Builder
    }
}