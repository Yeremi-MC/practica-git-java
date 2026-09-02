## Actividad 1: Entorno de Desarrollo

- **Java:** 21.0.12.1
- **Javac:** 21.0.12.1 
- **Git:** 2.55.0.windows.5 
- **Sistema operativo:** Windows 10 
- **Editor utilizado:** Visual Studio Code 

## Activividad 2: Primer Programa en Java

### 1. ¿Qué función cumple `main`?
Es el punto de entrada principal de la aplicación. Es el primer método que la Máquina Virtual de Java (JVM) busca y ejecuta al iniciar el programa.

### 2. ¿Qué diferencia existe entre `javac` y `java`?
- `javac` es el compilador de Java; traduce el código fuente (`.java`) a código ejecutable en bytecode (`.class`).
- `java` es el ejecutable de la máquina virtual (JVM); toma el archivo bytecode (`.class`) y lo interpreta para ejecutar el programa.

### 3. ¿Qué archivo se genera después de compilar?
Se genera un archivo con extensión `.class` (por ejemplo, `Main.class`), el cual contiene el bytecode interpretable por la JVM.

### 4. ¿Por qué el archivo se llama `Main.java`?
Porque en Java es una regla fundamental que el archivo de código fuente tenga exactamente el mismo nombre que la clase pública declarada en su interior (respetando mayúsculas y minúsculas) agregando la extensión `.java`.

### 5. ¿Qué ocurre si la clase se llama `Programa` pero el archivo se llama `Main.java`?
Ocurre un error de compilación. El compilador `javac` mostrará un mensaje indicando que la clase pública `Programa` debe estar declarada en un archivo llamado `Programa.java`.