
# 🎓 Quản lý học viên – Kiểm thử tự động bằng Randoop

## 📌 Mô tả bài toán

Hệ thống quản lý học viên và đăng ký khóa học, bao gồm:

- **Student**: học viên có `id` và `name`
- **Course**: khóa học có `code` và `name`
- **StudentManager**: lớp chính quản lý:
  - Danh sách học viên (`Set`)
  - Khóa học mỗi học viên đăng ký (`Map<Student, List<Course>>`)

---

## 🛠 Cấu trúc file

```
student-randoop/
├── Student.java
├── Course.java
├── StudentManager.java
├── randoop-all-4.3.3.jar
└── randoop-tests/          ← Tự sinh sau khi chạy Randoop
```

---

## ⚙️ Các bước kiểm thử bằng Randoop

### Bước 1: Biên dịch toàn bộ mã nguồn

```bash
javac *.java
```

---

### Bước 2: Chạy Randoop để sinh test tự động

```bash
java -cp ".;randoop-all-4.3.3.jar" randoop.main.Main gentests --testclass=StudentManager --time-limit=15 --junit-output-dir=randoop-tests
```

👉 Sau bước này, thư mục `randoop-tests/` sẽ xuất hiện với các file như `RegressionTest0.java`.

---

### Bước 3: Biên dịch test

```bash
javac -cp ".;randoop-all-4.3.3.jar;randoop-tests" randoop-tests\RegressionTest0.java
```

---

### Bước 4: Chạy test bằng JUnit

```bash
java -cp ".;randoop-all-4.3.3.jar;randoop-tests" org.junit.runner.JUnitCore RegressionTest0
```

---

## 🐞 Các lỗi logic có thể được phát hiện

- Thêm học viên trùng → Exception
- Đăng ký khóa học cho học viên chưa tồn tại → Exception
- Đăng ký trùng khóa học → Exception
- Truy vấn học viên chưa tồn tại → Exception

✅ Những điều này sẽ được Randoop sinh test và kiểm tra tự động.

---

## 📊 Giải thích log Randoop (tiêu biểu)

| Thông số                         | Ý nghĩa                                                                 |
|----------------------------------|-------------------------------------------------------------------------|
| `Regression test count`          | Số lượng test hồi quy được tạo                                         |
| `Exceptional method executions`  | Số lần xảy ra lỗi/exception khi gọi hàm                               |
| `error seqs`                     | Số chuỗi lệnh gây lỗi nghiêm trọng                                     |
| `No error-revealing tests`       | Nếu có → Randoop không tìm ra lỗi nghiêm trọng nào                     |


Chúc bạn học tốt và kiểm thử thành công! 🚀
