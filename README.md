# Spring Security

A comprehensive collection of Spring Security examples demonstrating authentication, authorization, password encryption, CSRF protection, security filter chains, user management, roles, and permissions. This repository is designed to help beginners and Java Full Stack developers understand the core concepts of Spring Security through practical implementations.

---

## 📚 Topics Covered

- Spring Security Basics
- Security Filter Chain Customization
- User Authentication
- Database Authentication
- Password Encryption using BCrypt
- Multiple User Authentication
- Role-Based Authorization
- Permission-Based Authorization
- CSRF Protection
- Spring Security Best Practices

---

## 📂 Repository Structure

```
SpringSecurity/
│
├── AuthorizationRolesAndPermissions/
├── CustomizingSecurityFilterChain/
├── MultipleUsersInSpringSecurity/
├── SpringSecurity/
├── SpringSecurityCSRF/
├── UserAuthencationByEncryptedPassword/
└── UserAuthenticationVerifyingFromDatabase/
```

---

## 📖 Modules

### 🔐 SpringSecurity
Introduction to Spring Security and basic authentication.

**Concepts Covered**
- Spring Security setup
- In-memory authentication
- Default login page
- Authentication flow
- Basic security configuration

---

### ⚙️ CustomizingSecurityFilterChain
Demonstrates how to customize the Spring Security filter chain.

**Concepts Covered**
- SecurityFilterChain
- Request authorization
- Custom login configuration
- Public and protected endpoints
- HTTP Security configuration

---

### 👥 MultipleUsersInSpringSecurity
Shows how multiple users can be configured using in-memory authentication.

**Concepts Covered**
- Multiple users
- Different roles
- In-memory authentication
- Access control

---

### 🛡️ SpringSecurityCSRF
Explains Cross-Site Request Forgery (CSRF) protection in Spring Security.

**Concepts Covered**
- CSRF attacks
- CSRF tokens
- Enable/Disable CSRF
- POST request protection

---

### 🔒 UserAuthencationByEncryptedPassword
Demonstrates password encryption using BCryptPasswordEncoder.

**Concepts Covered**
- BCrypt hashing
- PasswordEncoder
- Secure password storage
- Password verification

---

### 🗄️ UserAuthenticationVerifyingFromDatabase
Shows how authentication is performed using user credentials stored in a database.

**Concepts Covered**
- Spring Data JPA
- UserDetailsService
- UserDetails
- Custom authentication
- Database integration
- MySQL

---

### 👑 AuthorizationRolesAndPermissions
Implements Role-Based Access Control (RBAC) and Permission-Based Authorization.

**Concepts Covered**
- Roles
- Permissions
- GrantedAuthority
- hasRole()
- hasAuthority()
- Endpoint authorization

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## ⚙️ Prerequisites

- Java 17 or above
- Maven
- MySQL
- IntelliJ IDEA / Eclipse
- Postman (Optional)

## 🎯 Learning Outcomes

After completing these examples, you will understand:

- Spring Security Architecture
- Authentication vs Authorization
- SecurityFilterChain
- UserDetailsService
- UserDetails
- Password Encoding
- BCryptPasswordEncoder
- Roles and Permissions
- Database Authentication
- CSRF Protection
- Securing REST APIs

---

## 👨‍💻 Author

Made with ❤️ by **Dhanush N**
