package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";
    final String STATE_TITLE = "state_string";
    final String STATE_MODE = "state_mode";
    int mode;

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();
    private ArrayList<String> posisi = new ArrayList<>();
    private ArrayList<String> tempat = new ArrayList<>();
    private ArrayList<String> nomor = new ArrayList<>();
    private ArrayList<Float> rating = new ArrayList<>();

    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mDesc1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageDet1 = new ArrayList<>();
    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> nomor1 = new ArrayList<>();
    private ArrayList<Float> rating1 = new ArrayList<>();

    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mDesc2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mImageDet2 = new ArrayList<>();
    private ArrayList<String> posisi2 = new ArrayList<>();
    private ArrayList<String> tempat2 = new ArrayList<>();
    private ArrayList<String> nomor2 = new ArrayList<>();
    private ArrayList<Float> rating2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    public void next(View view){
        Intent log = new Intent(this,ListView.class);
        startActivity(log);
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://media.travelingyuk.com/wp-content/uploads/2018/07/Nasi-Ayam-Kedewatan-Ibu-Mangku-di-Bali-Kenikmatan-Melegenda-Sejak-1960-an-1.jpg");
        mNames.add("Nasi Ayam Kedewatan Ibu Mangku");
        mDesc.add("Gianyar");
        mImageDet.add("Nasi campur Warung ibu Mangku yaitu terdiri dari ayam betutu suir, sambal matah, jukut sayuran / urapan, sambal cabe goreng dicampur dengan minyak kelapa, telor pindang Bali juga dilengkapi dengan sate lilit");
        tempat.add("Jl. Kayu Jati no.12 Ubud, Gianyar");
        nomor.add("Rp. 25.000,-");
        rating.add((float)5);

        mImageUrls.add("http://bali.panduanwisata.id/files/2012/03/warung-bu-komang-bali.jpg");
        mNames.add("Warung Bu Komang");
        mDesc.add("Singaraja");
        mImageDet.add("Nasi Campur Warung Bu Komang berisi nasi dengan lauk ayam suwir, sambal, dan juga olahan daging. Tak lupa pula disertai dengan kuah yang mirip dengan rawon");
        tempat.add("Jalan Hasanuddin No 52B, Singaraja");
        nomor.add("Rp. 10.000,-");
        rating.add((float)5);

        mImageUrls.add("https://www.piesusubliman.com/wp-content/uploads/2018/08/Warung-Nasi-Bali-Ibu-Sayu.jpg");
        mNames.add("Warung Nasi Bali Ibu Sayu");
        mDesc.add("Tabanan");
        mImageDet.add("Nasi campur begenyol ditabanan yang wajib dikunjungi di daerah tabanan denganharga murah meriah");
        tempat.add("Jl. Nuri No.15, Dauh Peken, Kec. Tabanan, Kabupaten Tabanan");
        nomor.add("Rp. 15.000,-");
        rating.add((float)5);

        mImageUrls.add("http://isrilcaniago.weebly.com/uploads/1/0/6/1/106122351/ayam-betutu-men-tempeh-3_orig.png");
        mNames.add("Ayam Betutu Men Tempeh");
        mDesc.add("Jembrana");
        mImageDet.add("Rasa Ayam Betutu Men Tempeh saat digigit begitu empuk. Ayam yang digunakan adalah ayam kampung asli.");
        tempat.add("Jalan Raya Gilimanuk, Pelabuhan Gilimanuk");
        nomor.add("Rp. 55.000,-");
        rating.add((float)5);

        mImageUrls.add("https://cdn.qubicle.id/images/2018/10/03/604cbcdd-982d-4675-b89f-016590f7ba4c.jpg");
        mNames.add("Warung Lesehan Merta Sari");
        mDesc.add("Klungkung");
        mImageDet.add("Warung ini terkenal dengan olahan ikan tunanya ada sate lilit tuna, sate tuna manis, sup ikan tuna, plecing kangkung, kacang goreng, sambal matah, serta nasi putih.  ");
        tempat.add("Jl. Kresna, Pesinggahan, Dawan\t");
        nomor.add("Rp. 35.000,-");
        rating.add((float)5);

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/73/f5/28/fb-img-1496380561303.jpg");
        mNames.add("Nasi Ayam Bu Oki");
        mDesc.add("Badung");
        mImageDet.add("Seporsi Nasi Campur Ayam, isi nya terdiri dari Ayam goreng, Ayam Suwir, Sate Lilit, Ati Ampela, Lawar Kacang Panjang, Kacang Tanah Goreng, Tum (Sejenis Pepes) dan tentunya Nasi");
        tempat.add("Jalan Siligita no 27, Nusa Dua, Badung");
        nomor.add("Rp. 25.000,-");
        rating.add((float)5);

        mImageUrls1.add("https://cdn.water-sport-bali.com/wp-content/uploads/2012/11/menu-ibu-oka-ubud.jpg");
        mNames1.add("Babi Guling Bu Oka");
        mDesc1.add("Ubud");
        mImageDet1.add("Babi Guling terkenal dari Ubud Gianyar ini berhasil menjadi ikon kuliner di Ubud. ");
        tempat1.add("Jalan Tegal Sari No. 2, Ubud Tengah, Ubud, Kabupaten Gianyar");
        nomor1.add("Rp. 50.000,-");
        rating1.add((float)5);

        mImageUrls1.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/bali-heritage-babi-guling-candra1-1170x780.jpg");
        mNames1.add("Babi Guling Candra");
        mDesc1.add("Denpasar");
        mImageDet1.add("Babi Guling Candra merupakan babi guling terkenal di Denpasar yang banyak dikunjungi oleh wisatawan asing");
        tempat1.add("Jl. Teuku Umar No.140, Dauh Puri Kauh, Denpasar ");
        nomor1.add("Rp. 50.000,-");
        rating1.add((float)5);

        mImageUrls1.add("https://cdn.idntimes.com/content-images/post/20151223/slingsing-2da33ed8de1acce828ed43803489133e.PNG");
        mNames1.add("Babi Guling Slingsing");
        mDesc1.add("Tabanan");
        mImageDet1.add("Satu porsi babi guling ini berisi daging babi lembut, dengan bumbu dari rempah-rempah yang bukan hanya menambah aroma tapi rasa yang lezat.");
        tempat1.add("Jl. Desa Cepaka No.33, Cepaka, Kediri, Kabupaten Tabanan");
        nomor1.add("Rp. 25.000,-");
        rating1.add((float)5);

        mImageUrls2.add("https://www.goodindonesianfood.com/story/wp-content/uploads/2016/05/editors-note-sate-babi-bawah-pohon-1170x780.jpg");
        mNames2.add("Sate Babi Bawah Pohon");
        mDesc2.add("Badung");
        mImageDet2.add("Sate Babi Bawah Pohon merupakan sate legendaris yang berasal dari Kuta. Pengunjungnya kebanyakan orang lokal dan wisatawan-wisatawan asing yang sedang berada di Kuta.");
        tempat2.add("Jl. Dewi Sri IV, Legian, Kuta, Kabupaten Badung");
        nomor2.add("Rp. 25.000,-");
        rating2.add((float)5);

        mImageUrls2.add("http://nomnombali.com/wp-content/uploads/2019/03/0000_0000_00000000351-02-01-e1552286091372-1170x827.jpeg");
        mNames2.add("Sate Plecing Mak Lukluk");
        mDesc2.add("Denpasar");
        mImageDet2.add("Ciri khas Sate bumbu plecing yang dipadu dengan soto daging khas Bali membuat customer tidak akan bisa melupakan kelezatannya dan akan terus kembali datang ke Sate Plecing Mak Lukluk.");
        tempat2.add("Jl. Raya Puputan No.210A, Renon, Denpasar");
        nomor2.add("Rp. 25.000,-");
        rating2.add((float)5);

        mImageUrls2.add("https://lh3.googleusercontent.com/1jk_nwpU1yQnjBhA-D8uaHiHElRGX5PYz9s5ULE32DW8JL8Pt_-cbXNPoreVGIgcCSkcdlqG=w1080-h608-p-no-v0");
        mNames2.add("Sate Ayam Babi Oka");
        mDesc2.add("Denpasar");
        mImageDet2.add("Sate Ayam Babi Oka (SABO) menyajikan kuah kuning babi atau ayam dengan menggunakan bahan dasar bumbu genep khas Bali.");
        tempat2.add("Jl. Tukad Gangga I No.1, Dangin Puri, Denpasar");
        nomor2.add("Rp. 20.000,-");
        rating2.add((float)5);

        initRecyclerView();
    }



    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerv_view1);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerv_view2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView1.setNestedScrollingEnabled(false);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        CardActivity adapter1 = new CardActivity(this, mNames, mImageUrls, mDesc, mImageDet, posisi, tempat, nomor, rating);
        Card1Activity adapter = new Card1Activity(this, mNames1, mImageUrls1, mDesc1, mImageDet1,  tempat1, nomor1, rating1);
        Card2Activity adapter2 = new Card2Activity(this, mNames2, mImageUrls2, mDesc2, mImageDet2, tempat2, nomor2, rating2);
        recyclerView.setAdapter(adapter1);
        recyclerView1.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);

    }
//    private void initRecyclerView1() {
//
//        RecyclerView recyclerView1 = findViewById(R.id.recyclerv_view1);
//        recyclerView1.setNestedScrollingEnabled(false);
//        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
//        Card1Activity adapter = new Card1Activity(this, mNames, mImageUrls, mDesc, mImageDet, tempat, nomor, rating);
//        recyclerView1.setAdapter(adapter);
//
//    }
//
//
//    private void showRecyleList() {
//        RecyclerView recyclerView = findViewById(R.id.recyclerv_view4);
//        recyclerView.setHasFixedSize(false);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet,tempat, nomor);
//        recyclerView.setAdapter(adapter);
//
//    }

//    private void showRecyclerGrid() {
//        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
//        recyclerView.setHasFixedSize(false);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//        GridActivity adapter = new GridActivity(this, mImageUrls);
//        recyclerView.setAdapter(adapter);
//
//    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putInt(STATE_MODE, mode);
    }
}