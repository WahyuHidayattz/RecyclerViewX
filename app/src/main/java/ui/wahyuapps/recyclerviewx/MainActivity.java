package ui.wahyuapps.recyclerviewx;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	
	RecyclerView mRecycler;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		mRecycler = findViewById(R.id.recycler_view);
		setupRecyclerView();
    }
	
	private void setupRecyclerView(){
		List<Data> data = new ArrayList<>();

		String titles[];
		String subtitles[];
		int images[];

		titles = getResources().getStringArray(R.array.item_title);
		subtitles = getResources().getStringArray(R.array.item_subtitle);

		for (int i = 0; i<titles.length; i++){
			Data item = new Data();

			item.mTitle = titles[i];
			item.mSubtitle = subtitles[i];

			data.add(item);
		}

		mRecycler.setHasFixedSize(true);
		mRecycler.setLayoutManager(new
								   LinearLayoutManager(this));
		mRecycler.setAdapter(new Adapter(this, data));
	}
    
}
