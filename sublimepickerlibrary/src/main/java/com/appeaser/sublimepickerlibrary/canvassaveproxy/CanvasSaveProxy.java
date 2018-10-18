package com.appeaser.sublimepickerlibrary.canvassaveproxy;

import android.graphics.Canvas;

public interface CanvasSaveProxy {
    int save();

    boolean isFor(final Canvas canvas);
}
