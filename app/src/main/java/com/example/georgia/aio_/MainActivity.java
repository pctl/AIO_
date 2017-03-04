package com.example.georgia.aio_;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url="https/google.com";
        StringRequest stringRequest= new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }

            @Override
            public void onResponse(Object response) {

            }
        })

        MySingleton.getInstance(this).addToRequestQueue(stringRequest);
    }
}
