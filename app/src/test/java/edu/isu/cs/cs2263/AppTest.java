package edu.isu.cs.cs2263;

import com.google.common.collect.Maps;
import edu.isu.cs.cs2263.hw02.App;
import edu.isu.cs.cs2263.hw02.views.*;
import edu.isu.cs.cs2263.hw02.data.Course;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxAssert;
import org.testfx.assertions.api.NodeAssert;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;
import org.testfx.service.query.NodeQuery;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
public class AppTest {

    private App appTest;
    private WelcomeView welcomeTest;
    Map<String, AppView> views;
    AppView appViewTest;

    @BeforeEach
    private void start(){
        //appTest =  mock(App.class);
        views = Maps.newHashMap();
        welcomeTest = mock(WelcomeView.class);
        appViewTest = mock(AppView.class);
    }

    @Test void mainAppTest() throws Exception {
        Node testView = appViewTest.getView();
        welcomeTest.initView();
        //FxAssert.verifyThat("#bp", Node::isVisible);
    }
}
