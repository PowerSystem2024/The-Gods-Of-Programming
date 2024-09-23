
// ampliando uso de let y const
/* var puedes asignar en cualquier momento 
este forma parte deñ ambito global
un error es que se sobreescriba 
*/
var nombre = "Carina";
nombre = "Ana";
console.log(nombre);

function saludar(){
    var nombre4 = "Natalia";
    console.log(nombre4);
}
//console.log(nombre4); // no lee el dato d ela funcion

if(true){
    var edad = 34;
    console.log(edad); // en la funcion funciona correctamente , en la estructura if fallo
}
console.log(edad);

 /* let, puede ser reasignada en cualquier momento
 la diferencia es que su ammbito es de bloque,
 solo disponible dentro de un bloque de llaves
 o dentro de una funcion 
 */

 function saludar2(){
    let nombre2 ="Carolina";
    console.log(nombre2);
 }
 //console.log(nombre2);

 if(true){
    var edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);


/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/ 

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2009;
//console.log(fechaNacimiento);
