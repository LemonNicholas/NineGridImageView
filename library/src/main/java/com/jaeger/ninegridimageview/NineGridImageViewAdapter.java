package com.jaeger.ninegridimageview;

import android.content.Context;
import android.widget.ImageView;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Jaeger on 16/2/24.
 * <p>
 * Email: chjie.jaeger@gmail.com
 * GitHub: https://github.com/laobie
 */
public abstract class NineGridImageViewAdapter<T> {
    protected abstract void onDisplayImage(Context context, SimpleDraweeView imageView, T t);

    protected void onItemImageClick(Context context, SimpleDraweeView imageView, int index, List<T> list) {
    }

    protected boolean onItemImageLongClick(Context context, SimpleDraweeView imageView, int index, List<T> list) {
        return false;
    }

    protected SimpleDraweeView generateImageView(Context context) {
        GridImageView imageView = new GridImageView(context);
        imageView.getHierarchy().setActualImageScaleType(ScalingUtils.ScaleType.FOCUS_CROP);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }
}