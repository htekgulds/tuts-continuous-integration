package tr.gov.tuik.examples.zkgitflow.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;

/**
 * Created by Hasan TEKGÜL
 * on 27.02.2016.
 */
public class FirstPageController extends SelectorComposer<Component> {

    @Wire
    private Label lblHello;

    @Listen("onClick = #btnHello")
    public void onClickBtnHello() {
        lblHello.setValue("HELLO WORLD!!!");
    }
}
