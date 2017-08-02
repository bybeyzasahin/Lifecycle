package com.example.parsinggson;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Beyza on 1.08.2017.
 */

public class MySingleton {
    private static MySingleton mInstance;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private MySingleton(Context context){
        mCtx = context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue getRequestQueue(){
        if ( requestQueue == null)
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());

        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context){
        if ( mInstance == null ){
            mInstance = new MySingleton(context);
        }
        return mInstance;
    }

    public<T> void addToRequestQue(Request<T> request){
        getRequestQueue().add(request);
    }
}
