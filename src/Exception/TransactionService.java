package Exception;

public class TransactionService {

    public void processTransaction(String transactionId) throws TransactionException {
        try {
            if (transactionId == null) {
                throw new IllegalArgumentException("Transaction ID is null");
            }
            System.out.println("Processing transaction: " + transactionId);
        } catch (Exception e) {
            throw new TransactionException(
                    "Failed to process transaction: " + transactionId, e
            );
        }
    }
}

