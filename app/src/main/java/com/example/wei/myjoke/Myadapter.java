package com.example.wei.myjoke;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Wei on 2017/5/26.
 */
public class Myadapter extends RecyclerView.Adapter<MyViewHolder>{
    private List<JokeData.ResultBean.DataBean> mList;
    public Myadapter(List<JokeData.ResultBean.DataBean> mList){
        this.mList=mList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        MyViewHolder holder=new MyViewHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
JokeData.ResultBean.DataBean joke=mList.get(position);
        holder.tv.setText(joke.getContent());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void changeData(List<JokeData.ResultBean.DataBean> mList) {
        this.mList=mList;
        notifyDataSetChanged();
    }
}
