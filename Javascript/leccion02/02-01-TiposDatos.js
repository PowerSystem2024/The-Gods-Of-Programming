// Tipos de Dato en JavaScript
/*
Multiples lineas
*/
var nombre =  "Carina"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log (typeof nombre)
var numero = 12354; //Tipo numerico
console.log(numero);

var objeto = {        
    nombre: "Carina",
    apellido: "Londero",
    telefono: '35131458'
}
console.log(typeof objeto); // Tipo Objeto


// Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);

// Tipo de dato funcion

function miFuncion(){}
console.log(typeof miFuncion);

//tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);




// Tipo de dato clase (es una funcion)

class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona)


//Tipo de dato undefined

//var x;
//console.log.(typeof x);

// null: significa ausencia de valor

var y= null; //no es un tipo d dato, pero su origen es object
console.log(typeof y)
console.log(y);

// Tipo de dato array y empty string
var auto=['citroen', 'audi', 'bmw', 'ford'];
console.log(auto);
console.log(typeof auto);

var z;
console.log(z)
console.log(typeof z);























