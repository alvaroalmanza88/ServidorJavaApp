# ServidorJavaApp
Aplicación Cliente Servidor desarrollada en Java.
Universidad Internacional Isabel I de Castilla
Asignatura Programacion Concurrente y distribuida
Curso Tercero.

El presente codigo se ha creado con la idea de cumplir los objetivos se plantean en la actividad de la asignatura antes descrita.
Actualmente cuenta con dos aplicaciones hechas en Java, un Servidor el cual crea un socket para escuchar las conexiones
de los futuros clientes y una serie de buffers para leer la informacion transmitida

En el segundo codigo de esta  aplicacion basica cliente, la cual es capaz de conectarse al socket creado anteriormente
con la finalidad de transmitir hacia la aplicacion servidor un string. Para que estos programas cumplan con todos los requisitos
sugeridos deben estar conformados por:

App Servidor:
Crear un thread para atender las peticiones.
  i. Mostrar por pantalla que está listo para atender peticiones.
  ii. Cuando el servidor recibe mensaje, deberá:
    1. Imprimir por pantalla dicho valor.
    2. Esperar 1.5 segundos.
    3. Enviar un ACK (byte 0x05).

App Cliente
Debe aceptar dos parámetros.
  i. Parámetro 1: String con el valor de la dirección IP del
  servidor. Si servidor y cliente se ejecutan en la misma máquina,
  debe introducirse localhost.
  ii. Parámetro 2: String con el puerto de conexión al servidor.
      c. Cuando el cliente arranque deberá:
  i. Crear un thread para atender las peticiones.
  ii. Enviar datos al servidor, atendiendo a las siguientes
condiciones:
  1. Nada más arrancar deberá enviar el primer dato.
  2. No podrá volver a enviar ningún dato hasta que reciba el
      ACK (byte 0x05).
  3. Cuando reciba el ACK, podrá enviar el dato siguiente.
      d. El objetivo del cliente es enviar un fichero de texto al servidor
      leyendo el contenido del mismo. Así los datos a enviar lo
