package model.BusinessComponents.ViewObjects.common;

import java.math.BigDecimal;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 24 22:44:48 EET 2020
// ---------------------------------------------------------------------
public interface EmployeeUserAccounts_VORow extends Row {
    BigDecimal getAccountId();

    void setAccountId(BigDecimal value);

    String getUserName();

    void setUserName(String value);

    String getPassword();

    void setPassword(String value);

    BigDecimal getRole();

    void setRole(BigDecimal value);
}

