🎓 Course Management System - Spring Boot
Spring Boot 3.x ile geliştirilmiş modern, ölçeklenebilir kurs yönetim sistemi. Öğrenci, öğretmen, kurs, sepet ve sipariş yönetimi için kapsamlı REST API sağlar.

🚀 Teknolojik Özellikler
⚙️ Teknoloji Stack'i
Java 21 - Modern Java sürümü

Spring Boot 3.5.6 - Enterprise framework

Spring Data JPA - Veri erişim katmanı

Spring Validation - Girdi doğrulama

PostgreSQL - Production veritabanı

Lombok - Boilerplate kod azaltma

MapStruct - DTO mapping

SpringDoc OpenAPI 3 - API dokümantasyonu

Maven - Bağımlılık yönetimi

🏗️ Mimari Özellikler
Clean Architecture prensipleri

DTO Pattern - Entity koruma

RESTful API Design

Layered Architecture (Controller-Service-Repository)

Annotation-based Validation

📊 Sistem Özellikleri
👨‍🎓 Öğrenci Modülü
✅ Öğrenci kayıt ve profil yönetimi

✅ Kurs arama ve kayıt olma

✅ Sepet yönetimi

✅ Sipariş oluşturma ve takip

✅ Kurs geçmişi görüntüleme

👨‍🏫 Öğretmen Modülü
✅ Öğretmen kayıt ve yönetimi

✅ Kurs oluşturma, güncelleme, silme

✅ Kurs içerik yönetimi

✅ Öğrenci listeleri görüntüleme

📚 Kurs Modülü
✅ Kurs katalog yönetimi

✅ Kategori ve filtreleme

✅ Kapasite yönetimi

✅ Kurs durumu takibi

🛒 E-Ticaret Modülü
✅ Sepet işlemleri

✅ Sipariş yönetimi

✅ Ödeme entegrasyonu hazır

✅ Sipariş takip sistemi

🛠️ Kurulum ve Çalıştırma
Gereksinimler
Java 21 (Oracle JDK veya OpenJDK)

Maven 3.6+

PostgreSQL 14+ (opsiyonel - H2 de kullanılabilir)

Git

🚀 Hızlı Başlangıç
Projeyi klonlayın:

bash
git clone https://github.com/yourusername/spring-enoca.git
cd Spring-enoca
Veritabanını yapılandırın:

properties
# application-dev.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/coursedb
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
Uygulamayı başlatın:

bash
# Geliştirme modunda
mvn spring-boot:run -Pdev

# Veya
mvn clean install
java -jar target/Spring-enoca-0.0.1-SNAPSHOT.jar
API Dokümantasyonuna erişin:

text
http://localhost:8080/swagger-ui.html
http://localhost:8080/v3/api-docs
📡 API Endpoint'leri
Öğrenci İşlemleri (/api/students)
Method	Endpoint	Açıklama
POST	/api/students	Yeni öğrenci kaydı
GET	/api/students	Tüm öğrenciler
GET	/api/students/{id}	Öğrenci detayı
PUT	/api/students/{id}	Öğrenci güncelle
DELETE	/api/students/{id}	Öğrenci sil
GET	/api/students/{id}/courses	Öğrenci kursları
POST	/api/students/{id}/orders	Sipariş oluştur
Öğretmen İşlemleri (/api/teachers)
Method	Endpoint	Açıklama
POST	/api/teachers	Yeni öğretmen
GET	/api/teachers/{id}/courses	Öğretmen kursları
POST	/api/teachers/{id}/courses	Yeni kurs oluştur
Kurs İşlemleri (/api/courses)
Method	Endpoint	Açıklama
GET	/api/courses	Tüm kurslar
GET	/api/courses/available	Müsait kurslar
GET	/api/courses/student/{id}	Öğrenci kursları
Sepet İşlemleri (/api/carts)
Method	Endpoint	Açıklama
GET	/api/carts/student/{id}	Sepeti görüntüle
POST	/api/carts/student/{id}/courses/{courseId}	Sepete ekle
DELETE	/api/carts/student/{id}/courses/{courseId}	Sepetten çıkar
🔧 Yapılandırma
Maven Profilleri
bash
# Geliştirme modu (default)
mvn spring-boot:run -Pdev

# Production modu
mvn spring-boot:run -Pprod
Veritabanı Seçenekleri
properties
# PostgreSQL (Production)
spring.datasource.url=jdbc:postgresql://localhost:5432/coursedb

# H2 Database (Development)
spring.datasource.url=jdbc:h2:mem:coursedb
🧪 Test
Unit Testleri Çalıştırma
bash
mvn test

# Test raporu oluşturma
mvn surefire-report:report
Postman Test Koleksiyonu
Proje içinde Postman koleksiyonu bulunmaktadır. Tüm API endpoint'lerini test edebilirsiniz.

📁 Proje Yapısı
text
src/main/java/com/coursemanagement/
├── controller/          # REST Controllers
├── service/            # Business logic layer
├── repository/         # Data access layer (JPA)
├── entity/            # JPA Entities
├── dto/               # Data Transfer Objects
├── mapper/            # MapStruct mappers
└── config/            # Configuration classes
🌟 Öne Çıkan Özellikler
✅ Modern Java 21 Özellikleri
Record classes

Pattern matching

Enhanced null safety

✅ Production Ready
OpenAPI 3 dokümantasyonu

Comprehensive error handling

Input validation

Proper logging

✅ Ölçeklenebilir Mimari
Clean code principles

Dependency injection

Modular structure

Easy to extend

📄 Lisans
Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için LICENSE dosyasına bakın.

👥 Katkıda Bulunma
Fork edin

Feature branch oluşturun (git checkout -b feature/amazing-feature)

Commit edin (git commit -m 'Add amazing feature')

Push edin (git push origin feature/amazing-feature)

Pull Request oluşturun

📞 İletişim
Geliştirici: Your Name
Proje Linki: https://github.com/yourusername/spring-enoca

⭐ Bu projeyi beğendiyseniz yıldız vermeyi unutmayın!

