package com.jayfella.lemur.theme;

import com.jayfella.lemur.util.BackgroundUtils;
import com.jme3.math.ColorRGBA;

public class MenuBarTheme extends ContainerTheme {

    public MenuBarTheme() {
        super("menu-bar");

        BackgroundUtils.setMargin(background, 5,5);
        BackgroundUtils.setBackgroundColor(background, new ColorRGBA(0.25f, 0.5f, 0.5f, 1.0f));
    }

}
