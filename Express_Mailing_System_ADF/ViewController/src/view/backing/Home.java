package view.backing;

import Utils.JSFUtils;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;

public class Home {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    
    private String userName;
    private RichRegion r1;
    private RichOutputFormatted of1;
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichLink l4;
    private RichLink l5;

    public Home(){
        userName = (String) JSFUtils.getFromSession("userName");
        RichOutputFormatted welcome = new RichOutputFormatted();
        welcome.setValue("Welcome "+userName);
        setOf1(welcome);
    }

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }

    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setL2(RichLink l2) {
        this.l2 = l2;
    }

    public RichLink getL2() {
        return l2;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public void setL5(RichLink l5) {
        this.l5 = l5;
    }

    public RichLink getL5() {
        return l5;
    }
}
