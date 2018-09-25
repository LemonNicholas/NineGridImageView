package com.jaeger.ninegridimageview;

import android.content.Context;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * @author yueban
 * Date: 2017/9/19
 * Email: fbzhh007@gmail.com
 */
public interface ItemImageLongClickListener<T> {
    boolean onItemImageLongClick(Context context, SimpleDraweeView imageView, int index, List<T> list);
}
