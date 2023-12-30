    package com.example.baitap22;

    import androidx.appcompat.app.AppCompatActivity;

    import android.graphics.ColorSpace;
    import android.os.Bundle;
    import android.widget.Adapter;
    import android.widget.ArrayAdapter;
    import android.widget.ListView;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        ListView ls;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ls=findViewById(R.id.ls1);
            ArrayList<String> monhoc=new ArrayList<>();
            monhoc.add("MÔN A");
            monhoc.add("MÔN B");
            monhoc.add("MÔN C");
            monhoc.add("MÔN D");
            monhoc.add("MÔN E");
            monhoc.add("MÔN F");  monhoc.add("MÔN G");
            monhoc.add("MÔN H");
            monhoc.add("MÔN J");
            monhoc.add("MÔN K");
            ArrayAdapter adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, monhoc);
            ls.setAdapter(adapter);

        }
    }