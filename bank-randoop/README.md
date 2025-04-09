
# 🧪 Kiểm thử tự động bằng Randoop

## 📌 Mục tiêu

Thực hiện kiểm thử tự động hai bài toán Java bằng công cụ **Randoop**:

1. **`BankAccount.java`** – không có lỗi (test case đều pass).
2. **`Customer.java`** – có lỗi logic (giao dịch vượt hạn mức).

---

## ⚙️ Yêu cầu hệ thống

- Hệ điều hành: Windows
- Java JDK 8 trở lên
- Tải [Randoop jar file](https://randoop.github.io/randoop/) → `randoop-all-4.3.3.jar`
- Visual Studio Code hoặc bất kỳ IDE nào

---

## 📁 Cấu trúc thư mục

```
bank-randoop/
├── BankAccount.java
├── Customer.java
├── randoop-all-4.3.3.jar
└── randoop-tests/          ← Thư mục sẽ được tạo tự động
```

---

## 🔹 Bài 1: `BankAccount.java` – Test không có lỗi

### ✅ Mục tiêu:
Kiểm thử các chức năng cơ bản: `deposit`, `withdraw`, `getBalance`.

### ✅ Các bước thực hiện:

1. **Biên dịch:**
   ```bash
   javac BankAccount.java
   ```

2. **Sinh test bằng Randoop:**
   ```bash
   java -cp ".;randoop-all-4.3.3.jar" randoop.main.Main gentests --testclass=BankAccount --time-limit=10 --junit-output-dir=randoop-tests
   ```

3. **Biên dịch test:**
   ```bash
   javac -cp ".;randoop-all-4.3.3.jar;randoop-tests" randoop-tests\RegressionTest0.java
   ```

4. **Chạy test:**
   ```bash
   java -cp ".;randoop-all-4.3.3.jar;randoop-tests" org.junit.runner.JUnitCore RegressionTest0
   ```

### ✅ Kết quả:
- Các test case đều **PASS**
- Không có lỗi logic hay runtime

---

## 🔸 Bài 2: `Customer.java` – Test có lỗi logic

### ❌ Mục tiêu:
Phát hiện bug logic cho phép khách hàng **vượt quá hạn mức tín dụng**.

### ❌ Vấn đề:
- Ban đầu `makePurchase()` không kiểm tra vượt hạn mức.
- Randoop **không bắt được lỗi** vì không có exception hoặc assertion.

### ✅ Cách xử lý:
- Thêm `IllegalArgumentException` vào khi mua vượt hạn mức → Randoop sẽ tự động phát hiện và tạo test **fail**.

---

## 📈 Ý nghĩa các chỉ số khi chạy Randoop

| Thông số                         | Ý nghĩa                                                                 |
|----------------------------------|-------------------------------------------------------------------------|
| `Normal method executions`       | Số lần gọi hàm chạy bình thường (không lỗi)                            |
| `Exceptional method executions`  | Số lần xảy ra lỗi/exception trong khi gọi hàm                          |
| `Regression test count`          | Số test hồi quy được sinh ra                                           |
| `No error-revealing tests`       | Không có test gây lỗi logic/ngoại lệ nghiêm trọng                      |
| `error seqs`                     | Số chuỗi lệnh dẫn đến lỗi nghiêm trọng                                 |
| `num_failed_output_test`         | Số test sinh ra nhưng không thể thực thi đúng (thường do lỗi logic)   |

---

## 💡 Gợi ý mở rộng

- Dùng thêm cờ: `--flaky-test-behavior=DISCARD` để loại bỏ test không ổn định
- Tích hợp với Maven/Gradle + CI/CD để test tự động theo phiên bản
- Áp dụng tương tự cho các class như: `LoanAccount`, `Transaction`, `CreditCard`, v.v.

---

## ✅ Tổng kết

- `BankAccount.java`: minh họa test tự động **không có lỗi**
- `Customer.java`: phát hiện lỗi logic khi vượt hạn mức
- Randoop có thể tìm ra lỗi tốt nếu kết hợp **exception + assert đúng cách**

Chúc bạn kiểm thử thành công! 💥
