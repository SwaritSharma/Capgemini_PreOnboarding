package Javaeight;

class Claim {
    String claimId, policyNumber, status;
    double claimAmount;

    Claim(String c, String p, double a, String s) {
        claimId = c;
        policyNumber = p;
        claimAmount = a;
        status = s;
    }
}
