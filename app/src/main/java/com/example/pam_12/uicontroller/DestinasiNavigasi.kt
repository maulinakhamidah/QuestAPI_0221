package com.example.pam_12.uicontroller

interface DestinasiNavigasi {
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = "Daftar Siswa"
}

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = "Tambah Siswa"
}
