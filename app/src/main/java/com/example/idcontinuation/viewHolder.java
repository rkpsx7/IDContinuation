package com.example.idcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private clickListener clickListener;
    private ImageView mIvPic;
    private TextView mTvCompanyName, mTvAge, mTvProfession;

    public viewHolder(@NonNull View itemView,clickListener clickListener) {
        super(itemView);
        initViews(itemView);
        this.clickListener = clickListener;
    }

    private void initViews(View itemView) {
        mIvPic = itemView.findViewById(R.id.img_pic);
        cardView = itemView.findViewById(R.id.cardview);
        mTvAge = itemView.findViewById(R.id.tv_age);
        mTvCompanyName = itemView.findViewById(R.id.tv_company);
        mTvProfession = itemView.findViewById(R.id.tv_profession);
    }

    public void setData(Model model) {
        mIvPic.setImageResource(model.getImageID());
        mTvAge.setText(model.getAge());
        mTvCompanyName.setText(model.getCompany());
        mTvProfession.setText(model.getBusiness());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onclick(model, getAdapterPosition());
            }
        });
    }
}
