package branch;

import customer.Customer;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: branch
 * Project Name: BankingApplication
 * Date: 21-05-2021
 */

public class Branch {
    private SimpleStringProperty name = new SimpleStringProperty("");
    private SimpleStringProperty branchCode = new SimpleStringProperty();
    private ObservableList<Customer> customers;

    public Branch(String name, String branchCode) {
        this.name.set(name);
        this.customers = FXCollections.observableArrayList();
        this.branchCode.set(branchCode);
    }




}
