package view.backing;

import Utils.ADFUtils;

import Utils.JSFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputFormatted;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jbo.JboException;

import service.ModuleService;

public class SignUp {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichOutputFormatted of1;
    private RichPanelGroupLayout pgl1;
    private RichButton b1;
    private RichSpacer s4;
    private RichButton b2;
    private RichInputText it1;
    private RichInputText it2;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichSpacer s3;
    private RichInputText it3;
    private RichSpacer s5;

    private ModuleService moduleService;
    private RichOutputFormatted of2;
    private RichOutputFormatted of3;

    public SignUp() {
        moduleService = new ModuleService();
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

    public void setOf1(RichOutputFormatted of1) {
        this.of1 = of1;
    }

    public RichOutputFormatted getOf1() {
        return of1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void signUp(ActionEvent actionEvent) {
        if (checkPass(getIt2().getValue().toString(), getIt3().getValue().toString()) == false) {
            getOf2().setVisible(true);
            getOf3().setVisible(true);
        } else {
            Integer signUpID =
                moduleService.signUp(getIt1().getValue().toString(), getIt2().getValue().toString()).intValue();
            if (signUpID != 0) {
                JSFUtils.storeOnSession("userName", getIt1().getValue());
                JSFUtils.storeOnSession("signUpID", signUpID);
                ADFUtils.navigateTo("toCompleteR");
            } else {
                ADFUtils.navigateTo("toSignIn");
            }
        }
    }

    private Boolean checkPass(String pass1, String pass2) {
        if (pass1.equals(pass2))
            return true;
        return false;
    }


    public void setOf2(RichOutputFormatted of2) {
        this.of2 = of2;
    }

    public RichOutputFormatted getOf2() {
        return of2;
    }

    public void setOf3(RichOutputFormatted of3) {
        this.of3 = of3;
    }

    public RichOutputFormatted getOf3() {
        return of3;
    }
}
