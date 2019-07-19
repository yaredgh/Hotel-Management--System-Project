package model;

import java.time.LocalDate;

public class Payment {
    private Customer customer;
    private String cardType;
    private String cardProvider;
    private String cardFullName;
    private String cardNumber;
    private LocalDate expirationDate;
    private String billingAddress;
    private String cvv;

    public Payment() {
    }

    public Payment(String cardType, String cardProvider,
                   String cardFullName, String cardNumber,
                   LocalDate expirationDate,
                   String billingAddress, String cvv) {
        this.cardType = cardType;
        this.cardProvider = cardProvider;
        this.cardFullName = cardFullName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.billingAddress = billingAddress;
        this.cvv = cvv;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCvv(Customer customer) {
        this.customer = customer;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardProvider() {
        return cardProvider;
    }

    public void setCardProvider(String cardProvider) {
        this.cardProvider = cardProvider;
    }

    public String getCardFullName() {
        return cardFullName;
    }

    public void setCardFullName(String cardFullName) {
        this.cardFullName = cardFullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCVV(String CVV) {
        this.cvv = CVV;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
