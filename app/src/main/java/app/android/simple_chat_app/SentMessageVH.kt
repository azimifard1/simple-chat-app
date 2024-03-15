package app.android.simple_chat_app

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class SentMessageVH(itemView: View) : BaseViewHolder(itemView) {
    val sentBubble:ConstraintLayout
    val sentMessage:TextView
    val sentTime:TextView
    init {
        sentBubble = itemView.findViewById(R.id.sent_bubble)
        sentMessage = itemView.findViewById(R.id.sent_text)
        sentTime = itemView.findViewById(R.id.sent_time)
        sentBubble.setOnClickListener{
            if(sentTime.visibility==View.GONE){
                sentTime.visibility = View.VISIBLE
            }else{
                sentTime.visibility = View.GONE
            }
        }
    }

    override fun bind(item: SampleMessage) {
        sentMessage.text = item.text
        sentTime.text = item.time
    }
}
