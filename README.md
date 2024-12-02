# Ejercicio -> Contador de digitos - Recursividad

Este metodo **cantidadDigitos(num)** calcula la cantidad de digitos en un numero entero positivo utilizando recursividad.

## Desglose del codigo

Declaracion del metodo:

```java
private int cantidadDigitos(int num) {

}
```

Este metodo es privado y devuelve un entero. Toma un parámetro **num** que es el numero del cual queremos contar los digitos.

Declaracion de la variable **resultado**:

```java
int resultado;
```

Se declara una variable **resultado** que almacenara el numero de digitos.

Condicion Base:

```java
if (num < 10) {
    resultado = 1;
}
```

Si **num** es menor que 10, significa que tiene solo un digito. Por lo tanto, **resultado** se establece en 1.

Caso Recursivo:

```java
else {
    num /= 10;
    resultado = 1 + cantidadDigitos(num); //Recursividad
}
```
Si **num** es 10 o mayor, se divide por 10 (eliminando el ultimo digito). Luego, se llama recursivamente al metodo **cantidadDigitos** con el nuevo valor de **num**. **resultado** se establece en 1 (por el digito eliminado) mas el resultado de la llamada recursiva.

Retorno del resultado:

```java
return resultado;
```

Finalmente, el metodo devuelve el valor de **resultado**, que es la cantidad de digitos en el numero original.