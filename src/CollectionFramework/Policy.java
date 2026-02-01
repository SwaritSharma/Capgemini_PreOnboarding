package CollectionFramework;

import java.time.LocalDate;
import java.util.*;

public class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String holderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String holderName, LocalDate expiryDate, String coverageType,
            double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        int dateComp = this.expiryDate.compareTo(other.expiryDate);
        if (dateComp != 0)
            return dateComp;
        return this.policyNumber.compareTo(other.policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "num='" + policyNumber + '\'' +
                ", holder='" + holderName + '\'' +
                ", expiry=" + expiryDate +
                ", coverage='" + coverageType + '\'' +
                ", premium=" + premiumAmount +
                '}';
    }
}
