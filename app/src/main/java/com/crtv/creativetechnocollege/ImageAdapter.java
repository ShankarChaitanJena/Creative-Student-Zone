package com.crtv.creativetechnocollege;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.creativetechnocollege.R;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private List<Bitmap> imageList;
    private OnImageClickListener onImageClickListener; // Listener for item click events

    public ImageAdapter(List<Bitmap> imageList, OnImageClickListener listener) {
        this.imageList = imageList;
        this.onImageClickListener = listener;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageBitmap(imageList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onImageClickListener != null) {
                    onImageClickListener.onImageClick(imageList.get(position));
                }
            }
        });

        holder.likeSession.setOnClickListener(v -> {
            holder.like_Text.setText("liked");
            holder.like_Notice.setImageResource(R.drawable.liked);
            // Handle like button click event here if needed
        });
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public interface OnImageClickListener {
        void onImageClick(Bitmap image);
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView, like_Notice;
        private TextView like_Text;
        private LinearLayout likeSession;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            like_Notice = itemView.findViewById(R.id.likeNotice);
            like_Text = itemView.findViewById(R.id.like_text);
            likeSession = itemView.findViewById(R.id.likeSession);
        }
    }
}
