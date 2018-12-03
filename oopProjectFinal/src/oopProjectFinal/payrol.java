/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

/**
 *
 * @author x18114245
 */
public class payrol extends hr {// payroll class is the child class and its iherets parameters from base class like firstname,surname,adress,id,dob and pps
    //declare variables

    private Double hours;
    private Double rate;
    private Double PRSI;
    private Double gross;
    private Double pay;
    private Double usc;
    private Double netpay;
    private Double taxCredit;
    private Double healthInsurance;
    private Double unionSubs;
    private Double overTime;
    private Double taxablePay;

//overloaded constructor
    public payrol(Double hours, Double rate, Double PRSI, Double gross, Double pay, Double usc, Double netpay, String firstname, String surname, String dob, String id, String address, String ppsnumber, Double taxCredit, Double taxablePay, Double overTime, Double healthInsurance, Double unionSubs) {
        super(firstname, surname, dob, id, address, ppsnumber);
        this.hours = hours;
        this.rate = rate;
        this.PRSI = PRSI;
        this.gross = gross;
        this.pay = pay;
        this.usc = usc;
        this.netpay = netpay;
        this.taxCredit = taxCredit;
        this.healthInsurance = healthInsurance;
        this.unionSubs = unionSubs;
        this.overTime = overTime;
        this.taxablePay = taxablePay;

    }
//default constractor

    public payrol() {
        //set initial valuees too zero
        hours = 0.0;
        rate = 0.0;
        PRSI = 0.0;
        gross = 0.0;
        netpay = 0.0;
        usc = 0.0;
        netpay = 0.0;
        taxCredit = 0.0;
        healthInsurance = 0.0;
        unionSubs = 0.0;
        taxablePay = 0.0;
        overTime = 0.0;
        pay = 0.0;
    }

    public String employeedetails() {
        return super.employeedetails() + "\n hours: " + hours + "\n rate: " + rate + "\n prsi:" + PRSI + "\n usc: " + usc + "\n taxCredit: " + taxCredit + "\n health insurance: " + healthInsurance + "\n union subs: " + unionSubs + "\n";// create method called employeed details that enherits the parameters of base class
    }

    public Double gross() {
        return gross = hours * rate;// create formula to calculate gross

    }

    @Override
    public Double taxablePay() {
        return taxablePay = gross + overTime;// create formula to calculate taxable pay
    }

    public Double prsi() {

        return PRSI = taxablePay * 0.04;// create formula to calculate prsi

    }

    public Double usc() {// create formula to caculate usc
        if (taxablePay <= 231) {
            usc = taxablePay * 0.01;
        } else if (taxablePay > 359 && taxablePay <= 1347) {
            usc = (((taxablePay - 359) * 0.055) + 6.15);
        } else {
            usc = ((taxablePay - 1337) * 0.07) + (6.15 + 54.34);
        }
        return usc;
    }

    public Double pay() {// create formula to calculate pay
        if (taxablePay <= 650) {
            pay = taxablePay * 0.2;
        } else if (taxablePay > 650) {
            pay = ((taxablePay - 650) * 0.4) + 130;
        }
        return pay;
    }

    public Double netpay() {// craete formula to calculate netpay

        netpay = taxablePay - (pay - taxCredit + PRSI + usc + unionSubs + healthInsurance);

        return netpay;
    }

//setter and getters
    public void setHours(Double hours) {
        this.hours = hours;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Double getOverTime() {
        return overTime;
    }

    public Double getTaxablePay() {
        return taxablePay;
    }

    public void setOverTime(Double overTime) {
        this.overTime = overTime;
    }

    public void setTaxablePay(Double taxablePay) {
        this.taxablePay = taxablePay;
    }

    public void setPRSI(Double PRSI) {
        this.PRSI = PRSI;
    }

    public Double getPRSI() {
        return PRSI;
    }

    public Double getPay() {
        return pay;
    }

    public Double getUsc() {
        return usc;
    }

    public Double getNetpay() {
        return netpay;
    }

    public Double getTaxCredit() {
        return taxCredit;
    }

    public Double getHealthInsurance() {
        return healthInsurance;
    }

    public Double getUnionSubs() {
        return unionSubs;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public void setUsc(Double usc) {
        this.usc = usc;
    }

    public void setNetpay(Double netpay) {
        this.netpay = netpay;
    }

    public void setTaxCredit(Double taxCredit) {
        this.taxCredit = taxCredit;
    }

    public void setHealthInsurance(Double healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public void setUnionSubs(Double unionSubs) {
        this.unionSubs = unionSubs;
    }

    public Double getHours() {
        return hours;
    }

    public Double getRate() {
        return rate;
    }

    public Double getGross() {
        return gross;
    }

}
