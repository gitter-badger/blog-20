var mysql = require('mysql');

//创建一个连接
var connection = mysql.createConnection({
    host: 'localhost',
    port: '3306',
    user: 'root',
    password: '5322',
    database: 'blog_test'
});

//开始连接
connection.connect(function (error) {
    if (error) {
        console.log("连接失败", error);
        return;
    }
    console.log("连接成功...")
});

//执行一个 insert 语句
var insertSQL = "INSERT INTO blog_user (`user_name`, `pwd`, `iphone`) VALUES (?, ?, ?)";
var param = ['one', 'two', 'three'];
connection.query(insertSQL, param, function (error, rs) {
    if (error) {
        console.log("插入数据异常", error);
        return
    }
    console.log("插入成功...", rs);
});

//执行一个 select 语句
connection.query("SELECT * FROM blog_user", function (error, rs, fields) {
    if (error) {
        console.log("查询异常", error);
        return;
    }
    console.log("查询成功...");
    console.log(rs);
    console.log(fields);
});
//关闭连接
connection.end(function (error) {
    if (error) {
        console.log("关闭连接异常", error);
        return;
    }
    console.log("连接以关闭.")
});