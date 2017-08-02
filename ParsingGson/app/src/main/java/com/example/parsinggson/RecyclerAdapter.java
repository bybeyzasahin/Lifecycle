package com.example.parsinggson;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beyza on 1.08.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    //private List<Students> list = new ArrayList<>();
    private List<Device> list = new ArrayList<>();

    RecyclerAdapter(List<Device> list){

        this.list = list;
    }

    public RecyclerAdapter(){   }

    public void setDeviceList(List<Device> list){
        this.list = list;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        holder.DeviceName.setText(list.get(position).getDeviceName());
        holder.DeviceType.setText(list.get(position).getDeviceType());
        holder.DeviceStatus.setText(list.get(position).getDeviceStatus());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder {

        TextView DeviceName, DeviceType, DeviceStatus;

        public MyViewholder(View itemView) {
            super(itemView);

            DeviceName = (TextView) itemView.findViewById(R.id.deviceName);
            DeviceType = (TextView) itemView.findViewById(R.id.deviceType);
            DeviceStatus = (TextView) itemView.findViewById(R.id.deviceStatus);

        }
    }
}
