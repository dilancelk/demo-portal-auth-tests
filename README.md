# 🟦 Demo Portal Auth Tests – Web Login Automation

Bu proje, örnek bir web portalı üzerinde **geçersiz kullanıcı bilgileri ile giriş deneme otomasyonunu** gerçekleştirmek için geliştirilmiştir.  
Gauge BDD framework, Java ve Selenium WebDriver kullanılarak hazırlanmış **profesyonel bir test otomasyon mimarisidir.**

---

## 🚀 Özellikler

- **Gauge BDD Framework** – Spesifikasyon tabanlı test yazımı  
- **Java + Selenium WebDriver** – UI etkileşim otomasyonu  
- **Page Object Model (POM)** – Temiz, modüler ve sürdürülebilir mimari  
- **Reusable Steps** – Tekrar kullanılabilir adım yapıları  
- **Invalid Login Testleri** – User ID, Password, Security Code  
- **Custom Utilities** – DBQuery, ExcelUtil, MailTemplate, DriverFactory  
- **Screenshot & Report** desteği  
- **Gerçek hayat iş görüşmesi portföyü için uygun yapı**

---

## 🧪 Örnek Senaryo (Specification)

```spec
Scenario: Invalid login attempt on Demo Portal

* Navigate to Demo Portal homepage
* Click the Login button
* Enter User ID and Password
* Enter Security Verification Code
* Click Submit button
* Validate that an error message is displayed

PROJE YAPISI
demo-portal-auth-tests/
│
├── specs/                      → Gauge senaryo dosyaları (.spec)
│
├── src
│   └── test
│        └── java
│             └── com.web.base
│                  ├── pages/           → Page Object sınıfları
│                  ├── pagesteps/       → Step Implementations
│                  ├── utils/           → DBQuery, ExcelUtil, VoucherUtil, Template vb.
│                  ├── driver/          → Driver + DriverFactory
│                  ├── reporting/       → Raporlama yardımcıları
│                  └── template/        → Mail & HTML template
│
├── screenshots/               → Ekran görüntüleri
├── env/                       → Ortam yapılandırmaları
├── pom.xml                    → Maven bağımlılık yönetimi
└── README.md


Kullanılan Teknolojiler

*Java 11+
*Gauge BDD
*Selenium WebDriver
*Maven
*Page Object Model
*Custom Utility Framework
*Windows / Mac destekli
