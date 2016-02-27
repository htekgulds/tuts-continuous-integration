package tr.gov.tuik.examples.zkgitflow.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zkoss.zats.mimic.ComponentAgent;
import org.zkoss.zats.mimic.DesktopAgent;
import org.zkoss.zats.mimic.Zats;
import org.zkoss.zats.mimic.operation.InputAgent;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

import static org.junit.Assert.*;

/**
 * Created by Hasan TEKGÜL
 * on 27.02.2016.
 */
public class FirstPageControllerTest {

    @Before
    public void setUp() throws Exception {
        Zats.init("./src/main/webapp");
    }

    @After
    public void tearDown() throws Exception {
        Zats.end();
    }

    @Test
    public void testOnClickBtnHello() throws Exception {
        DesktopAgent desktop = Zats.newClient().connectAsIncluded("/pages/first-page.zul", null);

        ComponentAgent textbox = desktop.query("#tbName");
        ComponentAgent button = desktop.query("#btnHello");
        ComponentAgent label = desktop.query("#lblHello");

        textbox.type("Hasan");
        button.click();
        assertEquals("Whazzup, Hasan!!!", label.as(Label.class).getValue());
        assertEquals("", textbox.as(Textbox.class).getValue());
    }
}