# ConsultaSelect_Personalizada_AlejandroMoles
+Este programa funciona de la siguiente manera, al ininciar se abre de primera instancia un JDialog en el cual se te pediran los datos para poder ingresar en la conexion. Una vez insertados, si estan
insertados de una manera correcta, se te abrira el JFrame principal. Si no se te cerrara el JDialog mostrando un mensaje.
Una vez dentro de el JFrame principal, se rellenara automaticamente el choice donde se encuentran los nombres de las tablas de la conexion a la que has accedido. 
Cada vez que selecciones una tabla, automaticamente se rellenará un combobox con los nombres de las columnas de dicha tabla.
Dependiendo del tipo de columna que sea, el el combobox de operadores, se rellenara con distintos operadores, si es VARCHAR2(LIKE, =) etc.
Habrá un textField llamado Valor, en el cual se insertara un dato que servira para comparar la columna seleccionada comparando con el operador seleccionado con el Valor escrito.
Habra otro textField llamado Valor2 que solo sera visible cuando en el combobox de operadores este seleccionado el operador BETWEEN.
Cuando se pierde el focus del campo Valor, se creara en un textfield de debajo la sentencia selec ya creada con todos los operadores y columnas. Esta sentencia podra ser modificada.
Si seleccionas el campo valor pero no escribes nada y pierde el focus, se generara la sentencia select pero de manera que solo muestre la tabla ejmplo(SELECT * FROM <nombre de la tabla>)
En el codigo del programa estan todos los metodos explicados detalladamente.

Esta programa funciona con la base de datos local.
