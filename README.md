# 📝 Sistema de Gestión de Notas por Usuario

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Console](https://img.shields.io/badge/Consola-Terminal-4D4D4D?style=for-the-badge&logo=windows-terminal&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Aplicación de consola en Java que permite el registro de usuarios, autenticación (login) y gestión completa de notas personales. El proyecto destaca por su persistencia de datos mediante ficheros de texto (`java.nio.file`) y una arquitectura de software limpia y estructurada en capas.

## ✨ Características Principales

### Sistema de Usuarios
- **Registro de usuarios:** Validación de credenciales y creación de un entorno de trabajo único por usuario.
- **Inicio de sesión (Login):** Verificación de credenciales leyendo la base de datos de texto.
- **Sanitización de datos:** Las carpetas de usuario se generan adaptando el email (eliminando caracteres especiales como `@` y `.`).

### Gestión de Notas (CRUD)
- **Crear nota:** Almacenamiento seguro en la carpeta personal del usuario.
- **Listar notas:** Lectura dinámica de ficheros para mostrar todas las notas numeradas.
- **Ver nota en detalle:** Recuperación del contenido completo mediante su identificador.
- **Eliminar nota:** Reescritura del fichero actualizando la persistencia de datos al instante.

---

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una arquitectura en capas (basada en el patrón MVC) para separar responsabilidades y mantener el código limpio y escalable:

- `model`: Entidades de datos (ej. `Usuario`, `Nota`).
- `repository`: Encargado de la persistencia de datos (lectura y escritura de ficheros `.txt`).
- `Service`: Lógica de negocio (validaciones, algoritmos de encriptación, reglas de la app).
- `controller`: Intermediario entre la vista y los servicios.
- `View`: Interfaz de usuario por consola (menús y entrada de datos con `Scanner`).
- `App`: Punto de entrada de la aplicación (`Main`).

---

## 📁 Estructura de Ficheros (Persistencia)

Los datos se guardan localmente en la carpeta raíz del proyecto, generada de forma automática si no existe:

```text
/data
  ├── users.txt                       # Almacena "email;password" de todos los usuarios
  └── /usuarios
      └── /ejemplogmailcom            # Carpeta única por usuario (email sanitizado)
          └── notas.txt               # Fichero con las notas (titulo;contenido)
