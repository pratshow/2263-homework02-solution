package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import javafx.scene.Node;
import lombok.Getter;

public abstract class AppView implements IAppView {

    @Getter
    protected Node view;
    protected App parent;

    public AppView(App parent) {
        this.parent = parent;
        initView();
    }
}
