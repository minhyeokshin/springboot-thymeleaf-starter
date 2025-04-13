<div align="center">

<h1>🚀 SpringBoot Thymeleaf Starter</h1>

A clean and ready-to-use template for Spring Boot + Thymeleaf-based web applications.  
Ideal for rapid prototyping, team onboarding, and structured development.

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-yellow?logo=thymeleaf)](https://www.thymeleaf.org/)

</div>

---

## 📦 Features

- 📁 Modular folder structure for easy development
- 🎨 Integrated with [AdminKit](https://github.com/adminkit/adminkit) (MIT) for modern UI
- 🧱 Spring MVC + Thymeleaf + Gradle setup
- 🔐 Application secrets managed separately (`application-secret.properties`)
- 🌐 Basic multi-role layout (admin, user) fragment system ready
- 🧹 Pre-configured `.gitignore`, Gradle wrapper, directory conventions

---

## 🗂 Folder Structure


```
src/main/java/com.springboot.starter
├── cache              # Redis 등 캐시 관련 / Cache-related modules (e.g., Redis)
├── common             # 공통 기능 / Common features (e.g., Response, Exception)
├── config             # 설정 관련 / Configuration (WebMvc, Swagger, Security)
├── constant           # 공통 상수 / Shared constants (e.g., error messages, keys)
├── domain             # 도메인 계층 / Domain layer (Entities, Aggregates)
│   └── admin
│       └── menu1
│           └── controller         # 컨트롤러 / Controller
│           └── repository         # 레포지토리 / Repository (Mapper or JPA)
│           └── service            # 서비스 / Business logic service
│       └── ....                   # 다른 메뉴 / Other menus
│   └── user
│       └── ....                   # 사용자 기능 / User modules
├── dto                            # 요청/응답 DTO / Request & Response DTOs
├── exception                      # 예외 처리 / Custom Exception handling
├── mysql                          # 직접 쿼리 작성 / Raw SQL queries (optional)
├── temp                           # 임시 작업 / Temporary or test modules
├── util                           # 공통 유틸 클래스 / Utility classes
└── SpringbootThymeleafStarterApplication.java   # 메인 클래스 / Main Spring Boot Application

src/main/resources
├── application.properties          # 일반 설정 / Default config (e.g., DB)
├── application-secret.properties   # 민감 설정 / Secrets (e.g., credentials)
├── application.yml                 # YAML 설정 / YAML-based config
├── static                          # 정적 리소스 / Static resources (css, js, images)
│   ├── css/
│   ├── fonts/
│   ├── img/
│   └── js/
├── templates                       # 타임리프 템플릿 / Thymeleaf templates
│   ├── admin/                      # 관리자 영역 / Admin section
│   │   ├── common/                 
│   │   │  └── fragments/           # 프르개먼트 / fragments
│   │   │  └── layouts/             # 레이아웃 / Layout templates
│   │   └── pages/                  # 기능별 페이지 / Feature pages (e.g., inbound)
│   ├── user/                       # 사용자 영역 / User section
│   │   ├── common/                 
│   │   │  └── fragments/           # 프르개먼트 / fragments
│   │   │  └── layouts/             # 레이아웃 / Layout templates
│   │   └── pages/                  # 기능별 페이지 / Feature pages
└───└── common/                     # 공용 템플릿 / Shared templates
```
---

## 🚀 Getting Started

### 1. Clone this repo

```bash
git clone https://github.com/minhyeokshin/springboot-thymeleaf-starter.git
```


### 2. Add your DB config

#### application-secret.properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb  
spring.datasource.username=root  
spring.datasource.password=yourpw
```

### 3. Run the app
```
./gradlew clean build
./gradlew bootRun
👉 App starts on: http://localhost:8080
```
---

💡 Based On
```
🧩 Spring Boot 3.x
✍️ Thymeleaf
🧰 Gradle (Groovy DSL)
🎨 [Adminkit UI Template](https://github.com/adminkit/adminkit)
```
 ---
 

🧾 License

This project is open-sourced under the MIT license.
Includes resources from Adminkit (MIT).

🙋 Author

Minhyeok Shin

기능보다 설계를 먼저 생각하는 백엔드 개발자입니다.  
구조화된 템플릿을 통해 팀원 생산성을 높이는 걸 좋아합니다.  

- GitHub: [@minhyeokshin](https://github.com/minhyeokshin)  
- Email: sinminhyeok@gmail.com  


<p align="center">
  ⭐️ If you like it, please give this project a star!
</p>

