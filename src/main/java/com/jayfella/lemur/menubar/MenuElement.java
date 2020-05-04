package com.jayfella.lemur.menubar;

import com.simsilica.lemur.Panel;
import org.jetbrains.annotations.NotNull;

public interface MenuElement {

    Panel getPanel();

    String getText();
    void setText(@NotNull String text);

    boolean isEnabled();
    void setEnabled(boolean enabled);

    MenuElement getParent();
    void setParent(MenuElement element);

    LemurMenuBar getMenuBar();
    void setMenuBar(LemurMenuBar menuBar);

}
