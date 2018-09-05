package optick.elisoft.com.newconoptik.util.extension

import android.widget.ImageView
import com.bumptech.glide.Glide

internal fun ImageView.loadImage(url: String){
    Glide.with(this.context)
            .load(url)
            .asBitmap()
            .centerCrop()
            .into(this)
}