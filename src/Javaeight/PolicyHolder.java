package Javaeight;

class PolicyHolder {
    int holderId, age;
    String name, policyType;
    double premium;

    PolicyHolder(int i, String n, int a, String p, double pr) {
        holderId = i;
        name = n;
        age = a;
        policyType = p;
        premium = pr;
    }
}

