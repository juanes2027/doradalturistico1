package com.example.juanes.doradalturistico1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    Intent intent;
    TextView tUsername;
    TextView tPassword;
    TextView tCorreo;
    String username, correo, password="*******", registrado="si";
    //int requestcode =1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tUsername = (TextView) findViewById(R.id.tUsername);
        tPassword = (TextView) findViewById(R.id.tPassword);
        tCorreo = (TextView) findViewById(R.id.tCorreo);
        Bundle extras = getIntent().getExtras();
        username = extras.getString("username");
        //password = extras.getString("password");
        correo = extras.getString("correo");
        tUsername.setText(username);
        tPassword.setText(password);
        tCorreo.setText(correo);

        //intent = new Intent(PerfilActivity.this, LoginActivity.class);
        //intent.putExtra("username",username);
        //intent.putExtra("password",password);
        //intent.putExtra("correo",correo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuperfil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            /*case R.id.mVolver:
                intent = new Intent(PerfilActivity.this, MainActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                intent.putExtra("correo",correo);
                startActivity(intent);
                break;*/
            case R.id.mLogOut:
                intent = new Intent(PerfilActivity.this, LoginActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                intent.putExtra("correo",correo);
                startActivity(intent);
                finish();
                break;
            case R.id.mMain:
                intent = new Intent(PerfilActivity.this, MainActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",correo);
                intent.putExtra("password",password);
                startActivity(intent);
                finish();
                break;
            case R.id.mLugares:
                intent = new Intent(PerfilActivity.this, LugaresActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",correo);
                intent.putExtra("password",password);
                startActivity(intent);
                finish();
                break;
            case R.id.mRestaurantes:
                intent = new Intent(PerfilActivity.this, RestaurantesActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",correo);
                intent.putExtra("password",password);
                startActivity(intent);
                finish();
                break;
            case R.id.mHoteles:
                intent = new Intent(PerfilActivity.this, HotelActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("correo",correo);
                intent.putExtra("password",password);
                startActivity(intent);
                finish();
                break;
        }
        return true;
    }
}