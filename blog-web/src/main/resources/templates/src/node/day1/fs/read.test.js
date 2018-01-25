var file = require('./file.utils');

//同步读取
file.readFileSync('./gs.txt');
console.log("1.read");

//异步读取
file.readFile('./gs.txt');
console.log("2.read");

