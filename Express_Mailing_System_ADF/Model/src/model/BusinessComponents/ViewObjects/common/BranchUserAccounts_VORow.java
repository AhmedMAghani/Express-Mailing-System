package model.BusinessComponents.ViewObjects.common;

import java.math.BigDecimal;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 23 19:34:25 EET 2020
// ---------------------------------------------------------------------
public interface BranchUserAccounts_VORow extends Row {
    BigDecimal getAccountId();

    void setAccountId(BigDecimal value);

    String getUserName();

    void setUserName(String value);

    String getPassword();

    void setPassword(String value);

    BigDecimal getRole();

    void setRole(BigDecimal value);
}

