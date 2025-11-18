## Instrucciones rápidas para agentes AI

Este repositorio es una aplicación Spring Boot (Java 21, Spring Boot 3.5.x) con JPA, seguridad JWT y una API REST mínima.

- Ejecutables y build
  - Usar el wrapper Maven incluido: `./mvnw spring-boot:run` para levantar la app (Linux/fish).
  - Tests: `./mvnw test`.

- Estructura relevante
  - Paquetes principales: `com.vet_dra_alfaro.vet_proyect`.
  - Capas:
    - `domain` (modelo/servicios/puertos) — dominio de negocio.
    - `infrasctructure` (nota: está escrito "infrasctructure" en el repo) — controladores, entidades, repositorios JPA, seguridad y config.
    - `application` — DTOs y casos de uso.

- Autenticación y seguridad (puntos clave)
  - JWT está implementado por `JwtUtil` (src/.../infrasctructure/security/JwtUtil.java). Actualmente usa una clave fija `SECRET_KEY` (mejor externalizar a propiedades o variable de entorno, p.ej. `spring.jwt.secret`).
  - Filtro JWT: `JwtFilter` (src/.../infrasctructure/security/JwtFilter.java) contiene un TODO: debe extraer el header `Authorization: Bearer <token>`, validar con `JwtUtil.isTokenValid(...)` y establecer la autenticación en el `SecurityContext`.
  - `SecurityConfig` configura CORS + stateless session, `DaoAuthenticationProvider` y registra `JwtFilter` antes de `UsernamePasswordAuthenticationFilter`.
  - Controller de auth: `AuthController` está en `infrasctructure/controller/AuthController.java` y expone `/auth/login` y `/auth/register`. Nota importante: `SecurityConfig` permite `/api/auth/**` — actualmente hay una inconsistencia entre `/api/auth/**` y `/auth` (alinear rutas antes de añadir pruebas o clientes).

- CORS
  - Hay dos configuraciones de CORS: una inline en `SecurityConfig` y otra en `CorsConfig` — duplicación que hay que consolidar si se hacen cambios.

- Persistencia
  - Entidad `UserEntity` (tabla `users`) con columna `password_hash` mapeada al campo `password` — tener en cuenta el nombre de columna al escribir migraciones o SQL directo.
  - Repositorio: `infrasctructure/repository/jpa/JpaUserRepository.java` con `Optional<UserEntity> findByEmail(String email)`.

- Dependencias y versiones
  - JJWT v0.9.1 (API antigua). Evitar cambiar a versiones mayores sin revisar compatibilidad.
  - Java 21 (propiedad `<java.version>21</java.version>` en `pom.xml`).

- Patrones y convenciones del proyecto
  - Uso extensivo de Lombok para entidades y DTOs.
  - Repositorios JPA en `infrasctructure/repository/jpa`.
  - Las rutas públicas esperadas por Swagger están permitidas en `SecurityConfig` (`/swagger-ui/**`, `/v3/api-docs/**`).

- Acciones sugeridas para un agente AI al editar
  - Implementar `JwtFilter.doFilterInternal(...)` siguiendo el patrón: extraer header, validar token, cargar `UserDetails` desde `CustomUserDetailsService`, y setear `UsernamePasswordAuthenticationToken` en `SecurityContextHolder`.
  - Reconciliar rutas de auth: elegir `/api/auth/**` o `/auth` y actualizar `SecurityConfig` o `AuthController` en consecuencia.
  - Externalizar `SECRET_KEY` a `application.properties` o variable de entorno y actualizar `JwtUtil` para leerla.
  - Consolidar CORS en un único punto (preferible en `SecurityConfig` o en `CorsConfig`).

- Comandos de verificación rápida (fish shell)
  - Levantar: `./mvnw spring-boot:run`
  - Ejecutar tests: `./mvnw test`

Si falta contexto (CI, secretos en dev, o convenciones de rama), pídemelo y lo añadiré. ¿Quieres que implemente el `JwtFilter` y/o corrija la inconsistencia de rutas ahora?
