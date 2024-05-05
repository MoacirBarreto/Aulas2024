package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.navigationdrawer.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.navigationdrawer.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(view -> {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            enviarEmail();


        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal, R.id.nav_servicos, R.id.nav_clientes, R.id.nav_contato, R.id.nav_sobre
)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void  enviarEmail(){
//        String tel = "8499999";
//        String imagem = "https://natalrn.com.br/wp-content/uploads/2020/04/Vista-a%C3%A9rea-de-um-catamar%C3%A3-em-Maracaja%C3%BA.jpg";
//        String endereco = "https://www.google.com/maps/place/Touros,+RN,+59584-000/@-5.1952974,-35.479473,14z/data=!3m1!4b1!4m6!3m5!1s0x7b4766f28af49b5:0x44eac1f8be714f44!8m2!3d-5.2001105!4d-35.4590878!16s%2Fm%2F05f5smp";
//        Intent intent  = new Intent( Intent.ACTION_DIAL, Uri.parse();
//        Intent intent  = new Intent( Intent.ACTION_DIAL, Uri.parse("tel:845555"));
//        Intent intent  = new Intent( Intent.ACTION_VIEW, Uri.parse(imagem));
//        Intent intent  = new Intent( Intent.ACTION_VIEW, Uri.parse(endereco));
        Intent intent  = new Intent( Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"atendimento@atmconsultoria.com.br"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo APP");
            intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automática");

        intent.setType("message/rfc822");
//        intent.setType("text/plain");
//        intent.setType("image/*");
//        intent.setType("application/pdf");

        startActivity(Intent.createChooser(intent, "compartilhar"));


//        https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Basics_of_HTTP/MIME_Types


    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}