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
```
`Baris pertama dan kedua merupakan settingan  untuk data definition language yang otomatis menambahkan table pada database yang kita defenisikan.  Table akan di create otomatis berdasarkan nama table yang akan kita define di Entity`
- Class Entity
- Repository dan Service
- Class Controller
- Testing Endpoint With Postman

