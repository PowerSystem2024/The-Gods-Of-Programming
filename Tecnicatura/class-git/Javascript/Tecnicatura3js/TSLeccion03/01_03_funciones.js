miFuncion(8,2); // esto se le conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b));
    return a+b;
}

//llamando la function
miFuncion(5,4);

let resultado = miFuncion(6,7);
console.log(resultado);

// declaramos una funcion de tipo expresion o anonima
let x = function(a, b){ return a + b}; //necesita cierre con punto y coma
resultado= x(5, 6) // al llamarla se pone la vble y el parentesis
console.log(resultado);


//fincion de tipo self e invoking
(function(a,b){
    console.log('Ejecutando la función: ' + (a + b));
})(9, 6);


console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
}

miFuncionDos(5, 7);

//toString
var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto)

//funciones flechas
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); //asignamos el valor a una vble
console.log(resultado);

//funcion de tipo expresion
let sumar = function (a = 4, b = 8) {
    console.log(arguments[0]); // muestra el parametro de : a
    console.log(arguments[1]); 
    console.log(arguments[2])
    return a+b
}
resultado = sumar(3, 5);
console.log(resultado);
resultado = sumar(3); //podemos pasarle un solo valor, y queda indefinido el valor d b
console.log(resultado)
resultado = sumar(); 
console.log(resultado)
resultado = sumar(3, 5, 9);
console.log(resultado);
//no es necesario q coincida el numero de argumentos con parameetros

//sumar todos los argumentos
let respuesta = sumarTodo ( 5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for (let i= 0; i < arguments.length; i ++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){ //paso por valor la vble inicializada no sufre ningun cambio
    a = 20;
}
cambiarValor (k);
console.log(k);

//Paso por referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);
function cambiarValorObjeto(p1){ //paso por referencia, se modifican los valores de los atributos del objeto persona
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez'
}

cambiarValorObjeto(persona);
console.log(persona);













