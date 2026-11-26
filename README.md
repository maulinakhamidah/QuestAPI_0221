# QuestAPI_0221 - Aplikasi Data Siswa Berbasis REST API

Proyek Praktikum Pengembangan Aplikasi Mobile (PAM) Pertemuan 12: Integrasi REST API Menggunakan Retrofit 2 dan Kotlinx Serialization.

## Identitas Mahasiswa
* **Nama**: Maulina Khamidah
* **NIM**: 20240140221
* **Kelas**: C
* **Mata Kuliah**: Pengembangan Aplikasi Mobile (PAM)

## Fitur Aplikasi
1. **Daftar Siswa (Home Screen)**: Menampilkan seluruh data siswa yang diambil dari REST API backend (`bacaTeman.php`). Dilengkapi state penanganan loading, error, dan tombol retry.
2. **Tambah Siswa (Entry Screen)**: Formulir input data siswa baru (Nama, Alamat, Telepon) yang dikirim ke backend (`insertTM.php`) dengan validasi form.
3. **Navigasi Jetpack Compose**: Alur perpindahan antar halaman menggunakan NavHost terstruktur.

## Arsitektur Aplikasi (MVVM)
* **Model**: `DataSiswa` (anotasi `@Serializable`)
* **API Service**: `ServiceApiSiswa` (Retrofit HTTP GET & POST)
* **Repository**: `RepositoryDataSiswa` & `JaringanRepositoryDataSiswa`
* **Dependency Injection**: `ContainerApp`, `DefaultContainerApp`, dan `AplikasiDataSiswa`
* **ViewModel**: `HomeViewModel`, `EntryViewModel`, dan `PenyediaViewModel` (Factory)
* **UI**: Jetpack Compose Material 3 (`HomeScreen`, `EntrySiswaScreen`, `PetaNavigasi`)

## Konfigurasi Server Backend
* **Base URL**: `http://10.0.2.2/umyTI/` (Akses localhost XAMPP dari Android Emulator)
* **Cleartext Traffic**: Diizinkan melalui `android:usesCleartextTraffic="true"` pada `AndroidManifest.xml`.
