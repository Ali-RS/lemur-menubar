package com.jayfella.lemur.theme;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.jayfella.lemur.util.BackgroundComponents;
import com.jayfella.lemur.util.BackgroundUtils;
import com.jme3.math.ColorRGBA;
import com.simsilica.lemur.core.GuiComponent;

public class MenuItemTheme extends ButtonTheme {

    @JsonTypeInfo( use = JsonTypeInfo.Id.CLASS)
    private GuiComponent background = BackgroundComponents.gradient(new ColorRGBA(0.25f, 0.5f, 0.5f, 0.0f));

    private ColorRGBA color = new ColorRGBA(0.8f, 0.9f, 1.0f, 0.85f);

    public MenuItemTheme() {
        super("menu-item");

        BackgroundUtils.setMargin(background, 10, 5);
    }

}
