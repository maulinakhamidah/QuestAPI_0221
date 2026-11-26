/**
 * Container Dependency Injection untuk mengelola instance Retrofit dan Repository
 */
package com.example.pam_12.repositori

import android.app.Application
import com.example.pam_12.apiservice.ServiceApiSiswa
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface ContainerApp {
    val repositoryDataSiswa: RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp {
    // Gunakan IP Wi-Fi laptop agar bisa diakses dari HP fisik maupun Emulator
    private val baseurl = "http://192.168.1.9/umyTI/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseurl)
        .addConverterFactory(
            Json {
                ignoreUnknownKeys = true
                prettyPrint = true
                isLenient = true
            }.asConverterFactory("application/json".toMediaType())
        )
        .build()

    private val retrofitService: ServiceApiSiswa by lazy {
        retrofit.create(ServiceApiSiswa::class.java)
    }

    override val repositoryDataSiswa: RepositoryDataSiswa by lazy {
        JaringanRepositoryDataSiswa(retrofitService)
    }
}

class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}
