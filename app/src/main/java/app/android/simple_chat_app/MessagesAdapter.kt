package app.android.simple_chat_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.android.simple_chat_app.databinding.RecievedMessageBinding
import app.android.simple_chat_app.databinding.SentMessageBinding

class MessagesAdapter(val messages:ArrayList<SampleMessage>,val layoutInflater: LayoutInflater) : RecyclerView.Adapter<BaseViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        if(messages[position].isSent){
            return 1//send message
        }
        return 2// Received message
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        if(viewType==1){
            val binding:SentMessageBinding = SentMessageBinding.inflate(layoutInflater)
            return SentMessageVH(binding.root)
        }else{
            val binding:RecievedMessageBinding = RecievedMessageBinding.inflate(layoutInflater)
            return RecieveMessageVH(binding.root)
        }
    }

    override fun getItemCount(): Int {
       return messages.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(messages[position])
    }
}