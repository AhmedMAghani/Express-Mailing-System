package view.backing;

import Utils.JSFUtils;

import java.math.BigDecimal;

import javax.faces.component.UISelectItems;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

public class EmpRegisteration {
    private Integer signUpID;
    
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichPanelBox pb1;
    private RichPanelGroupLayout pgl1;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichButton b2;
    private RichOutputFormatted of1;
    private RichOutputFormatted of2;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichSpacer s5;
    private RichSpacer s6;
    private RichSpacer s7;
    private RichInputText it1;

    public EmpRegisteration(){
        signUpID = (Integer) JSFUtils.getFromSession("signUpID");
        JSFUtils.setExpressionValue("#{bindings.AccountId.inputValue}", new BigDecimal(signUpID));
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

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }


    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }


    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setOf2(RichOutputFormatted of2) {
        this.of2 = of2;
    }

    public RichOutputFormatted getOf2() {
        return of2;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setS6(RichSpacer s6) {
        this.s6 = s6;
    }

    public RichSpacer getS6() {
        return s6;
    }

    public void setS7(RichSpacer s7) {
        this.s7 = s7;
    }

    public RichSpacer getS7() {
        return s7;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


}
