

public class CashFlow {
    private String cashFlowItem;
    private Integer income;
    private Integer outgo;

    public CashFlow(String cashFlowItem, int income, int outgo) {
        this.cashFlowItem = cashFlowItem;
        this.income = income;
        this.outgo = outgo;
    }

    public String getCashFlowItem() {
        return cashFlowItem;
    }

    public void setCashFlowItem(String cashFlowItem) {
        this.cashFlowItem = cashFlowItem;
    }

    public Integer getOutGo() {
        return outgo;
    }

    public void setOutGo(Integer outGo) {
        this.outgo = outGo;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

}
