# Operaciones con Conjuntos

## 📌 Descripción
Este es un programa en **Java** que permite al usuario ingresar dos conjuntos de números enteros y realizar diversas operaciones entre ellos, como unión, intersección y diferencia.

## 🚀 Características
- Permite al usuario ingresar dos conjuntos de números enteros.
- Utiliza `HashSet` para evitar elementos duplicados.
- Realiza operaciones de:
  - **Unión**: Combina ambos conjuntos sin duplicados.
  - **Intersección**: Encuentra los elementos en común entre ambos conjuntos.
  - **Diferencia**: Muestra los elementos que están en un conjunto pero no en el otro.
- Muestra los resultados en la consola.

## 🛠️ Tecnologías utilizadas
- **Java**
- **HashSet** para la gestión de conjuntos.
- **Scanner** para entrada de datos desde la consola.

## 📌 Requisitos previos
Para ejecutar este programa, necesitas:
- Tener instalado **GIT**.
- Tener instalado **Java (JDK) 17.0.13 o superior**.
- Tener instalado **Visual Studio Code** con la extensión **Code Runner** o **Debugger for Java**.

## 📖 Uso
### 1️⃣ Clonar el repositorio
```bash
 git clone https://github.com/RicardoArevaloB/Operaciones-con-Conjuntos.git
```

### 2️⃣ Abrir en Visual Studio Code
- Abre **Visual Studio Code**.
- Ve a **Archivo > Abrir carpeta** y selecciona la carpeta del proyecto.
- Instala la extensión **Debugger for Java** si aún no la tienes.

### 3️⃣ Ejecutar el programa
- Abre el archivo `OperacionesConConjuntos.java` en **Visual Studio Code**.
- Presiona `Ctrl + F5` para ejecutar el programa.
- Alternativamente, puedes usar el botón **Ejecutar** en la parte superior.

### 4️⃣ Interactuar con la aplicación
- Ingresa los números para cada conjunto.
- Escribe **"fin"** para finalizar la entrada de cada conjunto.
- La aplicación mostrará:
  - Los dos conjuntos ingresados.
  - La **unión** de ambos conjuntos.
  - La **intersección** entre ellos.
  - La **diferencia** entre los conjuntos en ambas direcciones.

## 📷 Ejemplo de ejecución
```
🌟 BIENVENIDO A LAS OPERACIONES CON CONJUNTOS 🌟

Por favor, ingresa los números del PRIMER conjunto (escribe 'fin' para terminar):
Ingresa un número: 5
Ingresa un número: 3
Ingresa un número: 8
Ingresa un número: fin

Por favor, ingresa los números del SEGUNDO conjunto (escribe 'fin' para terminar):
Ingresa un número: 3
Ingresa un número: 7
Ingresa un número: 8
Ingresa un número: fin

📝 Conjunto 1: [3, 5, 8]
📝 Conjunto 2: [3, 7, 8]

✨ Unión de los conjuntos: [3, 5, 7, 8]
✨ Intersección de los conjuntos: [3, 8]
✨ Diferencia 1 (Conjunto 1 - Conjunto 2): [5]
✨ Diferencia 2 (Conjunto 2 - Conjunto 1): [7]
```

Hecho por [Ricardo Arevalo Boorquez](https://github.com/RicardoArevaloB)

>[!NOTE]
>Este es un proyecto que esta hecho con fines educativos.



