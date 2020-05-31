package com.jayfella.lemur.theme;

import com.jayfella.lemur.util.BackgroundUtils;
import com.jme3.math.ColorRGBA;

public class CheckBoxMenuItemTheme extends CheckboxTheme {

    public CheckBoxMenuItemTheme() {
        super("menu-checkbox");

        onView.setColor(new ColorRGBA(0.5f, 0.9f, 0.9f, 0.9f));
        onView.setMargin(5, 0);

        offView.setColor(new ColorRGBA(0.5f, 0.9f, 0.9f, 0.9f));
        offView.setMargin(5, 0);

        BackgroundUtils.setBackgroundColor(background, new ColorRGBA(0.25f, 0.5f, 0.5f, 0.0f));
        BackgroundUtils.setMargin(background, 10, 5);
    }
}
