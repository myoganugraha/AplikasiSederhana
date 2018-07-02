package itk.myoganugraha.aplikasisederhana;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerviewAdapater extends RecyclerView.Adapter<RecyclerviewAdapater.CustomViewHolder> {
    private List<DataModel> listData;
    private Context mContext;

    public RecyclerviewAdapater(List<DataModel> listData, Context mContext) {
        this.listData = listData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerviewAdapater.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_news, viewGroup, false);

        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapater.CustomViewHolder customViewHolder, int i) {
        DataModel data = listData.get(i);

        Glide.with(mContext)
                .load(data.getThumbnail())
                .into(customViewHolder.ivThumbnail);

        Glide.with(mContext)
                .load(data.getUserIcon())
                .into(customViewHolder.ivUser);

        customViewHolder.tvUsername.setText(data.getUsername());
        customViewHolder.tvNews.setText(data.getNews());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView ivThumbnail;
        protected CircleImageView ivUser;
        protected TextView tvUsername, tvNews;

        public CustomViewHolder(View view){
            super(view);
            this.ivThumbnail = (ImageView)view.findViewById(R.id.ivThumbnail);
            this.ivUser = (CircleImageView)view.findViewById(R.id.civ_profpic);
            this.tvUsername = (TextView)view.findViewById(R.id.usernamePost);
            this.tvNews = (TextView)view.findViewById(R.id.tvNews);
        }

    }
}
