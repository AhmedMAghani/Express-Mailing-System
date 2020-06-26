package service;

import java.math.BigDecimal;

import model.BusinessComponents.ApplicationModules.Express_AMImpl;

import model.BusinessComponents.ViewObjects.BranchUserAccounts_VORowImpl;
import model.BusinessComponents.ViewObjects.EmployeeUserAccounts_VORowImpl;
import model.BusinessComponents.ViewObjects.common.BranchUserAccounts_VORow;

import model.ModuleCreator;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.net.aso.s;

import org.codehaus.groovy.runtime.typehandling.BigDecimalMath;

public class ModuleService {
    private Express_AMImpl appModule;
    
    public ModuleService(){
        appModule = ModuleCreator.getAppModule();
    }

    public Boolean signIn(String userName, String pass) {
        if (searchBranchUserAccounts(userName, pass))
            return true;
        else if (searchEmployeeUserAccounts(userName,pass))
            return true;
        return false;
    }
    
    public BigDecimal signUp(String userName, String pass) {
        if (searchEmployeeUserAccounts(userName, pass))
            return new BigDecimal(0);
        return saveEmployeeAccount(userName, pass);
    }
    
    private Boolean searchBranchUserAccounts(String userName, String pass) {
        BranchUserAccounts_VORowImpl branchUserRow;
        RowSetIterator rowIterator = appModule.getBranchUserAccounts1().createRowSetIterator(null);
        while (rowIterator.hasNext()) {
            branchUserRow = (BranchUserAccounts_VORowImpl) rowIterator.next();
            if (branchUserRow.getUserName().equals(userName) && branchUserRow.getPassword().equals(pass)) {
                rowIterator.closeRowSetIterator();
                return true;
            }
        }
        rowIterator.closeRowSetIterator();
        return false;
    }
    
    private Boolean searchEmployeeUserAccounts(String userName, String pass) {
        EmployeeUserAccounts_VORowImpl employeeUserRow;
        RowSetIterator rowIterator = appModule.getEmployeeUserAccounts1().createRowSetIterator(null);
        while (rowIterator.hasNext()) {
            employeeUserRow = (EmployeeUserAccounts_VORowImpl) rowIterator.next();
            if (employeeUserRow.getUserName().equals(userName) && employeeUserRow.getPassword().equals(pass)) {
                rowIterator.closeRowSetIterator();
                return true;
            }
        }
        rowIterator.closeRowSetIterator();
        return false;
    }
    
//    private void saveBranchAccount(String userName, String pass) {
//        BranchUserAccounts_VORowImpl branchUserRow;
//        Integer lastRecordID;
//        RowSetIterator rowIterator = appModule.getBranchUserAccounts1().createRowSetIterator(null);
//        lastRecordID = ((BranchUserAccounts_VORowImpl) rowIterator.last()).getAccountId().intValue();
//        branchUserRow = (BranchUserAccounts_VORowImpl) rowIterator.createRow();
//        branchUserRow.setAccountId(new BigDecimal(lastRecordID+1));
//        branchUserRow.setUserName(userName);
//        branchUserRow.setPassword(pass);
//        rowIterator.insertRow(branchUserRow);
//        appModule.getTransaction().commit();
//        rowIterator.closeRowSetIterator();
//    }

    private BigDecimal saveEmployeeAccount(String userName, String pass) {
        EmployeeUserAccounts_VORowImpl employeeUserRow;
        Integer lastRecordID;
        RowSetIterator rowIterator = appModule.getEmployeeUserAccounts1().createRowSetIterator(null);
        lastRecordID = checklastNull(rowIterator);
        employeeUserRow = (EmployeeUserAccounts_VORowImpl) rowIterator.createRow();
        employeeUserRow.setAccountId(new BigDecimal(lastRecordID+1));
        employeeUserRow.setUserName(userName);
        employeeUserRow.setPassword(pass);
        rowIterator.insertRow(employeeUserRow);
        commit();
        rowIterator.closeRowSetIterator();
        return employeeUserRow.getAccountId();
    }
    
    public void commit(){
        appModule.getTransaction().commit();
    }
    
    private Integer checklastNull(RowSetIterator rowIterator){
        if (((EmployeeUserAccounts_VORowImpl)rowIterator.last()) != null)
            return ((EmployeeUserAccounts_VORowImpl)rowIterator.last()).getAccountId().intValue();
        return 0;
    }
}
