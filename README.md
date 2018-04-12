# Rest Api Service With Spring Boot API
- Setup project springboot
```
Untuk memudahkan setup project, silakan membuka https://start.spring.io
Disini anda bisa menambahkan artifact,Group dan dependency yang dibutuhkan
```
- Database Configuration
```
spring.jpa.show-sql: true
spring.jpa.hibernate.ddl-auto: update

spring.datasource.url=jdbc:mysql://localhost:3306/uefaeuropaschedule
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.databasePlatform=org.hibernate.dialect.MySQLDialect

Baris pertama dan kedua merupakan settingan  untuk data definition language yang otomatis 
menambahkan table pada database yang kita defenisikan.  Table akan di create otomatis berdasarkan
nama table yang akan kita define di Entity
```
- Class Entity
```
Entiti digunakan untuk settingan yang berhubungan dengan ddl. pada kelas entity semua table dan 
kolom kolom di defenisikan. untuk memudahkan proses setter dan getter jika menggunakan Netbean, 
silahkan klik kanan pada kelas entity lalu refactor->Encapsulated Fields->Select All->Refactor. 
Dengan melakukan hal diatas, maka method setter dan getter akan otomatis ditambahkan
```
- Repository dan Service
```
Repository merupakan kelas kelas data akses object yang berhubungan dengan manipulasi database. 
Service digunakan untuk membungkus kelas kelas bisnis proses yang transaksional. 
Pada kelas service berhubungan dengan transaksional data. Transaksional berfungsi untuk 
memastikan sebuah data benar benar di commit atau di rollbacks
```
- Class Controller
```
kelas-kelas yang mengendalikan alur program secara keseluruhan, mengandung business logic, 
dan sebagai penghubung antara model dan dao. Kelas ini akan merespon permintaan atau aksi 
dari view ke kelas dao yang diinginkan
```
- Testing Endpoint With Postman
```
1. getAll
2. Insert
3. searchByHari
4. Delete
```
