package com.simsilica.lemur.style.base

import com.simsilica.lemur.Button
import com.simsilica.lemur.Command
import com.simsilica.lemur.component.IconComponent
import com.simsilica.lemur.component.TbtQuadBackgroundComponent

def gradient = TbtQuadBackgroundComponent.create(
        texture( name:"/com/simsilica/lemur/icons/bordered-gradient.png",
                generateMips:false ),
        1, 1, 1, 126, 126,
        1f, false )

def menuHoverCommand = new Command<Button>() {
    void execute( Button source ) {
        if( source.isHighlightOn() ) {
            if (source.isEnabled()) {
                ((TbtQuadBackgroundComponent) source.getBackground()).setColor(color(0.25, 0.5, 0.5, 1.0))
            }
        } else {
            ((TbtQuadBackgroundComponent)source.getBackground()).setColor(color(0.25, 0.5, 0.5, 0.0))
        }
    }
}

def stdMenuCommands = [
        (Button.ButtonAction.HighlightOn) :[menuHoverCommand],
        (Button.ButtonAction.HighlightOff):[menuHoverCommand]
]

selector( "menu-bar", "glass") {
    background = gradient.clone()
    background.setMargin(5, 5)
    background.setColor(color(0.25, 0.5, 0.5, 1.0))
}

// Menu and MenuItem (Button)
selector( "menu-item", "glass") {
    background = gradient.clone()
    background.setColor(color(0.25, 0.5, 0.5, 0.0))
    background.setMargin(10, 5)
    color = color(0.8, 0.9, 1, 0.85f)
    buttonCommands = stdMenuCommands
}

// CheckboxMenuItem (CheckBox)
selector( "menu-checkbox", "glass" ) {

    def on = new IconComponent( "/com/simsilica/lemur/icons/Glass-check-on.png", 1f, 0, 0, 1f, false )
    on.setColor(color(0.5, 0.9, 0.9, 0.9))
    on.setMargin(5, 0)

    def off = new IconComponent( "/com/simsilica/lemur/icons/Glass-check-off.png", 1f, 0, 0, 1f, false )
    off.setColor(color(0.6, 0.8, 0.8, 0.8))
    off.setMargin(5, 0)

    onView = on
    offView = off

    background = gradient.clone()
    background.setColor(color(0.25, 0.5, 0.5, 0.0))
    background.setMargin(10, 5)

    buttonCommands = stdMenuCommands
}

// menu children container
selector( "menu-children", "glass" ) {
    background = gradient.clone()
    background.setMargin(5, 5)
    background.setColor(color(0.25, 0.5, 0.5, 1.0))
}

