var file = require('./file.utils');

//同步写文件
file.writeFileSync("./sync.txt", "同步写文件");
console.log("1.write");

//异步写文件
file.writeFile("./asyn.txt", "异步写文件");
console.log("2.write");


//copy文件
file.copyMinFile('./gs.txt','./m1/newGs.txt');
file.copyMaxFile('./gs.txt','./m1/newGs2.txt');