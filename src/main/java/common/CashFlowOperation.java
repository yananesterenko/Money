package common;

public class CashFlowOperation {
        private String dateTransaction;
        private String cashFlowItem;
        private Integer id;
        private String typeOperation;
        private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getDateTransaction() {
            return dateTransaction;
        }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;

    }


    public String getCashFlowItem() {
            return cashFlowItem;
        }

    public void setCashFlowItem(String cashFlowItem) {
            this.cashFlowItem = cashFlowItem;
        }


       }
