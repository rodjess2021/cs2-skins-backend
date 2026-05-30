# ⚙️ CS2 Skins Manager - Backend

Backend desarrollado con Spring Boot para la gestión de armas, skins y categorías de Counter-Strike 2.

Expone una API REST consumida por el frontend Angular, permitiendo registrar y consultar armas personalizadas almacenadas en base de datos.

---

## 🚀 API Desplegada

Backend:

https://cs2-skins-backend.onrender.com

> Nota: El proyecto está desplegado en Render (plan gratuito). La primera petición puede tardar algunos segundos mientras el servidor se reactiva.

---

## ✨ Funcionalidades

- Consulta de skins disponibles.
- Consulta de categorías de rareza.
- Registro de armas personalizadas.
- Asociación entre armas, skins y categorías.
- Persistencia mediante JPA/Hibernate.
- Exposición de endpoints REST.
- Integración con frontend Angular.
- Configuración CORS para consumo desde Vercel.

---

## 🛠 Tecnologías utilizadas

### Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

### Base de Datos

- PostgreSQL

### Deploy

- Render

---

## 📂 Estructura del proyecto

```text
src/main/java/com.app.demo
│
├── controlador
│   ├── ArmaControlador
│   ├── SkinControlador
│   └── CategoriaControlador
│
├── modelo
│   ├── Arma
│   ├── Skin
│   └── Categoria
│
├── repositorio
│   ├── ArmaRepositorio
│   ├── SkinRepositorio
│   └── CategoriaRepositorio
│
├── servicio
│   ├── ArmaServicio
│   ├── SkinServicio
│   └── CategoriaServicio
│
└── DemoApplication
```

---

## 🗄 Modelo de datos

### Arma

| Campo | Tipo |
|---------|---------|
| id | Integer |
| nombre | String |
| statTrak | Boolean |
| imagenUrl | String |

Relaciones:

- Una arma pertenece a una categoría.
- Una arma pertenece a una skin.

### Skin

| Campo | Tipo |
|---------|---------|
| id | Integer |
| nombre | String |

### Categoria

| Campo | Tipo |
|---------|---------|
| id | Integer |
| nombre | String |

---

## 🔗 Endpoints principales

### Categorías

```http
GET /categoria
```

Obtiene todas las categorías.

---

### Skins

```http
GET /skin
```

Obtiene todas las skins registradas.

---

### Armas

```http
GET /arma
```

Obtiene todas las armas.

```http
POST /arma
```

Registra una nueva arma.

Ejemplo:

```json
{
  "nombre": "AK-47 Asiimov",
  "statTrak": true,
  "imagenUrl": "https://...",
  "categoria": {
    "id": 5
  },
  "skin": {
    "id": 10
  }
}
```

---

## ⚙️ Instalación local

Clonar repositorio:

```bash
git clone https://github.com/TU-USUARIO/cs2-skins-backend.git
```

Ingresar al proyecto:

```bash
cd cs2-skins-backend
```

Configurar credenciales de base de datos en:

```properties
application.properties
```

Ejecutar:

```bash
mvn spring-boot:run
```

La API estará disponible en:

```text
http://localhost:8080
```

---

## 🔗 Frontend

Repositorio frontend:

https://github.com/TU-USUARIO/cs2-skins-frontend

Aplicación desplegada:

https://cs2-skins-blond.vercel.app

---

## 🚧 Mejoras futuras

- Eliminación de armas.
- Edición de armas.
- Paginación.
- Filtros por categoría.
- Validación de URLs permitidas.
- Autenticación y autorización.
- Documentación Swagger/OpenAPI.
- Dockerización.

---

## 👨‍💻 Autor

Desarrollado por **Rodrigo (rodjess.pe)**

Instagram:

https://www.instagram.com/rodjess.pe
