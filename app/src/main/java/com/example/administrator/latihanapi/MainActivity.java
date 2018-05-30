package com.example.administrator.latihanapi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.latihanapi.adapter.MahasiswaAdapter;
import com.example.administrator.latihanapi.model.mahasiswa;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //coba gambar
        ImageView ivCobaGambar = (ImageView) findViewById(R.id.iv_coba_gambar);

//        int SDK_INT = Build.VERSION.SDK_INT;
//        if (SDK_INT>0){
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//            try{
//                URL url = new URL("https://picsum.photos/200/300?image=1");
//                Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                ivCobaGambar.setImageBitmap(bmp);
//            } catch (MalformedURLException e){
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

       Picasso.with(this).load("https://picsum.photos/200/300?image=1").into(ivCobaGambar);

        //1. data
        String[] nama = new String[]{"azalia","charis","sekar","ayu"}; //menampilkan data statik

        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.setNama("azalia");
        mahasiswa1.setNim("3.34.15.1.07");
        mahasiswa1.setEmail("azalia@gmail.com");
        mahasiswa1.setFoto("https://picsum.photos/200/300?image=2");

        mahasiswa mahasiswa2 = new mahasiswa(
                "charis",
                "3.34.15.14.13",
                "charis@gmail.com",
                "https://picsum.photos/200/300?image=2"
        );

        ArrayList<mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        //load data retrofit
        //install dong

        //2. adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,
                android.R.layout.simple_list_item_1,
                nama); //Membuat array adapter
        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,
                R.layout.item_mahasiswa, mahasiswas);

        //3. activity (menampilkan data)
        ListView lvDaftarNama = (ListView) findViewById(R.id.list_mahasiswa);
        lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
}
