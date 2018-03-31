
var user = require('./user');
var u = new user();
u.id = 1;
u.name = "admin";
u.age = 18;
u.print();

var user2 = require('./user2');
u.id = 2;
u.name = "admin2";
u.age = 19;
u.print();

var teacher = require('./teacher');
var tc = new teacher(1,"数学老师",20);
tc.print();
tc.teacherPrint();

