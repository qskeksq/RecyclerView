package com.example.administrator.recyclerview.expandableRecycler.util;

import android.animation.ObjectAnimator;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/**
 * Created by Administrator on 2017-09-20.
 */

public class CustomItemAnimator extends DefaultItemAnimator {

    /**
     * default add 애니메이션
     * @param holder
     * @return
     */
    @Override
    public boolean animateAdd(RecyclerView.ViewHolder holder) {
        return super.animateAdd(holder);
    }

    /**
     * 삭제 애니메이션
     * @param holder
     * @return
     */
    @Override
    public boolean animateRemove(RecyclerView.ViewHolder holder) {
        View view = holder.itemView;
        ObjectAnimator removeAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        removeAnimator.setDuration(100);
        removeAnimator.setInterpolator(new DecelerateInterpolator());
        removeAnimator.start();
        return true;
    }

    /**
     * default move 애니메이션
     * @param holder
     * @param fromX
     * @param fromY
     * @param toX
     * @param toY
     * @return
     */
    @Override
    public boolean animateMove(RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
        return super.animateMove(holder, fromX, fromY, toX, toY);
    }
}
