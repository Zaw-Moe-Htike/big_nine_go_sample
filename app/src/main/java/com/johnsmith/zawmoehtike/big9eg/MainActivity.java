package com.johnsmith.zawmoehtike.big9eg;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.johnsmith.zawmoehtike.big9eg.api.ApiService;
import com.johnsmith.zawmoehtike.big9eg.api.RetroClient;
import com.johnsmith.zawmoehtike.big9eg.model.Big9Data;
import com.johnsmith.zawmoehtike.big9eg.model.Item;
import com.johnsmith.zawmoehtike.big9eg.model.SubPage;
import com.johnsmith.zawmoehtike.big9eg.util.SupporterClass;
import com.johnsmith.zawmoehtike.big9eg.view.adapter.ItemParentListAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/*
    Created at 14/03/19 by Zaw Moe Htike
    Modified at 16/03/19 by Zaw Moe Htike
    Modified at 17/03/19 by Zaw Moe Htike
    Modified at 29/03/19 by Zaw Moe Htike
 */
public class MainActivity extends AppCompatActivity {

    private final String MAIN_ACTIVITY_LOG = "log123456";

    private Big9Data big9Data;
    private List<SubPage> subPageList;

    private RecyclerView recyclerView;

    private ItemParentListAdapter itemParentListAdapter;

    protected ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    /*
        initVariables()
        return void
     */
    private void initVariables() {

        SupporterClass.showLog(MAIN_ACTIVITY_LOG, "initVariable");

        big9Data = new Big9Data();
        subPageList = new ArrayList();

        recyclerView = findViewById(R.id.rvMain);
    }

    /*
        onCreate()
        return void
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariables();

        ApiService api = RetroClient.getApiService();

        Call<Big9Data> call = api.getMyJSON();

        call.enqueue(new Callback<Big9Data>() {
            @Override
            public void onResponse(Call<Big9Data> call, Response<Big9Data> response) {

                if (response.isSuccessful()) {
                    /**
                     * Got Successfully
                     */
                    subPageList = response.body().getSubPage();

                    SupporterClass.showToast(getApplicationContext(),"Response Success!");

                    SupporterClass.showToast(getApplicationContext(),subPageList.size() + "");

                    big9Data.setSubPage(subPageList);

                    itemParentListAdapter = new ItemParentListAdapter(big9Data,MainActivity.this);
                    recyclerView.setHasFixedSize(true);
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(itemParentListAdapter);
                }
            }

            @Override
            public void onFailure(Call<Big9Data> call, Throwable t) {
                SupporterClass.showToast(getApplicationContext(), "Response Fail!");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
