package com.example.pam_12.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String
)
