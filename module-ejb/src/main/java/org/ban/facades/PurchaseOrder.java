package org.ban.facades;


import org.ban.entities.Customer;
import org.ban.entities.CustomerOrder;

import java.io.Serializable;

public class PurchaseOrder implements Serializable {
  @SuppressWarnings("compatibility:6196334823835706012")
  private static final long serialVersionUID = -5933882909612696630L;
  private Customer customer;
  private CustomerOrder customerOrder;

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomerOrder(CustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public CustomerOrder getCustomerOrder() {
    return customerOrder;
  }
}
