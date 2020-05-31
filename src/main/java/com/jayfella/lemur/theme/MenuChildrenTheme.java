package com.jayfella.lemur.theme;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.jayfella.lemur.ThemedElement;
import com.jayfella.lemur.util.BackgroundComponents;
import com.jayfella.lemur.util.BackgroundUtils;
import com.jme3.math.ColorRGBA;
import com.simsilica.lemur.core.GuiComponent;

public class MenuChildrenTheme extends ThemedElement {

    @JsonTypeInfo( use = JsonTypeInfo.Id.CLASS)
    private GuiComponent background = BackgroundComponents.gradient(new ColorRGBA(0.25f, 0.5f, 0.5f, 1.0f));

    public MenuChildrenTheme() {
        super("menu-children");

        BackgroundUtils.setMargin(background, 5,5);
        BackgroundUtils.setBackgroundColor(background, new ColorRGBA(0.25f, 0.5f, 0.5f, 1.0f));

    }

}
