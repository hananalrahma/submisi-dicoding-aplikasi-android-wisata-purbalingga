package com.hanan.wisatapurbalingga2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Wisata>()

        arrayList.add(Wisata("About Me", "Hanan Iqbal Alrahma \nEmail: hananalrahma99@gmail.com", R.drawable.gambar))

        arrayList.add(Wisata("Curug Tempuran",
                    "Terletak tak jauh dari pusat kota Purbalingga, Curug Tempuran menawarkan kealamian lingkungan dan atmosfer yang menyegarkan. Pohon yang rindang dan aliran sungai yang tenang mewarnai spot wisata ini. " +
                    "Curug Tempuran juga memiliki kolam yang luas. Dijamin Anda bisa berenang dan menghabiskan waktu bermain di sini sepuasnya. Tapi tetap waspada, ya! Soalnya, kolam airnya cukup dalam.\n" +
                    "\nTiket Masuk: Gratis \n" +
                    "Lokasi: Jl. Raya Binangun No.18, Pengalusan, Pengalusan, Mrebet, Kabupaten Purbalingga, Jawa Tengah.",
            R.drawable.curug_tempuran))

        arrayList.add(Wisata("Desa Wisata Serang",
            "Berwisata dengan keluarga dengan tema alam di Purbalingga? Langsung saja menuju ke Desa Wisata Serang dan Anda akan mendapatkan pengalaman yang mengesankan.\n" +
                    "Ingin berada di tengah lebatnya hutan pinus sekaligus bersantai? Tak masalah. Di sini, Anda bisa menemukannya, bahkann berfoto dengan background yang epik.\n" +
                    "\nLokasi: Serang, Karangreja, Serang, Purbalingga, Kabupaten Purbalingga, Jawa Tengah. Koordinat\n" +
                    "Jam Operasional: Setiap hari",
            R.drawable.desa_wisata_serang))

        arrayList.add(Wisata("Puncak Gunung Slamet",
            "Ini adalah tantangan sebenar-benarnya para adventurer. Tidak hanya sekadar berfoto di bukit yang ketinggiannya hanya beberapa ratus meter dari permukaan air laut, tapi langsung menyongsong hari di puncak bumi.\n" +
                    "Adalah Gunung Slamet yang seharusnya jadi tujuan utama para traveler ketika datang ke Purbalingga. Gunung yang menjulang tinggi itu menantang semua orang untuk menggapai langit di puncaknya.\n" +
                    "\nLokasi: Banyumas, Brebes, Tegal, Purbalingga, dan Pemalang, Jawa Tengah\n" +
                    "Cara ke Sana: Ada beberapa jalur yang bisa diambil, trek standar adalah dari Blambangan, Desa Kutabawa, Kecamatan Karangreja, Purbalingga. Sementara dari Pemalang, bisa melalui Desa Gambuhan, Desa Jurangmangu dan Desa Gunungsari, atau lewat jalur Dhipajaya. Jalur lainnya bisa melalui pemandian wisata air panas Guci kabupaten Tegal.",
            R.drawable.gunung_slamet))

        arrayList.add(Wisata("Jembatan Cinta Pring Wulung",
            "Bagi Anda sepasang traveler, datang ke Jembatan Cinta Pring Wulung saat ke Purbalingga adalah keharusan.\n" +
                    "Spot wisata ini seakan menjadi simbol kedekatan Anda dan pasangan. Berfoto di sini pun harus dilakukan.\n" +
                    "\nTiket Masuk: Rp5.000\n" +
                    "Lokasi: Panusupan RT. 3 RW. 4, Kecamatan Rembang, Panusupan, Kec. Rembang, Kabupaten Purbalingga, Jawa Tengah.\n" +
                    "Jam Operasional: Setiap hari 07.00 – 18.00",
            R.drawable.jembatan_cinta))

        arrayList.add(Wisata("Kampung Kurcaci",
            "Berada di kaki Gunung Slamet, spot bernama Kampung Kurcaci itu menampilkan dua rumah dengan ukuran kecil dan unik, juga berwarna mencolok. Bentuknya nyaris sama dengan rumah yang ditinggali Bilbo dan Frodo Baggins, kaum Hobbit di trilogi Lords of the Ring.\n" +
                    "Tapi jangan berharap Anda bisa bertemu dengan para kurcaci ini. Meski begitu, untuk mengobati kekecewaan, Anda masih bisa berfoto di depan ‘rumah’ mereka, kok! Hasilnya kece banget.\n" +
                    "Spot lain yang harus Anda kunjungi adalah hutan pinus dan Air Terjun Curug Lawang, yang berada dekat dengan lokasi. Anda juga bisa berkemah atau pun trekking di wilayah ini. Dan ada rumah pohon juga. Dijamin seru!\n" +
                    "\nTiket Masuk: Rp5.000\n" +
                    "Lokasi: Serang, Karangreja, Kabupaten Purbalingga, Jawa Tengah.",
            R.drawable.kampung_kurcaci))

        arrayList.add(Wisata("Kutabawa Flower Garden",
            "ngin menyaksikan warna-warni bunga dan tanaman kini tak cuma bisa dilakukan di Puncak, Lembang atau Cihideung. Cukup melipir ke kawasan Kutabawa di Purbalingga untuk memanjakan mata Anda.\n" +
                    "Ya, Kutabawa Flower Garden merupakan spot wisata baru yang ada di Purbalingga. Andalannya tentunya adalah deretan bunga dan tanaman dengan warna-warna yang luar biasa.\n" +
                    "Beberapa spot dibuat menarik lewat pembangunan lanskap. Jadi Anda, pemburu tempat bagus untuk berfoto, bisa mengabadikannya dengan kamera.\n" +
                    "\nLokasi: Jl Raya Kutabawa, Karangreja, Purbalingga, Jawa Tengah.\n" +
                    "Jam Operasional: Setiap hari 05.00 – 17.00",
            R.drawable.kutabawa_flower_garden))

        arrayList.add(Wisata("Owabong Water Park",
            "Semakin banyak saja tempat yang menyenangkan untuk bermain air, seperti di Owabong Park.\n" +
                    "Taman wisata air di Bojongsari ini menawarkan wahana yang berbeda dari taman air di tempat lain, yaitu ombak deras yang dioperasikan secara penuh dari pagi hingga sore.\n" +
                    "Tiket Masuk: Senin-Jumat Rp20.000 | Sabtu, Minggu dan hari libur Rp30.000\n" +
                    "\nLokasi: Jl. Raya Owabong No.1, Bojongsari, Kabupaten Purbalingga, Jawa Tengah\n" +
                    "Jam Operasional: Setiap hari 07.00 – 17.00",
            R.drawable.owabong))

        arrayList.add(Wisata("Puncak Sibarat",
            "Dari ketinggian 620 mdpl, Anda sudah bisa menikmati sunrise yang mengesankan tanpa harus pergi jauh dari Purbalingga untuk mendapatkannya.\n" +
                    "Puncak Sibarat di Gunung Wuled adalah spot yang Anda harus kunjungi untuk mendapatkan sensasi sunrise dari ketinggian. Jadi, tak harus ke Bromo, Semeru atau Rinjani, kan?\n" +
                    "\nLokasi: Dusun Bawahan, Desa Gunungwuled, Kecamatan Rembang, Kabupaten Purbalingga, Jawa Tengah",
            R.drawable.puncak_sibarat))

        arrayList.add(Wisata("Rumah Pohoon Igir Wringin",
            "Di rumah pohon Igir Wringin, Anda tak hanya disuguhi pemandangan yang eksotik, panorama alam yang fantastis dan suasana yang menyenangkan, tapi juga rumah pohon unik yang tak akan Anda temui di tempat lain.\n" +
                    "Rumah pohonnya disusun dari banyak ranting pepohonan. Tapi jangan khawatir, kekuatan rumah pohon ini bisa dijamin, asal tidak melebihi kapasitas.\n" +
                    "\nTiket Masuk: Rp5.000\n" +
                    "Lokasi: Desa Panusupan, Kec. Rembang, Panusupan, Purbalingga, Kabupaten Purbalingga, Jawa Tengah.",
            R.drawable.rumah_pohon))

        arrayList.add(Wisata("Sanggaluri Park",
            "Sebagai traveler, ada kalanya juga nyali Anda diuji, seperti di Sanggaluri Park, yang memiliki ratusan ular dan jenis serangga.\n" +
                    "Taman ini merupakan taman edukasi yang dibangun untuk memberikan pengetahuan mengenai ular dan serangga. Hanya saja, kemasannya dibuat seru, dan mungkin sedikit menegangkan.\n" +
                    "Tiket Masuk: Senin-Jumat Rp10.000 | Sabtu dan Minggu Rp12.000\n" +
                    "\nLokasi: Jalan Taman Reptile, Desa Kutasari, Kutasari, Purbalingga, Kabupaten Purbalingga, Jawa Tengah.\n" +
                    "Jam Operasional: Setiap hari 08.00 – 17.00",
            R.drawable.sanggaluri_park))

        val wisataAdapter = WisataAdapter(arrayList, this)
        list_item.layoutManager = LinearLayoutManager (this)
        list_item.adapter = wisataAdapter


    }
}