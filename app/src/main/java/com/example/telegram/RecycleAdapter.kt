package com.example.telegram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecycleAdapter : RecyclerView.Adapter<RecycleAdapter.DataHolder>() {


    var text = arrayOf("Hi","Hello","Kem Chho","Namaste","How are you","Have a nice day","Hey!!","No","Are you free?","Hi","Hello","Kem Chho","Namaste","How are you","Have a nice day","Hey!!","No","Are you free?")
    var person = arrayOf("Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi","Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi")
    var time = arrayOf("12:45", "11:33", "7:50", "6:55", "4:28", "1:03", "Yesterday", "Yesterday", "Yesterday","12:45", "11:33", "7:50", "6:55", "4:28", "1:03", "Yesterday", "Yesterday", "Yesterday")


    class DataHolder(itemView: View) : ViewHolder(itemView){

        var name = itemView.findViewById<TextView>(R.id.recycle_name)
        var msg = itemView.findViewById<TextView>(R.id.recycle_msg)
        var time = itemView.findViewById<TextView>(R.id.recycle_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

        return DataHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_tele,parent,false))
    }

    override fun getItemCount(): Int {
        return text.size
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {

        holder.name.text = person[position]
        holder.msg.text = text[position]
        holder.time.text = time[position]
    }
}