package com.example.spotifyclone;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class SettingsActivity extends AppCompatActivity {
    SwitchCompat swith_audioquality;
    LinearLayout layout_home,layout_search,layout_library,layout_premium,layout_goback;
    ImageView image_home,image_search,image_library,image_premium;
    TextView text_home,text_search,text_library,text_premium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_screen);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.black));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.black));

        layout_home = findViewById(R.id.layout_home);
        layout_search = findViewById(R.id.layout_search);
        layout_library = findViewById(R.id.layout_library);
        layout_premium = findViewById(R.id.layout_premium);
        layout_goback = findViewById(R.id.layout_goback);

        image_home =  findViewById(R.id.image_home);
        image_search =  findViewById(R.id.image_search);
        image_library =  findViewById(R.id.image_library);
        image_premium =  findViewById(R.id.image_premium);

        text_home =  findViewById(R.id.text_home);
        text_search =  findViewById(R.id.text_search);
        text_library =  findViewById(R.id.text_library);
        text_premium =  findViewById(R.id.text_premium);


        layout_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_home.setTextColor(Color.parseColor("#FFFFFF"));
                text_search.setTextColor(Color.parseColor("#989898"));
                text_library.setTextColor(Color.parseColor("#989898"));
                text_premium.setTextColor(Color.parseColor("#989898"));
                image_home.setImageResource(R.drawable.spotify_home_icon_clicked);
                image_search.setImageResource(R.drawable.spotify_search_icon);
                image_library.setImageResource(R.drawable.spotify_library_icon);
                image_premium.setImageResource(R.drawable.spotify_main_icon);

                Intent intent = new Intent(SettingsActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.layout_fade_in,R.anim.layout_fade_out);
            }
        });

        layout_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_search.setTextColor(Color.parseColor("#FFFFFF"));
                text_home.setTextColor(Color.parseColor("#989898"));
                text_library.setTextColor(Color.parseColor("#989898"));
                text_premium.setTextColor(Color.parseColor("#989898"));
                image_search.setImageResource(R.drawable.spotify_search_icon_clicked);
                image_home.setImageResource(R.drawable.spotify_home_icon);
                image_library.setImageResource(R.drawable.spotify_library_icon);
                image_premium.setImageResource(R.drawable.spotify_main_icon);

                Intent intent = new Intent(SettingsActivity.this,SearchActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.layout_fade_in,R.anim.layout_fade_out);
            }
        });

        layout_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_library.setTextColor(Color.parseColor("#FFFFFF"));
                text_search.setTextColor(Color.parseColor("#989898"));
                text_home.setTextColor(Color.parseColor("#989898"));
                text_premium.setTextColor(Color.parseColor("#989898"));
                image_library.setImageResource(R.drawable.spotify_library_icon_clicked);
                image_search.setImageResource(R.drawable.spotify_search_icon);
                image_home.setImageResource(R.drawable.spotify_home_icon);
                image_premium.setImageResource(R.drawable.spotify_main_icon);
            }
        });

        layout_premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_premium.setTextColor(Color.parseColor("#FFFFFF"));
                text_search.setTextColor(Color.parseColor("#989898"));
                text_library.setTextColor(Color.parseColor("#989898"));
                text_home.setTextColor(Color.parseColor("#989898"));
                image_premium.setImageResource(R.drawable.spotify_main_icon_clicked);
                image_library.setImageResource(R.drawable.spotify_library_icon);
                image_search.setImageResource(R.drawable.spotify_search_icon);
                image_home.setImageResource(R.drawable.spotify_home_icon);

                Intent intent = new Intent(SettingsActivity.this,PremiumActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.layout_fade_in,R.anim.layout_fade_out);
            }
        });

        layout_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this,LibraryActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.layout_fade_in,R.anim.layout_fade_out);
            }
        });
    }
}
