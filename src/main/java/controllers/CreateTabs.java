package controllers;

import javafx.scene.control.Tab;

public class CreateTabs {


    public Tab createTabs(String tabName) {
        Tab tab = new Tab(tabName);
        return tab;
    }
}
