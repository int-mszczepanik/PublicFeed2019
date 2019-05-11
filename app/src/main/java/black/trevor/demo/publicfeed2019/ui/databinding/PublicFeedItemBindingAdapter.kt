package black.trevor.demo.publicfeed2019.ui.databinding

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("imageBind")
fun bindFlickrImage(imageView: ImageView, imageUrl: String) {
    Picasso.get().load(imageUrl).into(imageView)
}

@BindingAdapter("publishedDateBind")
fun bindPublishedDate(textView: TextView, date: Date?) {

}

@BindingAdapter("tagsBind")
fun bindTags(textView: TextView, tags: List<String>) {
    textView.text = max3tagsToString(tags)
}


fun max3tagsToString(tags: List<String>): String {
    return ""
}
