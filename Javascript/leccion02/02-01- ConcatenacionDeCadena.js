var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre + ' '+ apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Carina'+ ' ' +'Londero';
console.log(nombreCompleto2);

var juntos = nombre + 219; // lee d izq a derecha la cadena lee el numero como str
console.log(juntos);

juntos = nombre + 78 + 17;
console.log(juntos);

juntos = nombre + (78 + 17);
console.log(juntos);

juntos = 78 + 17 + nombre; // suma y dps cadena str
console.log(juntos);

nombre += apellido;
console.log(nombre);

//hoy ya no se usa car, se usa let y const

let nombre2 = 'Gabriel';
console.log(nombre2);

const apellido2 = "Pellicer";
// apellido2 = 'Perez'; Una constante no puede ser modificada
console.log(apellido2);

let x, y; // se puede crear varias vbles dentro de una misma linea
x= 17, y = 21;// se puede asignar varias vbles dentro d una misma linea
let z = x + y; // se asigna el valor de una operacion
console.log(z);

let $1num = 31; //no podemos iniciar el nombre d una vbe con un numero 
// no podemos usar palabras reservadas ej: break
let rompimiento = 'rompe';
console.log($1num);
console.log(rompimiento);


