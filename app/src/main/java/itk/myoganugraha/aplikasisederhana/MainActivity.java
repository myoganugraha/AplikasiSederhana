package itk.myoganugraha.aplikasisederhana;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context mContext;

    private RecyclerView recyclerViewNews;
    private RecyclerviewAdapater recyclerviewAdapaterNews;

    private List<DataModel> listData;

    int thumbnails[] = {R.drawable.chrvches, R.drawable.wtf_coming, R.drawable.paramore_tour,
            R.drawable.gun_n_roses_tour, R.drawable.clean_bandit_tour, R.drawable.charlie_puth_tour};
    int userIcon[] = {R.drawable.chrvches, R.drawable.wtf_icon, R.drawable.paramore, R.drawable.gun_n_roses,
            R.drawable.clean_bandit, R.drawable.charlie_puth};
    String listNews[] = {"CHVRCHES Live in Jakarta", "#WTF18 is Coming!!", "Paramore - Tour Four",
            "Guns N' Roses: Not In This Lifetime Tour", "Clean Bandit - I Miss You Tour",
            "Charlie Puth  - Voicenotes Live in Indonesia"};
    String user[] = {"CHVRCHES", "We The Fest", "Paramore", "Gun N' Roses", "Clean Bandit", "Charlie Puth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        initComponents();
    }

    private void initComponents() {
        recyclerViewNews = (RecyclerView) findViewById(R.id.recyclerview_news);
        if(recyclerViewNews != null){
            recyclerViewNews.setHasFixedSize(true);
        }

        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        recyclerViewNews.setLayoutManager(llm);

        listData = new ArrayList<>();
        for (int i = 0; i < listNews.length; i++){
            DataModel dataModel = new DataModel(thumbnails[i], userIcon[i], user[i], listNews[i]);
            listData.add(dataModel);
        }

        recyclerviewAdapaterNews = new RecyclerviewAdapater(listData, mContext);

        recyclerViewNews.setAdapter(recyclerviewAdapaterNews);
        recyclerviewAdapaterNews.notifyDataSetChanged();
    }
}
