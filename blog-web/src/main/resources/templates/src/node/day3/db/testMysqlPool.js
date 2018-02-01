var MysqlPool = require('./mySQLPool');

var mysqlPool = new MysqlPool();
var pool = mysqlPool.getPool();

//从连接池中获取连接
pool.getConnection(function (error, con) {
    if (error) {
        console.log("连接异常", error);
        return;
    }
    console.log("连接成功...");
    var insertSQL = "INSERT INTO blog_user (`user_name`, `pwd`, `iphone`) VALUES (?, ?, ?)";
    var param = ['onePool', 'twoPool', 'threePool'];
    con.query(insertSQL, param, function (error, rs) {
        if (error) {
            console.log("插入异常", error);
            return;
        }
        console.log("插入成功...");
        console.log(rs);
    });


    con.query("SELECT * FROM blog_user", function (error, rs, fields) {
        if (error) {
            console.log("查询异常", error);
            return;
        }
        console.log("查询成功...");
        console.log(rs);
    });

    //将连接放回连接池
    con.release();
});

