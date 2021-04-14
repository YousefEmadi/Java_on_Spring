package com.joseph.Jaspring;

public class myController {
    private ConsoleView view;
    private CustomerDatabase customerDatabase;

    public myController() {
    }

    public void configure(ConsoleView view, CustomerDatabase customerDatabase){
        this.view = view;
        this.customerDatabase = customerDatabase;
    }


    public boolean getAndDoNextAction() {
        UserChoice choice = view.requestAction();

        switch (choice) {
            case CREATE -> { doCreate(); return true;}
            case GETBYID -> { doGetById(); return true;  }
            case REMOVEBYID -> { doRemoveById();return true; }
            case EXIT -> {return false;}
            default -> {return true;}
        }

    }

    public void doCreate(){
        Customer myCustomer = view.getCustomer();

        if (myCustomer != null)
            customerDatabase.save(myCustomer);
    }

    private void doGetById() {
        int id = view.getIdToRetrieve();
        Customer customer = customerDatabase.findCustomerById(id);
        view.showCustomer(customer);
    }

    private void doRemoveById() {
        int id = view.getIdToRetrieve();
        boolean result = customerDatabase.removeUserById(id);
        if (result) System.out.println("User removed!");

    }

}
