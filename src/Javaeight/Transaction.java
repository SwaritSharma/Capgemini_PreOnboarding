package Javaeight;

class Transaction {
    String transactionId, policyNumber;
    double amount;
    boolean isFraudulent;

    Transaction(String t, String p, double a, boolean f) {
        transactionId = t;
        policyNumber = p;
        amount = a;
        isFraudulent = f;
    }
}
