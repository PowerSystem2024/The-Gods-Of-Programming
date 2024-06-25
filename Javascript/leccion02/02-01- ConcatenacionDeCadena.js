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

