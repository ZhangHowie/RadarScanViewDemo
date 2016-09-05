package com.example.radarscanview_lib;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by zhanghaoyue on 16/9/5.
 */
public class LinearAnimation extends Animation
{
    private LinearAnimationListener mListener = null;

    public interface LinearAnimationListener
    {
        void applyTans(float interpolatedTime);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
        super.applyTransformation(interpolatedTime, t);
        if (mListener != null)
            mListener.applyTans(interpolatedTime);
    }

    public void setLinearAnimationListener(LinearAnimationListener listener)
    {
        mListener = listener;
    }
}
