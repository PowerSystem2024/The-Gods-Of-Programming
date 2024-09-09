//creamos un array o arreglos
//let autos  = new Array('Ferrari', 'Renault', 'BMW');  esta es la sintaxis vieja para declarar una vble
const autos =['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for (let i = 0; i < autos.length; i++){
    console.log(autos[i]);
}

//mas ordenado indice : elemento
for (let i = 0; i < autos.length; i++){
    console.log(i +' : '+ autos[i]);
}

//modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

//agregamos nuevos valores al arreglo
autos.push('Audi') //agregamos al final del arreglo
console.log(autos)

//otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche'  //agregamos al final del arreglo 
console.log(autos)

//tercer forma de agregar un elemnto teniendo CUIDADO
autos[6] = 'Renault'
console.log(autos)

//como preguntar si es un array o arreglo
console.log(Array.isArray(autos)); //devuelve  un rdo booleano
console.log (autos instanceof Array); //preg si la vble es una isntancia de la clase Array




