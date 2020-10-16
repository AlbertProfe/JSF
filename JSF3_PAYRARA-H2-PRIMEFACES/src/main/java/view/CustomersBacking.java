package view;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Customer;
import service.CustomerManager;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CustomersBacking implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Customer> customers;
	private Customer customer = new Customer();
	@Inject
	private CustomerManager customerManager;

	@PostConstruct
	public void init() {
		this.customers = customerManager.loadAllCustomers();
	}

	public void delete(Customer customer) {

		customerManager.delete(customer);
		customers.remove(customer);
	}

	public String add() {

		customerManager.addNewCustomer(customer);

		this.customers = customerManager.loadAllCustomers();
		this.customer = new Customer();

		return "success";
	}

	public void update() {

		customerManager.update(customers);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update successful from Backing Class"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}
}