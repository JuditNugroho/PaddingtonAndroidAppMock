package com.example.sisalfamart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sisalfamart.controllers.LoginControllers;
import com.example.sisalfamart.models.ResponLoginModels;
import com.example.sisalfamart.server.ConfigServer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText edittextUsername, edittextPassword;
    Button btnLogin;
    TextView clickHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextUsername = (EditText) findViewById(R.id.edittextUsername);
        edittextPassword = (EditText) findViewById(R.id.edittextPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        clickHelp = findViewById(R.id.clickHelp);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginControllers login = ConfigServer.getClient().create(LoginControllers.class);
                Call<ResponLoginModels> getFromLogin =
                        login.loginMSUser(edittextUsername.getText().toString(), edittextPassword.getText().toString());

                getFromLogin.enqueue(new Callback<ResponLoginModels>() {
                    @Override
                    public void onResponse(Call<ResponLoginModels> call, Response<ResponLoginModels> response) {
                        String pesan = response.body().getPesan();
                        if(pesan.contentEquals("success")){
                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(intent);

                        }else{
                            Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponLoginModels> call, Throwable t) {
                        Log.d("Pesan adalah = ", t.toString());
                    }
                });

            }
        });

        clickHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent help = new Intent(MainActivity.this, help.class);
                startActivity(help);
            }
        });
    }
}