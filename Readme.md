# GENERADOR

Proyecto de marshalling y unmarshalling de personas.

Partes de este proyecto:

1. Crear una clase base **"Persona"** y un genrador de personas aleatorias como lista de **"Personas"**.
2. Crear un **marshaller** que exporte la lista de personas a XML o JSON.
3. Crear un **unmarshaller** que importe la lista de personas desde XML o JSON a objeto Java (lista de personas).

Para crear el proyecto desde cero, en una terminal escribimos (todo junto en una línea):

```
mvn archetype:generate 
    -DgroupId=com.iesvdc.acceso 
    -DartifactId=generador 
    -DarchetypeArtifactId=maven-archetype-quickstart 
    -DinteractiveMode=false
```

Esto crea una carpeta con el nombre generador (recuerda el parámetro *-DartifactId=generador*).

## Clases Modelo

LLamamos **modelo de datos**, a la forma, al esqueleto que me sirve para manejar la información de un tipo dterminado de manera estructurada.

La clase *Persona*:

```java
class Persona{
    private String nombre;
    private String apellido;
    private String email;
    private LocalFate fechanaci;
    private List <Direccion> direcciones;
}
```

La clase *Direccion*:

```java
class Direccion{
    private String calle;
    private int numero;
    private Localidad.localidad;
}
```

La clase *Localidad*:
```java
class Localidad{
    //private String municipio;
    private String localidad;
    private int cp;
    private String provincia;
}
```