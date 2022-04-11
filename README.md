## Ejemplo de herencia en Java 👨‍👨‍👧‍👦

**Descripción:** La herencia en Java es la relación de parentesco de clases de un sistema. Vale decir que existe una clase padre con sus atributos propios que pueden ser heredados
a una clase hija. La clase hija puede heredar los atributos de la clase padre con la finalidad de reutilizar código. En este ejemplo se pueden apreciar 4 clases. `Persona` `Alumno` 
`Profesor` y `AlumnoInternacional`. En donde la clase padre en este caso es Persona, y tanto Profesor como Alumno heredan los atributos del padre, y AlumnoInternacional hereda
de Alumno, AlumnoInternacional podría ser el nieto de la clase Persona hablando en un lenguaje inclusivo.

Para que las demas clases hijas hereden los atributos del padre, se debe extender la clase hija utilizando la palabra reservada del sistema extends.
```Java
    public class AlumnoInternacional extends Alumno{
          ...
    }
```

En ese trozo de código estamos extendiendo la clase Alumno en la clase AlumnoInternacional, es decir, en AlumnoInternacional vamos a heredar todos los atributos de su clase padre
Alumno.
