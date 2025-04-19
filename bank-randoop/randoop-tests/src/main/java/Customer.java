public class Customer {
    private String name;
    private int creditLimit;
    private int currentDebt;

    public Customer(String name, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.currentDebt = 0;
    }

    // BUG: Cho phép mua quá hạn mức tín dụng
    // public void makePurchase(int amount) {
    //     currentDebt += amount;
    // }

    // lỗi vượt hạn mức sẽ dc bắt ở đây
    public void makePurchase(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount");
        if (amount > getRemainingCredit())
            throw new IllegalArgumentException("Credit limit exceeded"); // ✅ THÊM DÒNG NÀY
        currentDebt += amount;
    }
    

    // public void makePurchase(int amount) {
    //     if (amount < 0) throw new IllegalArgumentException("Invalid amount");
    //     if (amount > getRemainingCredit())
    //         throw new IllegalArgumentException("Credit limit exceeded");
    //     currentDebt += amount;
    // }

    public int getRemainingCredit() {
        return creditLimit - currentDebt;
    }

    public int getCurrentDebt() {
        return currentDebt;
    }

    public String getName() {
        return name;
    }
}
