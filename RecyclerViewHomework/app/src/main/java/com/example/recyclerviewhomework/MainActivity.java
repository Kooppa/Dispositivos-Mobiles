package com.example.recyclerviewhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    public static final String DATABASE_NAME = "users";
    public static final String url = "dbhbm.c0vxjd6ovlcn.us-east-1.rds.amazonaws.com" +
            DATABASE_NAME;
    public static final String username = "admin", password = "12345678";

    public static final String TABLE_NAME = "users";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "name_str", "place_str", " "));
        elements.add(new ListElement("#607d8b", "name_str", "place_str", " "));
        elements.add(new ListElement("#03a9f4", "name_str", "place_str", " "));

        ListAdapter ListAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        recyclerView.setAdapter(ListAdapter);


    }

    //public Connection conexionBD()
    //{  //https://github.com/selfteaching/How-To-Ask-Questions-The-Smart-Way/issues/3
    //    cone_BD=null;
        //try{
            //StrictMode.ThreadPolicy politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            //StrictMode.setThreadPolicy(politica);
            //  Class.forName("com.microsoft.sqlserver.jdbc.Driver")
            //Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //connectionURL = "jdbc:sqlserver://monkey-server.database.windows.net:1433;database=DispositivosMobiles;user=CloudSA2c48bf54@monkey-server;password=crossroad741;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            //cone_BD= DriverManager.getConnection(connectionURL);



        //} catch (ClassNotFoundException e){
        //    Log.e("error" , e.getMessage());
        //}

        //catch (Exception e){
        //    Log.e("Error BD",e.getMessage());
        //}
        // Log.d("conexión", cone_BD);
        //return cone_BD;
//    }

    //Connection cone_BD;
    //String connectionURL;

    public static void addTemp(String name_str, String place_str) {

        new Thread(()-> {
            try {
            Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            // add to ROS 08:


            connection.close();

        } catch (Exception e) {

                e.printStackTrace();
            }
        }).start();

    }
    }