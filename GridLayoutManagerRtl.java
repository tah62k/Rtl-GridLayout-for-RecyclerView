package com.negahetazehco.habloliman.ui.customview;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.GridLayoutManager;

public class GridLayoutManagerRtl extends GridLayoutManager {

  public GridLayoutManagerRtl(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  public GridLayoutManagerRtl(Context context, int spanCount) {
    super(context, spanCount);
  }

  public GridLayoutManagerRtl(Context context, int spanCount, int orientation, boolean reverseLayout) {
    super(context, spanCount, orientation, reverseLayout);
  }

  @Override
  protected boolean isLayoutRTL(){
    return true;
  }
}
