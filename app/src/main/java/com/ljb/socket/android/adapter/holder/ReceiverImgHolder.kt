package com.ljb.socket.android.adapter.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.ljb.socket.android.R

/**
 * Author:Ljb
 * Time:2018/12/12
 * There is a lot of misery in life
 **/

class ReceiverImgHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTime by lazy { itemView.findViewById<TextView>(R.id.tv_time) }
    val ivAvatar by lazy { itemView.findViewById<ImageView>(R.id.iv_avatar) }
    val ivPicture by lazy { itemView.findViewById<ImageView>(R.id.iv_picture) }
}