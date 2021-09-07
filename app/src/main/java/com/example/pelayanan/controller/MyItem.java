package com.example.pelayanan.controller;

import java.io.OptionalDataException;

public class MyItem {

    public static String[] topSub = new String[]{
            "Konversi, Pengakuan dan Penegasan Hak",
            "Pemberian Hak Milik Perorangan",
            "Pemberian Hak Milik Badan Hukum",
            "Pemberian Hak Guna Bangunan Perorangan",
            "Pemberian Hak Guna Bangunan Badan Hukum",
            "Pemberian Hak Pakai Perorangan WNI",
            "Pemberian Hak Pakai Perorangan WNA",
            "Pemberian Hak Pakai Badan Hukum Indonesia",
            "Pemberian Hak Pakai Badan Hukum Asing",
            "Pemberian Hak Pakai Instansi Pemerintah",
            "Pemberian Hak Pakai Pemerintah Asing",
            "Pemberian Hak Pengelolaan Instansi Pemerintah/Pemda/BUMN/BUMD",
            "Wakaf Dari Tanah Belum Bersertifikat",
            "Wakaf Dari Tanah Negara (Pemberian Hak Tanah Pribadi)",
            "P3MB/Prk.5",
            "Pendaftaran Hak Milik Atas Satuan Rumah Susun",
            "Pemberian Hak Guna Usaha Perorangan",
            "Pemberian Hak Guna Usaha Badan Hukum",
            "Peralihan Hak Jual-Beli Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Pewarisan/Wasiat Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Tukar/Menukar Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Hibah Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Pembagian Hak Bersama Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Lelang Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Pemasukan Ke Dalam Perusahaan Atas Hak Tanah dan Satuan Rumah Susun",
            "Peralihan Hak Merger Atas Hak Tanah dan Satuan Rumah Susun",
            "Ganti Nama Sertifikat Hak Atas Tanah dan Hak Milik Rumah Susun",
            "Perpanjangan Jangka Waktu Hak Guna Usaha/Hak Guna Bangunan/Hak Pakai",
            "Perpanjangan Hak Milik Atas Satuan Rumah Susun",
            "Pembaruan Hak Guna Bangunan Perorangan Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Guna Bangunan Badan Hukum Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Pakai Perorangan WNI Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Pakai Perorangan WNA Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak PengelolaanPembaruan Hak Pakai Perorangan WNA Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Pakai Badan Hukum Indonesia Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Pakai Badan Hukum Asing Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Pakai Pemerintah Asing Atas Hak Guna Bangunan/Hak Pakai dan Pemberian Hak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan",
            "Pemberian Hak Guna Bangunann/Hak Pakai Di Atas Hak Pengelolaan",
            "Pembaruan Hak Guna Usaha Perorangan",
            "Pembaruan Hak Guna Usaha Badan Hukum",
            "Wakaf Dari Tanah Yang Sudah Bersertifikat",
            "Perubahan Hak Atas Tanah",
            "Pemecahan/Pemisahan Bidang Tanah Perorangan",
            "Pemecahan/Pemisahan Bidang Tanah Badan Hukum",
            "Penggabungan Bidang Tanah Perorangan",
            "Penggabungan Bidang Tanah Badan Hukum",
            "Sertifikat Pengganti Karena Blanko Lama Pada Hak Atas Tanah, Hak Milik Atas Rumah Susun, Dan Hak Tanggungan",
            "Sertifikat Pengganti Karena Hilang Pada Hak Atas Tanah, Hak Milik Atas Rumah Susun, Dan Hak Tanggungan",
            "Sertifikat Pengganti Karena Rusak Pada Hak Atas Tanah, Hak Milik Atas Rumah Susun, Dan Hak Tanggungan",
            "Pendaftaran Hak Tanggungan",
            "Penghapusan Hak Tanggungan/Roya",
            "Peralihan Hak Tanggungan/Cessie",
            "Subrogasi (Perubahan Kreditur)",
            "Blokir Pencatatan Dan Informasi Pertanahan",
            "Sita Pencatatan Dan Informasi Pertanahan",
            "Pengangkatan Sita Pencatatan Dan Informasi Pertanahan",
            "Pengecekan Informasi Sertifikat",
            "Surat Keterangan Pendaftaran Tanah",
            "Informasi Titik Dasar Teknik Informasi Pertanahan",
            "Informasi Peta Pertanahan",
            "Pengukuran Bidang Tanah Untuk Keperluan Pengembalian Batas",
            "Pengukuran Bidang Tanah Untuk Kegiatan Inventaris/Pengadaan Tanah",
            "Pengukuran Bidang Tanah Atas Permintaan Instansi Dan /Atau Masyarakat Untuk Mengetahui Luas Tanah",
            "Pengukuran Bidang Tanah Dalam Rangka Pembuatan Peta Situasi Lengkap (Topografi)",
            "Konsolidasi Tanah Swadaya",
            "Pertimbangan Teknis Pertanahan",
            "Pertimbangan Teknis Penatagunaan Tanah",
            "Pengelolaan Pengaduan",

    };


    public static String[] Headlist = new String[] {"Pelayanan Pendaftaram Tanah Pertama kali",
                                "Pelayanan Pemeliharaan Data Pendaftaran Tanah",
                                "Pelayanan Pencatatan Dan Informasi Pertanahan",
                                "Pelayanan Pengukuran Bidang Tanah",
                                "Pelayanan Pengaturan Dan Penataan Pertanahan",
                                "Pengelolaan Pengaduan"};

    public static String[] Sublist = new String[] {"1.Konversi, Pengakuan dan Penegasan Hak 2.Pemberian Hak 3.Wakaf 4.P3MB/Prk.5 5.Pendaftaran Hak Milik Atas Satuan RUmah Susun 6.Pemberian Hak Guna Usaha",
                                "1.Peralihan Hak Atas Tanah dan Satuan Rumah Susun 2.Ganti Nama Sertifikat Tanah dan Hak Milik Atas RUmah Susun 3.Perpanjangan Jangka Waktu Hak Guna Usaha/Hak Guna Bangunan/Hak Pakai 4.Perpanjangan Hak Milik Atas Satuan Rumah Susun 5.Pembaruan Hak Guna Bangunan/Hak Pakai dan Pemberian Gak Guna Bangunan/Hak Pakai Di Atas Hak Pengelolaan 6.Pembaruan Hak Guna Usaha 7.Wakaf Dari Tanah Yang Sudah Bersertifikat 8.Perubahan Hak Atas Tanah 9.Pemecahan/Penggabungan/Pemisahan Hak 10.Sertifikat Pengganti Hak Atas Tanah, Hak Milik Atas Rumah Susun, dan Hak Tanggungan 11.Hak Tanggungan",
                                "1.Pencatatan 2.Informasi Pertanahan",
                                "1.Pengukuran Bidang tanah",
                                "1.Konsolidasi Tanah Swadaya 2.Pertimbangan Teknis",
                                "1.Pengelolaan Pengaduan"};
}