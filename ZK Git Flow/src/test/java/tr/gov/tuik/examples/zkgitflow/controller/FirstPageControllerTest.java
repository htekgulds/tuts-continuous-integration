package tr.gov.tuik.examples.zkgitflow.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zkoss.zats.mimic.ComponentAgent;
import org.zkoss.zats.mimic.DesktopAgent;
import org.zkoss.zats.mimic.Zats;
import org.zkoss.zul.Label;

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
        DesktopAgent desktop = Zats.newClient().connect("/pages/first-page.zul");

        ComponentAgent button = desktop.query("#btnHello");
        ComponentAgent label = desktop.query("#lblHello");

        button.click();
        assertEquals("HELLO WORLD!!!", label.as(Label.class).getValue());
    }
}