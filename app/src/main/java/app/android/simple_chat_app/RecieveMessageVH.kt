package app.android.simple_chat_app

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecieveMessageVH(itemView: View) : BaseViewHolder(itemView) {
    val receiveBubble:ConstraintLayout
    val receiveText:TextView
    val receiveTime:TextView
    init {
        receiveBubble = itemView.findViewById(R.id.received_bubble)
        receiveText = itemView.findViewById(R.id.recieved_text)
        receiveTime = itemView.findViewById(R.id.recieved_time)
        receiveBubble.setOnClickListener{
            if(receiveTime.visibility==View.GONE){
                receiveTime.visibility = View.VISIBLE
            }else{
                receiveTime.visibility = View.GONE
            }
        }
    }

    override fun bind(item: SampleMessage) {
        receiveText.text = item.text
        receiveTime.text = item.time
    }
}
