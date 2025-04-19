# 🎓 Quản lý học viên – Kiểm thử tự động bằng Randoop & Maven

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
├── pom.xml                  ← Dự án Maven tích hợp code chính và test Randoop
├── src/
│   ├── main/
│   │   └── java/
│   │       └── your/package/
│   │           ├── Student.java
│   │           ├── Course.java
│   │           └── StudentManager.java
│   └── test/
│       └── java/
│           └── your/package/
│               └── RegressionTest0.java (và các file .java do Randoop sinh ra)
└── randoop-all-4.3.3.jar     ← JAR Randoop (nếu chạy thủ công)
```

---

## ⚙️ Các bước kiểm thử bằng Randoop (thủ công)

### Bước 1: Biên dịch toàn bộ mã nguồn

```bash
javac -d target/classes src/main/java/*.java
```

### Bước 2: Chạy Randoop để sinh test tự động

```bash
java -cp "target/classes;randoop-all-4.3.3.jar" randoop.main.Main gentests     --testclass=your.package.StudentManager     --time-limit=15     --junit-output-dir=src/test/java/your/package/
```

👉 Sau bước này, `src/test/java/` sẽ chứa các file `RegressionTest*.java`.

---

## ⚙️ Chạy test bằng Maven

Maven sẽ tự động biên dịch code chính và test, rồi chạy với JUnit & Surefire.

```bash
# Biên dịch và chạy tất cả test
mvn clean test
```

#### ✅ Redirect log ra file và kiểm tra lỗi

- Chuyển toàn bộ đầu ra và lỗi vào file `test.log`:
  ```bash
  mvn clean test > test.log 2>&1
  ```
- Kiểm tra exit code để xác nhận:
  ```bash
  echo $?
  # 0  → Thành công, không có failure
  # >0 → Có lỗi/testrunner thất bại
  ```
- Tìm nhanh chuỗi `FAILURE` hay `ERROR` trong log:
  ```bash
  grep -E "\b(FAILURE|ERROR)\b" test.log
  ```

---

## 🐞 Các lỗi logic có thể được phát hiện

- Thêm học viên trùng → `IllegalArgumentException`
- Đăng ký khóa học cho học viên chưa tồn tại → `NoSuchElementException`
- Đăng ký trùng khóa học → `IllegalStateException`
- Truy vấn học viên chưa tồn tại → `NoSuchElementException`

✅ Randoop sẽ sinh test để kiểm tra tự động các tình huống trên.

---

## 📊 Giải thích log Randoop (tiêu biểu)

| Thông số                         | Ý nghĩa                                   |
|----------------------------------|-------------------------------------------|
| `Regression test count`          | Số lượng test hồi quy được tạo            |
| `Exceptional method executions`  | Số lần xảy ra exception khi gọi hàm       |
| `error seqs`                     | Số chuỗi lệnh gây lỗi nghiêm trọng         |
| `No error-revealing tests`       | Nếu có → Randoop không tìm ra lỗi nghiêm trọng nào |

Chúc bạn học tốt và kiểm thử thành công! 🚀
