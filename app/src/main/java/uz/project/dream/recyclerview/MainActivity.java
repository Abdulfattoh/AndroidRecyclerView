package uz.project.dream.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.project.dream.recyclerview.adapter.MyAdapter;
import uz.project.dream.recyclerview.model.ListData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListData> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listData = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            ListData item = new ListData(
                    "Meva " + (i+1),
                    "Narxi " + (100+i)
            );
            listData.add(item);
        }

        adapter = new MyAdapter(this, listData);
        recyclerView.setAdapter(adapter);
    }
}
